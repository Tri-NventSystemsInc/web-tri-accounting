var allFactApp = angular.module('allocationFactor', [
    'jQueryFnWrapperService',
    'errorHandlerService',
    'cmnFormErrorApp',
    'utilService',
    'accountService',
    'accountFactory'
]);


allFactApp.controller('addEditFactorCtrl', ['$scope', '$stateParams', '$http',
    'accountFactory', 'modalToggler', function($scope, $stateParams, $http, accountFactory, modalToggler
        )
    {
        $scope.modalBodyTemplateUrl = "/common/account-browser";
        $scope.title = 'Create factor allocation';
        $scope.save = 'Save';
        $scope.showForm = true;

        $scope.showAccountBrowser = function () {
            if (angular.isUndefined($scope.parentAccounts) || $scope.parentAccounts.length == 0) {
                accountFactory.getAccounts()
                    .success(function (data) {
                        $scope.parentAccounts = data;
                        modalToggler.show('myModal');
                    })
                    .error(function (error) {
                        toastr.warning('Failed to load accounts.');
                    });
            }  else {
                modalToggler.show('myModal');
            }
        }

        $scope.accountSelectedFromBrowser = function (selectedAccount) {
            $scope.selectedAccount = selectedAccount;
            modalToggler.hide('myModal');
        }

    }]);
