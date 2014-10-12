var userManagementCtrls = angular.module('userManagementCtrl', ['ngResource', 'ngSanitize']);

userManagementCtrls.controller('userListCtrl', ['$scope', '$http', 'userFactory',
    function($scope,  $http, userFactory) {

    userFactory.getUsers()
            .success(function (data) {
            console.log(data);
                $scope.users = data;
            })
            .error(function (error) {
                toastr.error('Failed to load users!');
            });
}]);


userManagementCtrls.controller('addEditUserCtrl', ['$scope', '$http', 'userFactory', 'errorToElementBinder',
    function($scope,  $http, userFactory, errorToElementBinder) {
        $scope.title = 'Add user';
        $scope.save = 'Save';
        $scope.showForm = true;
        $scope.user = {};

        var resourceURI = '/user/create';

        $scope.processForm = function() {

            $scope.save ='Saving...';

            $scope.errors = {};
            $scope.submitting = true;
            $http.defaults.headers.post['X-CSRF-TOKEN'] = $('input[name=_csrf]').val();

            console.log($scope.user);
            var res = $http.post(resourceURI, $scope.user);
            res.success(function(data) {
                if (!data.success) {
                    $scope.errors = errorToElementBinder.bindToElements(data, $scope.errors);
                    $scope.save ='Save';
                    $scope.submitting = false;
                    toastr.warning('Error found.');
                } else {
                    window.location.hash = '#/user/' + data.modelId;
                    toastr.success('User successfully saved!');
                }
            });
            res.error(function(data, status, headers, config) {
                toastr.error('Something went wrong!');
                $scope.save ='Save';
                $scope.submitting = false;
            });
        }
    }]);