
var coaApp = angular.module('userManagement', [
    'ngRoute',
    'userManagementCtrl',
    'userManagementFactory'
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
            otherwise({
                redirectTo:  '/users'
            });
    }]);