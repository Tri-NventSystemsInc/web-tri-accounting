var userManagementFactory = angular.module('userManagementFactory', []);

userManagementFactory.factory('userFactory', ['$http', function($http) {
    this.getUsers = function () {
        return $http.get('/user/list');
    };
    return this;
}]);