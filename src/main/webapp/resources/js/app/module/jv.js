/**
 * Created by TSI Admin on 3/23/2015.
 */
var jvApp = angular.module('jv', [
    'jQueryFnWrapperService',
    'errorHandlerService',
    'cmnFormErrorApp',
    'utilService'
]);

jvApp.controller('addEditJVCtrl', ['$scope', '$stateParams', '$http', 'errorToElementBinder', 'csrf',
    function($scope, $stateParams, $http, errorToElementBinder, csrf) {

        $scope.title = 'Create journal voucher';
        $scope.save = 'Save';
        $scope.showForm = true;
    }]);
