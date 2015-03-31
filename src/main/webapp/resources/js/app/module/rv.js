var rvApp = angular.module('rv', [
    'jQueryFnWrapperService',
    'errorHandlerService',
    'cmnFormErrorApp',
    'utilService',
    'cmnSLEntityBrowserApp',
    'cmnItemBrowserApp'
]);

rvApp.controller('addEditRvForPOCtrl', ['$scope', '$stateParams', '$http', 'errorToElementBinder', 'csrf',
    function($scope, $stateParams, $http, errorToElementBinder, csrf) {

        $scope.signatories = [1];

        $scope.item_selection_handler1 = function(item){
            $scope.selectedItem1 = item;
        }

        $scope.req_selection_handler = function(entity){
            $scope.selectedReqOfficer = entity;
        }

        $scope.recapp_selection_handler = function(entity){
            $scope.selectedRecappOfficer = entity;
        }

        $scope.checker_selection_handler = function(entity){
            $scope.selectedCheckerOfficer = entity;
        }

        $scope.auditor_selection_handler = function(entity){
            $scope.selectedAuditorOfficer = entity;
        }

        $scope.app_selection_handler = function(entity){
            $scope.selectedAppOfficer = entity;
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

        $scope.signatories = [1];

        $scope.item_selection_handler1 = function(item){
            $scope.selectedItem1 = item;
        }

        $scope.req_selection_handler = function(entity){
            $scope.selectedReqOfficer = entity;
        }

        $scope.recapp_selection_handler = function(entity){
            $scope.selectedRecappOfficer = entity;
        }

        $scope.checker_selection_handler = function(entity){
            $scope.selectedCheckerOfficer = entity;
        }

        $scope.auditor_selection_handler = function(entity){
            $scope.selectedAuditorOfficer = entity;
        }

        $scope.app_selection_handler = function(entity){
            $scope.selectedAppOfficer = entity;
        }

        $scope.conform_selection_handler = function(entity){
            $scope.selectedConformOfficer = entity;
        }
        $scope.title = 'Create Requisition Voucher For IT';
        $scope.save = 'Save';
        $scope.showForm = true;
    }]);

rvApp.controller('addEditRvForRepCtrl', ['$scope', '$stateParams', '$http', 'errorToElementBinder', 'csrf',
    function($scope, $stateParams, $http, errorToElementBinder, csrf) {

        $scope.signatories = [1];

        $scope.item_selection_handler1 = function(item){
            $scope.selectedItem1 = item;
        }

        $scope.req_selection_handler = function(entity){
            $scope.selectedReqOfficer = entity;
        }

        $scope.recapp_selection_handler = function(entity){
            $scope.selectedRecappOfficer = entity;
        }

        $scope.checker_selection_handler = function(entity){
            $scope.selectedCheckerOfficer = entity;
        }

        $scope.auditor_selection_handler = function(entity){
            $scope.selectedAuditorOfficer = entity;
        }

        $scope.app_selection_handler = function(entity){
            $scope.selectedAppOfficer = entity;
        }
        $scope.title = 'Create Requisition Voucher For Repair';
        $scope.save = 'Save';
        $scope.showForm = true;
    }]);

rvApp.controller('addEditRvForLabCtrl', ['$scope', '$stateParams', '$http', 'errorToElementBinder', 'csrf',
    function($scope, $stateParams, $http, errorToElementBinder, csrf) {

        $scope.signatories = [1];

        $scope.req_selection_handler = function(entity){
            $scope.selectedReqOfficer = entity;
        }

        $scope.recapp_selection_handler = function(entity){
            $scope.selectedRecappOfficer = entity;
        }

        $scope.checker_selection_handler = function(entity){
            $scope.selectedCheckerOfficer = entity;
        }

        $scope.auditor_selection_handler = function(entity){
            $scope.selectedAuditorOfficer = entity;
        }

        $scope.app_selection_handler = function(entity){
            $scope.selectedAppOfficer = entity;
        }
        $scope.title = 'Create Requisition Voucher For Labor';
        $scope.save = 'Save';
        $scope.showForm = true;
    }]);