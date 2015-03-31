var mrctToMIRApp = angular.module('mrctToMIR', [
    'jQueryFnWrapperService',
    'errorHandlerService',
    'cmnFormErrorApp',
    'cmnMRCTBrowserApp',
    'utilService'
]);

mrctToMIRApp.controller('mrctToMIRCtrl', ['$scope', '$stateParams', '$http', 'errorToElementBinder', 'csrf', 'mrctFactory',
    function($scope, $stateParams, $http, errorToElementBinder, csrf, mrctFactory) {

        $scope.title = 'Select MRCT to be posted to MIR';
        $scope.save = 'Save';
        $scope.showForm = true;
        $scope.selectedItemData = {};
        $scope.showModal = false;

        $scope.select_item_handler = function(item){

            $scope.selectedItemData = item;

            $scope.showModal = true;

        };

        $scope.mrctList = mrctFactory.getMRCTList1();

    }]);