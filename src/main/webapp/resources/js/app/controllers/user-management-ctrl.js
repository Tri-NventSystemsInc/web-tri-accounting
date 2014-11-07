var userManagementCtrls = angular.module('userManagementCtrl', ['ngResource', 'ngSanitize']);

userManagementCtrls.controller('userListCtrl', ['$scope', '$http', 'userFactory',
    function($scope,  $http, userFactory) {

        userFactory.getUsers()
            .success(function (data) {
                $scope.users = data;
            })
            .error(function (error) {
                toastr.error('Failed to load users!');
            });
    }]);

userManagementCtrls.controller('addEditUserCtrl', ['$scope', '$routeParams', '$http', 'userFactory', 'errorToElementBinder',
    'roleFactory', 'csrf',
    function($scope, $routeParams, $http, userFactory, errorToElementBinder, roleFactory, csrf) {

        $scope.title = 'Add user';
        $scope.save = 'Save';
        $scope.showForm = true;

        $scope.user = {};
        $scope.roles = [];

        var resourceURI = '/user/create';

        roleFactory.getRoles()
            .success(function (data) {
                $scope.roles = data;
            })
            .error(function (error) {
                toastr.error('Failed to load roles.');
            });

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

                        // roles
                        angular.forEach(data.roles, function(role, key) {
                            $scope.checkAssignedRole(role.id);
                        });

                        $scope.showForm = true;
                    }
                })
                .error(function (error) {
                    toastr.warning('User not found!');
                    window.location.hash = '#/users';
                });

            resourceURI = '/user/update';
        }

        $scope.checkAssignedRole = function (roleId) {
            angular.forEach($scope.roles, function(role, key) {
                if (role.id == roleId) {
                    role.selected = true;
                    $scope.roles[key] = role;
                    return;
                }
            });
        }

        $scope.processForm = function() {

            $scope.save ='Saving...';

            $scope.errors = {};
            $scope.submitting = true;
            csrf.setCsrfToken();

            var userRoles = [];
            var roles = angular.copy($scope.roles);
            angular.forEach(roles, function(role, key) {
                if (role.selected) {
                    delete role['selected']; // hibernate will complain, so delete it
                    userRoles.push(role);
                }
            });

            $scope.user.roles = userRoles;
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
                toastr.warning('User not found!');
                window.location.hash = '#/users';
            });

    } else {
        toastr.warning('User not found!');
        window.location.hash = '#/users';
    }

    $scope.pointToEditForm = function() {
        window.location.hash = '#/user/' + $scope.userId + "/edit";
    }
}]);

userManagementCtrls.controller('roleListCtrl', ['$scope', '$http','roleFactory', function($scope,  $http, roleFactory) {

    roleFactory.getRoles()
        .success(function (data) {
            $scope.roles = data;
        })
        .error(function (error) {
            toastr.error('Failed to load roles.');
        });
}]);

userManagementCtrls.controller('roleDetailsCtrl', ['$scope', '$routeParams', '$http', 'roleFactory',
    function($scope,  $routeParams, $http, roleFactory) {

    $scope.showDetails = false;

    if(!($routeParams.roleId === undefined)) {
        $scope.title = 'Role details';

        $scope.roleId = $routeParams.roleId;

        roleFactory.getRole($scope.roleId)
            .success(function (data) {

                console.log(data);

                if (data === '' || data.id <= 0) {    // not found
                    toastr.warning('Role not found!');
                    window.location.hash = '#/users';
                } else {
                    $scope.role = data;
                    $scope.showDetails = true;
                }
            })
            .error(function (error) {
                toastr.warning('Role not found!');
                window.location.hash = '#/users';
            });

    } else {
        toastr.warning('Role not found!');
        window.location.hash = '#/users';
    }

    $scope.pointToEditForm = function() {
        window.location.hash = '#/role/' + $scope.roleId + "/edit";
    }
}]);

userManagementCtrls.controller('addEditRoleCtrl', ['$scope', '$routeParams', '$http', 'roleFactory', 'errorToElementBinder',
    'csrf',
    function($scope, $routeParams, $http, roleFactory, errorToElementBinder, csrf) {

    $scope.title = 'Add role';
    $scope.save = 'Save';
    $scope.showForm = true;

    $scope.role = {};

    var resourceURI = '/role/create';

    if(!($routeParams.roleId === undefined)) {

        $scope.title = 'Update role';
        $scope.showForm = false;

        $scope.roleId = $routeParams.roleId;

        roleFactory.getRole($scope.roleId)
            .success(function (data) {

                console.log(data);

                if (data === '' || data.id <= 0) {    // not found
                    window.location.hash = '#/role/' + $scope.roleId;
                } else {
                    $scope.role = data;
                    $scope.showForm = true;
                }
            })
            .error(function (error) {
                toastr.warning('Role not found!');
                window.location.hash = '#/users';
            });

        resourceURI = '/role/update';
    }

    $scope.processForm = function() {

        $scope.save ='Saving...';

        $scope.errors = {};
        $scope.submitting = true;
        csrf.setCsrfToken();

        var res = $http.post(resourceURI, $scope.role);
        res.success(function(data) {
            if (!data.success) {
                $scope.errors = errorToElementBinder.bindToElements(data, $scope.errors);
                $scope.save ='Save';
                $scope.submitting = false;
                toastr.warning('Error found.');
            } else {
                window.location.hash = '#/role/' + data.modelId;
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