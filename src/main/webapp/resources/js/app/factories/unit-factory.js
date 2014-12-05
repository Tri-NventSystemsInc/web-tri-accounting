var unitFactory = angular.module('unitFactory', []);

unitFactory.factory('unitFactory', ['$http', function($http) {
    this.getUnits = function () {
        return $http.get('/unit/list/');
    };
    return this;
}]);