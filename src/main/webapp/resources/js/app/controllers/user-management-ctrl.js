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


userManagementCtrls.controller('addEditUserCtrl', ['$scope', '$routeParams', '$http', 'userFactory', 'errorToElementBinder',
    function($scope, $routeParams, $http, userFactory, errorToElementBinder) {

        $scope.title = 'Add user';
        $scope.save = 'Save';
        $scope.showForm = true;

        $scope.user = {};

        var resourceURI = '/user/create';

        if(!($routeParams.userId === undefined)) {  // update mode
            $scope.title = 'Update user';
            $scope.showForm = false;

            $scope.userId = $routeParams.userId;

            userFactory.getUser($scope.userId)
                .success(function (data) {

                    console.log(data);

                    if (data === '' || data.id <= 0) {    // not found
                        window.location.hash = '#/user/' + $scope.userId;
                    } else {
                        $scope.user = data;
                        $scope.user.password = "";
                        $scope.showForm = true;
                    }
                })
                .error(function (error) {
                    toastr.warning('User not found!');
                    window.location.hash = '#/users';
                });

            resourceURI = '/user/update';
        }

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

userManagementCtrls.controller('userDetailsCtrl', ['$scope', '$routeParams', '$http', 'userFactory',
    function($scope,  $routeParams, $http, userFactory) {

        $scope.showDetails = false;

        if(!($routeParams.userId === undefined)) {
            $scope.title = 'User details';

            $scope.userId = $routeParams.userId;
            
            userFactory.getUser($scope.userId)
                .success(function (data) {

                    console.log(data);

                    if (data === '' || data.id <= 0) {    // not found
                        toastr.warning('User not found!');
                        window.location.hash = '#/users';
                    } else {
                        $scope.user = data;
                        $scope.showDetails = true;
                    }
                })
                .error(function (error) {
                    toastr.warning('Account not found!');
                    window.location.hash = '#/accounts';
                });

        } else {
            toastr.warning('User not found!');
            window.location.hash = '#/users';
        }

        $scope.pointToEditForm = function() {
            window.location.hash = '#/user/' + $scope.userId + "/edit";
        }
    }]);