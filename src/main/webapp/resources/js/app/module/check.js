var checkApp = angular.module('check', [
    'cmnAccountBrowserWithSegmentApp',
    'checkFactory',
    'jQueryFnWrapperService',
    'errorHandlerService',
    'cmnFormErrorApp',
    'utilService'
]);


checkApp.controller('checkListCtrl', ['$scope', '$http', 'checkFactory', function($scope,  $http, checkFactory) {

        checkFactory.getChecks().success(function (data) { $scope.configs = data; });

}]);

checkApp.controller('addEditCheckCtrl', ['$scope', '$stateParams', '$http', 'checkFactory', 'errorToElementBinder',
    'csrf',
    function($scope, $stateParams, $http, checkFactory, errorToElementBinder, csrf) {

        $scope.title = 'Add check';
        $scope.save = 'Save';
        $scope.showForm = true;

        $scope.check = {};

        var resourceURI = '/check/create';

        if(!($stateParams.checkId === undefined)) {  // update mode
            $scope.title = 'Update check';
            $scope.showForm = false;

            $scope.checkId = $stateParams.checkId;

            checkFactory.getCheck($scope.checkId).success(function (data) {
                if (data === '' || data.id <= 0) {    // not found
                    window.location.hash = '#/checks';
                } else {
                    console.log(data);
                    $scope.check = data;
                    try{
                        $scope.selectedAccount = $scope.check.bankSegmentAccount.accountCode + ' ' + $scope.check.bankSegmentAccount.account.title;
                    }catch (e) {}

                    $scope.showForm = true;
                }
            })
                .error(function (error) {
                    toastr.warning('Item not found!');
                    window.location.hash = '#/checks';
                });

            resourceURI = '/check/update';
        }


        $scope.processForm = function() {

            $scope.save ='Saving...';

            $scope.errors = {};
            $scope.submitting = true;
            csrf.setCsrfToken();

             console.log($scope.check);

            var res = $http.post(resourceURI, $scope.check);

            res.success(function(data) {

                if (!data.success) {
                    $scope.errors = errorToElementBinder.bindToElements(data, $scope.errors);
                    $scope.save ='Save';
                    // flags
                    $scope.submitting = false;
                    toastr.warning('Error found.');
                } else {
                    window.location.hash = '#/checks/' + data.modelId + '/detail';
                    toastr.success('Item successfully saved!');
                }
            });
            res.error(function(data, status, headers, config) {
                toastr.error('Something went wrong!');
                $scope.save ='Save';
                // flags
                $scope.submitting = false;
            });
        }

        $scope.accounts_selection_handler = function(sa){
            var segmentAccount = {};
            segmentAccount['id'] =  sa.segmentAccountId;
            $scope.check.bankSegmentAccount = segmentAccount;
            $scope.selectedAccount = sa.segmentAccountCode + ' ' + sa.title;
        }
    }]);

checkApp.controller('checkDetailsCtrl', ['$scope', '$state', '$stateParams', '$http', 'checkFactory', 'routeUtil',
    function($scope, $state, $stateParams, $http, checkFactory, routeUtil) {

        $scope.main = function() {
            routeUtil.gotoMain($state);
        }

        $scope.showDetails = false;

        if(!($stateParams.checkId === undefined)) {
            $scope.title = 'Check details';

            $scope.checkId = $stateParams.checkId;

            checkFactory.getCheck( $scope.checkId) .success(function (data) {

                if (data === '' || data.id <= 0) {    // not found
                    toastr.warning('Check not found!');
                    window.location.hash = '#/checks';
                } else {
                    $scope.check = data;
                    $scope.showDetails = true;
                }
            });
        } else {
            toastr.warning('Check not found!');
            window.location.hash = '#/checks';
        }
    }]);