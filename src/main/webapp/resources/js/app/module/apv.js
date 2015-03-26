var apvApp = angular.module('apv', [
    'jQueryFnWrapperService',
    'errorHandlerService',
    'cmnFormErrorApp',
    'cmnSLEntityBrowserApp',
    'utilService'
]);

apvApp.controller('addEditApvCtrl', ['$scope', '$stateParams', '$http', 'errorToElementBinder', 'csrf',
    function($scope, $stateParams, $http, errorToElementBinder, csrf) {

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
        $scope.title = 'Create accounts payable voucher';
        $scope.save = 'Save';
        $scope.showForm = true;
        var resourceURI = '/apv/create';

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

    }]);
