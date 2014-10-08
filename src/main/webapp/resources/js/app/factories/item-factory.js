var itemFactory = angular.module('itemFactory', []);

itemFactory.factory('itemFactory', ['$http', function($http) {
    this.getItems = function () {
        return $http.get('/item/list/');
    };
    return this;
}]);