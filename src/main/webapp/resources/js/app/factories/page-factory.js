var pageFactory = angular.module('pageFactory', []);

pageFactory.factory('pageFactory', ['$http', function($http) {
    this.getPages = function () {
        return $http.get('/json/pages');
    };

    this.getPageComponents = function (pageId) {
        return $http.get('/json/page-components/' + pageId);
    };

    return this;
}]);