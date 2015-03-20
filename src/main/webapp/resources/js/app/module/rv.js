var rvApp = angular.module('rv', [
    'jQueryFnWrapperService',
    'errorHandlerService',
    'cmnFormErrorApp',
    'utilService',
    'cmnItemBrowserApp'
]);

rvApp.controller('addEditRvForPOCtrl', ['$scope', '$stateParams', '$http', 'errorToElementBinder', 'csrf',
    function($scope, $stateParams, $http, errorToElementBinder, csrf) {
        $scope.item_selection_handler1 = function(item){
            $scope.selectedItem1 = item;
        }
        $scope.title = 'Create Requisition Voucher For PO';
        $scope.save = 'Save';
        $scope.showForm = true;
    }]);

rvApp.controller('addEditRvForITCtrl', ['$scope', '$stateParams', '$http', 'errorToElementBinder', 'csrf',
    function($scope, $stateParams, $http, errorToElementBinder, csrf) {
        $scope.item_selection_handler1 = function(item){
            $scope.selectedItem1 = item;
        }
        $scope.title = 'Create Requisition Voucher For IT';
        $scope.save = 'Save';
        $scope.showForm = true;
    }]);

rvApp.controller('addEditRvForRepCtrl', ['$scope', '$stateParams', '$http', 'errorToElementBinder', 'csrf',
    function($scope, $stateParams, $http, errorToElementBinder, csrf) {
        $scope.item_selection_handler1 = function(item){
            $scope.selectedItem1 = item;
        }
        $scope.title = 'Create Requisition Voucher For Repair';
        $scope.save = 'Save';
        $scope.showForm = true;
    }]);

rvApp.controller('addEditRvForLabCtrl', ['$scope', '$stateParams', '$http', 'errorToElementBinder', 'csrf',
    function($scope, $stateParams, $http, errorToElementBinder, csrf) {

        $scope.title = 'Create Requisition Voucher For Labor';
        $scope.save = 'Save';
        $scope.showForm = true;
    }]);