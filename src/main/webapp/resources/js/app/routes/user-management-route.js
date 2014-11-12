
var coaApp = angular.module('userManagement', [
    'ngRoute',
    'userManagementCtrl',
    'userManagementFactory',
    'roleFactory',
    'errorHandlerService',
    'jQueryFnWrapperService',
    'menuFactory',
    'cmnFormErrorApp'
]);

coaApp.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/users', {
                templateUrl: 'user/user-list-page'
            }).
            when('/new', {
                templateUrl: 'user/new-user-page'
            }).
            when('/user/:userId', {
                templateUrl: 'user/user-details-page',
                controller: 'userDetailsCtrl'
            }).
            when('/user/:userId/edit', {
                templateUrl: 'user/new-user-page'
            }).
            when('/new-role', {
                templateUrl: 'user/new-role-page',
                controller: 'addEditRoleCtrl'
            }).
            when('/role/:roleId', {
                templateUrl: 'user/role-details-page',
                controller: 'roleDetailsCtrl'
            }).
            when('/role/:roleId/edit', {
                templateUrl: 'user/new-role-page',
                controller: 'addEditRoleCtrl'
            }).
            otherwise({
                redirectTo:  '/users'
            });
    }]);