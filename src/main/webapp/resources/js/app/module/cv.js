var cvApp = angular.module('cv', [
    'jQueryFnWrapperService',
    'errorHandlerService',
    'cmnFormErrorApp',
    'utilService'
]);

cvApp.controller('addEditCvCtrl', ['$scope', '$stateParams', '$http', 'errorToElementBinder', 'csrf',
    function($scope, $stateParams, $http, errorToElementBinder, csrf) {

        $scope.title = 'Create check voucher';
        $scope.save = 'Save';
        $scope.showForm = true;
    }]);
