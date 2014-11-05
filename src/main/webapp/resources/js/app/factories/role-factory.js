var roleFactory = angular.module('roleFactory', []);

roleFactory.factory('roleFactory', ['$http', function($http) {
    this.getRoles = function () {
        return $http.get('/role/list/');
    };
    return this;
}]);