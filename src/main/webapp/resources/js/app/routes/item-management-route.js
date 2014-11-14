
var supApp = angular.module('itemManagement', [
    'ngRoute',
    'cmnAccountBrowserWithSegmentApp',
    'itemManagementCtrl',
    'jQueryFnWrapperService',
    'itemFactory',
    'errorHandlerService',
    'cmnFormErrorApp'
]);

supApp.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/items', {
                templateUrl: 'item/item-list-page',
                controller: 'itemListCtrl'
            }).
            when('/new', {
                templateUrl: 'item/new-item-page'
            }).
            when('/item/:itemId', {
                templateUrl: 'item/item-details-page',
                controller: 'itemDetailsCtrl'
            }).
            when('/item/:itemId/edit', {
                templateUrl: 'item/new-item-page'
            }).
            otherwise({
                redirectTo: '/items'
            })
    }]);