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
        $scope.businessSegments = [
            {'id':1, 'description':'Distribution Connection Services'},
            {'id':2, 'description':'Regulated Retail Services', 'factor':15},
            {'id':3, 'description':'Related Businesses', 'factor':25},
            {'id':4, 'description':'Supplier of Last Resort', 'factor':25},
            {'id':5, 'description':'Supply Service', 'factor':20}
        ];

        $scope.modalBodyTemplateUrl = "/common/account-browser";
        $scope.title = 'Create factor allocation';
        $scope.save = 'Save';
        $scope.showForm = true;

        $scope.checkSum = function(newFactorObj, oldFactor) {
            var sum = $scope.getPercentageSum();
            if (sum > 100) {
                newFactorObj.factor = parseFloat(oldFactor);
            }
        }
        $scope.getPercentageSum = function() {
            var percentageSum = 0;
            angular.forEach($scope.businessSegments, function(value, key) {
                percentageSum += value.factor;
            }, percentageSum);

            return percentageSum;
        }

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
