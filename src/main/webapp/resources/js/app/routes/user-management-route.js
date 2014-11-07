
var coaApp = angular.module('userManagement', [
    'ngRoute',
    'userManagementCtrl',
    'userManagementFactory',
    'roleFactory',
    'errorHandlerService'
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
            otherwise({
                redirectTo:  '/users'
            });
    }]);