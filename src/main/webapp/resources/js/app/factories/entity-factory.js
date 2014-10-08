var entityFactory = angular.module('entityFactory', []);

entityFactory.factory('entityFactory', ['$http', function($http) {
    this.getEntities = function () {
        return $http.get('/json/entities/');
    };
    return this;
}]);