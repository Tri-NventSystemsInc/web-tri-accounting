var poApp = angular.module('po', [
    'jQueryFnWrapperService',
    'errorHandlerService',
    'cmnFormErrorApp',
    'cmnSLEntityBrowserApp',
    'utilService'
]);

poApp.controller('addEditPoCtrl', ['$scope', '$stateParams', '$http', 'errorToElementBinder', 'csrf',
    function($scope, $stateParams, $http, errorToElementBinder, csrf) {
        $scope.suppliers = [1,2];


        $scope.supplier_selection_handler = function(entity){
            $scope.selectedSupplier = entity;
        }
        $scope.title = 'Create Purchase Order';
        $scope.save = 'Save';
        $scope.showForm = true;
    }]);