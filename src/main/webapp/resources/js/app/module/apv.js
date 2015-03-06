var apvApp = angular.module('apv', [
    'jQueryFnWrapperService',
    'errorHandlerService',
    'cmnFormErrorApp',
    'utilService'
]);

apvApp.controller('addEditApvCtrl', ['$scope', '$stateParams', '$http', 'errorToElementBinder', 'csrf',
    function($scope, $stateParams, $http, errorToElementBinder, csrf) {

        $scope.title = 'Create accounts payable voucher';
        $scope.save = 'Save';
        $scope.showForm = true;
    }]);
