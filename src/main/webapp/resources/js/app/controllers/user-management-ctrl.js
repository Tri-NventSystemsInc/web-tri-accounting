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


userManagementCtrls.controller('addEditUserCtrl', ['$scope', '$http', 'userFactory',
    function($scope,  $http, userFactory) {
        $scope.title = 'Add user';
        $scope.save = 'Save';
        $scope.showForm = true;
        $scope.user = {};

    }]);