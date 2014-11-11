
var app = angular.module('supplierManagement', [
    'ngRoute',
    'supplierManagementCtrl',
    'supplierFactory',
    'errorHandlerService',
    'jQueryFnWrapperService'
]);

app.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/suppliers', {
                templateUrl: 'supplier/supplier-list-page'
            }).
            when('/new', {
                templateUrl: 'supplier/new-supplier-page'
            }).
            when('/supplier/:supplierId', {
                templateUrl: 'supplier/supplier-details-page',
                controller: 'supplierDetailsCtrl'
            }).
            when('/supplier/:supplierId/edit', {
                templateUrl: 'supplier/new-supplier-page'
            }).
            otherwise({
                redirectTo:  '/suppliers'
            });
    }]);