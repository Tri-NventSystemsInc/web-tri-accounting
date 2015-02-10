var unitOfMeasureApp = angular.module('unit', [
    'unitFactory',
    'jQueryFnWrapperService',
    'errorHandlerService',
    'cmnFormErrorApp',
    'utilService'
]);



unitOfMeasureApp.controller('unitListCtrl', ['$scope', '$http', 'unitFactory', function($scope,  $http, unitFactory) {

    unitFactory.getUnits()
            .success(function (data) {
                $scope.units = data;
            })
            .error(function (error) {
                toastr.error('Failed to load units!');
            });
}]);
