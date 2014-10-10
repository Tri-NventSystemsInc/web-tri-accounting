
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
            otherwise({
                redirectTo:  '/users'
            });
    }]);