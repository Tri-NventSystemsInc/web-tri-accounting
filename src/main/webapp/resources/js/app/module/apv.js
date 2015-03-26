var apvApp = angular.module('apv', [
    'jQueryFnWrapperService',
    'errorHandlerService',
    'cmnFormErrorApp',
    'cmnSLEntityBrowserApp',
    'utilService'
]);

apvApp.controller('addEditApvCtrl', ['$scope', '$stateParams', '$http', 'errorToElementBinder', 'csrf', 'voucherUtil',
    function($scope, $stateParams, $http, errorToElementBinder, csrf, voucherUtil) {

        $scope.suppliers = [1,2];
        $scope.signatories = [1];


        $scope.supplier_selection_handler = function(entity){
            $scope.selectedSupplier = entity;
        }
        $scope.checker_selection_handler = function(entity){
            $scope.selectedChecker = entity;
        }

        $scope.approvar_selection_handler = function(entity){
            $scope.selectedApprovingOfficer = entity;
        }

        $scope.apv = {};
        $scope.journalEntries = [
            {"account": {"id":1, "segmentAccountCode": "D1-232-323-00", "description": "Office supplier 1"}, "debit": 100.00, "credit": 0},
            {"account": {"id":2, "segmentAccountCode": "D2-232-323-10", "description": "Office supplier 2"}, "debit": 100.00, "credit": 0},
            {"account": {"id":3, "segmentAccountCode": "D4-232-323-20", "description": "Office supplier 3"}, "debit": 100.00, "credit": 0}
        ];
        $scope.title = 'Create accounts payable voucher';
        $scope.save = 'Save';
        $scope.showForm = true;

        $scope.journalTotals = {"debit" : 0, "credit" : 0};

        var resourceURI = '/apv/create';

        // load journal entries
        if ($scope.journalEntries.length > 0) {
            $scope.journalTotals = voucherUtil.calculateJournalTotals($scope.journalEntries);
        }

        $scope.processForm = function() {
            if (!$scope.submit) return; // check if save button is clicked

            $scope.save ='Saving...';

            $scope.errors = {};
            $scope.submitting = true;
            csrf.setCsrfToken();

            var res = $http.post(resourceURI, $scope.item);

            res.success(function(data) {

                if (data.notAuthorized) {
                    toastr.error(data.messages[0]);
                    window.location = '/#/accounts-payable';
                } else if (!data.success) {
                    $scope.errors = errorToElementBinder.bindToElements(data, $scope.errors);
                    $scope.save ='Save';
                    // flags
                    $scope.submitting = false;
                    $scope.submit = false;
                    toastr.warning('Error found.');
                } else {
//                    window.location.hash = '#/items/' + data.modelId + '/detail';
                    window.location.hash = '/#/accounts-payable';
                    toastr.success('APV successfully saved!');
                }
            });
            res.error(function(data, status, headers, config) {
                toastr.error('Something went wrong!');
                $scope.save ='Save';
                // flags
                $scope.submitting = false;
                $scope.submit = false;
            });
        }

        $scope.updateTotal = function(newAmount, oldAmount) {
            if (isNaN(newAmount)) {
                toastr.warning("Entered amount is invalid!");
            } else {
                $scope.journalTotals  = voucherUtil.calculateJournalTotals($scope.journalEntries);
            }
        }
    }]);
