var unitFactory = angular.module('pageFactory', []);

unitFactory.factory('pageFactory', ['$http', function($http) {
    this.getUnits = function () {
        return $http.get('/unit/list/');
    };

    this.getUnit = function (id) {
        return $http.get('/unit/'+id);
    };
    return this;
}]);