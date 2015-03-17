var rvApp = angular.module('cnvs', [
    'jQueryFnWrapperService',
    'errorHandlerService',
    'cmnFormErrorApp',
    'cmnSLEntityBrowserApp',
    'utilService'
]);

rvApp.controller('addEditCnvsCtrl', ['$scope', '$stateParams', '$http', 'errorToElementBinder', 'csrf',
    function($scope, $stateParams, $http, errorToElementBinder, csrf) {
        $scope.suppliers = [1,2];


        $scope.supplier_selection_handler = function(entity){
            $scope.selectedSupplier = entity;
        }
        $scope.title = 'Create Canvass';
        $scope.save = 'Save';
        $scope.showForm = true;
    }]);