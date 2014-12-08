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

checkApp.controller('addEditCheckCtrl', ['$scope', '$stateParams', '$http', 'itemFactory', 'errorToElementBinder',
    'csrf',
    function($scope, $stateParams, $http, itemFactory, errorToElementBinder, csrf) {

        $scope.units = [
            {id:1, code: 'M', description: 'Meter'},
            {id:2, code: 'PCS', description: 'Pieces'}
        ];
        $scope.title = 'Add check';
        $scope.save = 'Save';
        $scope.showForm = true;

        $scope.item = {};
        $scope.unit = {};
        $scope.submit = false;

        var resourceURI = '/item/create';
        if(!($stateParams.itemId === undefined)) {  // update mode
            $scope.title = 'Update check';
            $scope.showForm = false;

            $scope.itemId = $stateParams.itemId;

            itemFactory.getItem($scope.itemId).success(function (data) {
                if (data === '' || data.id <= 0) {    // not found
                    window.location.hash = '#/items';
                } else {
                    $scope.item = data;
                    $scope.unit = data.unit;
                    try{
                        $scope.selectedAccount = $scope.item.segmentAccount.accountCode + ' ' + $scope.item.segmentAccount.account.title;
                    }catch (e) {}

                    $scope.showForm = true;
                }
            })
                .error(function (error) {
                    toastr.warning('Item not found!');
                    window.location.hash = '#/items';
                });

            resourceURI = '/item/update';
        }


        $scope.processForm = function() {

            if (!$scope.submit) return; // check if save button is clicked

            $scope.save ='Saving...';

            $scope.errors = {};
            $scope.submitting = true;
            csrf.setCsrfToken();

            $scope.item.unit = $scope.unit;

            console.log($scope.item);

            var res = $http.post(resourceURI, $scope.item);

            res.success(function(data) {

                if (!data.success) {
                    $scope.errors = errorToElementBinder.bindToElements(data, $scope.errors);
                    $scope.save ='Save';
                    // flags
                    $scope.submitting = false;
                    $scope.submit = false;
                    toastr.warning('Error found.');
                } else {
                    window.location.hash = '#/items/detail/' + data.modelId;
                    toastr.success('Item successfully saved!');
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

        $scope.accounts_selection_handler = function(sa){
            var segmentAccount = {};
            segmentAccount['id'] =  sa.segmentAccountId;
            $scope.item.segmentAccount = segmentAccount;
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