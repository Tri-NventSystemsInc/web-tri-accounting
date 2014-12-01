var itemApp = angular.module('item', [
    'cmnAccountBrowserWithSegmentApp',
    'jQueryFnWrapperService',
    'itemFactory',
    'errorHandlerService',
    'cmnFormErrorApp'
]);


itemApp.controller('itemListCtrl', ['$scope', '$http', 'itemFactory',
    function($scope,  $http, itemFactory) {

            itemFactory.getItems()
                .success(function (data) {
                    $scope.items = data;
                    console.log(data);
                })
                .error(function (error) {
                    toastr.error('Failed to load items!');
                });
    }]);

//itemApp.controller('addEditItemCtrl', ['$scope', '$routeParams', '$http', 'itemFactory', 'errorToElementBinder',
//    'csrf',
//    function($scope, $routeParams, $http, itemFactory, errorToElementBinder, csrf) {
//
//        $scope.title = 'Add item';
//        $scope.save = 'Save';
//        $scope.showForm = true;
//
//        $scope.item = {};
//
//        var resourceURI = '/item/create';
//        if(!($routeParams.itemId === undefined)) {  // update mode
//            $scope.title = 'Update item';
//            $scope.showForm = false;
//
//            $scope.itemId = $routeParams.itemId;
//
//            itemFactory.getItem($scope.itemId).success(function (data) {
//                if (data === '' || data.id <= 0) {    // not found
//                    window.location.hash = '#/items';
//                } else {
//                    $scope.item = data;
//                    $scope.selectedAccount = $scope.item.segmentAccount.accountCode + ' ' + $scope.item.segmentAccount.account.title;
//
//                    $scope.showForm = true;
//                }
//            })
//                .error(function (error) {
//                    toastr.warning('Item not found!');
//                    window.location.hash = '#/items';
//                });
//
//            resourceURI = '/item/update';
//        }
//
//
//        $scope.processForm = function() {
//
//            $scope.save ='Saving...';
//
//            $scope.errors = {};
//            $scope.submitting = true;
//            csrf.setCsrfToken();
//
//            console.log($scope.item);
//
//            var res = $http.post(resourceURI, $scope.item);
//            res.success(function(data) {
//                if (!data.success) {
//                    $scope.errors = errorToElementBinder.bindToElements(data, $scope.errors);
//                    $scope.save ='Save';
//                    $scope.submitting = false;
//                    toastr.warning('Error found.');
//                } else {
//                    window.location.hash = '#/item/' + data.modelId;
//                    toastr.success('Item successfully saved!');
//                }
//            });
//            res.error(function(data, status, headers, config) {
//                toastr.error('Something went wrong!');
//                $scope.save ='Save';
//                $scope.submitting = false;
//            });
//        }
//
//        $scope.accounts_selection_handler = function(segmentAccount){
//            $scope.item.segmentAccount = segmentAccount;
//            $scope.selectedAccount = segmentAccount.accountCode + ' ' + segmentAccount.account.title;
//        }
//    }]);
//
//itemApp.controller('itemDetailsCtrl', ['$scope', '$routeParams', '$http', 'itemFactory',
//    function($scope,  $routeParams, $http, itemFactory) {
//
//        $scope.showDetails = false;
//
//        if(!($routeParams.itemId === undefined)) {
//            $scope.title = 'Item details';
//
//            $scope.itemId = $routeParams.itemId;
//
//            itemFactory.getItem( $scope.itemId)
//                .success(function (data) {
//
//                    console.log(data);
//
//                    if (data === '' || data.id <= 0) {    // not found
//                        toastr.warning('Item not found!');
//                        window.location.hash = '#/items';
//                    } else {
//                        $scope.item = data;
//                        $scope.showDetails = true;
//                    }
//                });
//        } else {
//            toastr.warning('Item not found!');
//            window.location.hash = '#/items';
//        }
//
//        $scope.pointToEditForm = function() {
//            window.location.hash = '#/item/' + $scope.itemId + "/edit";
//        }
//    }]);