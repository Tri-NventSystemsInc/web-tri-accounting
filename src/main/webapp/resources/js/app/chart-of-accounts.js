// get application's base URL
var baseURL = document.location.origin + document.location.pathname;
var coaApp = angular.module('coaApp', [
    'ngRoute',
    'coaControllers'
]);

coaApp.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/accounts', {
                templateUrl: 'coa/accounts-tree-page',
                controller: 'accountTreeController'
            }).
            otherwise({
                redirectTo:  '/accounts'
            });
    }]);