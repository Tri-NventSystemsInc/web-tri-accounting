var userManagementFactory = angular.module('userManagementFactory', []);

userManagementFactory.factory('userFactory', ['$http', function($http) {
    this.getUsers = function () {
        return $http.get('/user/list');
    };

    this.getUser = function (userId) {
        return $http.get('/user/'+userId);
    };
    return this;
}]);