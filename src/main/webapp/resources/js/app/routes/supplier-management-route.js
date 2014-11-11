
var supApp = angular.module('supplierManagement', [
    'ngRoute',
    'supplierManagementCtrl',
    'jQueryFnWrapperService',
    'supplierFactory',
    'errorHandlerService'
]);

supApp.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/suppliers', {
                templateUrl: 'supplier/supplier-list-page',
                controller: 'supplierListCtrl'
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
                redirectTo: '/suppliers'
            })
    }]);