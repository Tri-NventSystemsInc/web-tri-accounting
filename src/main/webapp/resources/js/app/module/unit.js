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

unitOfMeasureApp.controller('unitDetailsCtrl', ['$scope', '$state', '$stateParams', '$http', 'unitFactory', 'routeUtil',
    function($scope, $state, $stateParams, $http, unitFactory, routeUtil) {

        $scope.main = function() {
            routeUtil.gotoMain($state);
        }

        $scope.showDetails = false;

        if(!($stateParams.unitId === undefined)) {
            $scope.title = 'Unit details';

            $scope.unitId = $stateParams.unitId;

            unitFactory.getUnit( $scope.unitId)
                .success(function (data) {

                    if (data === '' || data.id <= 0) {    // not found
                        toastr.warning('Unit found!');
                        window.location.hash = '#/unit-measures';
                    } else {
                        $scope.unit = data;
                        $scope.showDetails = true;
                    }
                });
        } else {
            toastr.warning('Unit not found!');
            window.location.hash = '#/unit-measures';
        }

        $scope.pointToEditForm = function() {
            window.location.hash = '#/unit-measures/' + $scope.unitId + "/edit";
        }
    }]);
