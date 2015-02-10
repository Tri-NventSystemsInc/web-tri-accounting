var unitOfMeasureApp = angular.module('unit', [
    'jQueryFnWrapperService',
    'errorHandlerService',
    'cmnFormErrorApp',
    'utilService'
]);



unitOfMeasureApp.controller('unitListCtrl', ['$scope', '$http',  function($scope,  $http) {
    $scope.units = {};
}]);
