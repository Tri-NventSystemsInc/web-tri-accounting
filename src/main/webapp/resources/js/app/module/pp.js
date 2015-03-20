var ppApp = angular.module('pp', [
    'jQueryFnWrapperService',
    'errorHandlerService',
    'cmnFormErrorApp',
    'cmnAccountBrowserWithSegmentApp',
    'utilService'
]);

ppApp.controller('addEditPpCtrl', ['$scope', '$stateParams', '$http', 'errorToElementBinder', 'csrf',
    function($scope, $stateParams, $http, errorToElementBinder, csrf) {

        $scope.accounts_selection_handler = function(account){
            $scope.selectedAccount = account;
        }
        $scope.title = 'Create Prepayment';
        $scope.save = 'Save';
        $scope.showForm = true;
    }]);