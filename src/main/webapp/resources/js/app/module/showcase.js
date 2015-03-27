var app = angular.module('showcase', [
    'cmnAccountBrowserWithSegmentApp',
    'cmnSLEntityBrowserApp',
    'cmnRequisitionVoucherBrowserApp',
    'cmnItemBrowserApp'
]);

app.controller('acbCtrl', ['$scope', function($scope) {
    $scope.accounts_selection_handler = function(account){
        $scope.selectedAccount = account;
    }

    $scope.accounts_selection_handler2 = function(account){
        $scope.selectedAccount2 = account;
    }
}]);

app.controller('sleCtrl', ['$scope', function($scope) {
        $scope.entityTypes1 = [1];
        $scope.entity_selection_handler = function(entity){
            $scope.selectedEntity = entity;
        }


        $scope.entityTypes2 = [1,2];
        $scope.entity_selection_handler2 = function(entity){
            $scope.selectedEntity2 = entity;
        }
}]);

app.controller('itemCtrl', ['$scope', '$http', function($scope, $http) {
    $scope.item_selection_handler1 = function(item){
        alert(qwe)
        $scope.selectedItem1 = item;
    }

    $scope.item_selection_handler2 = function(item){
        $scope.selectedItem2 = item;
    }

    $scope.export = function(type) {
        $http.get('/item/download/token').success(function(response) {
            // Store token
            var token = response.message[0];
            // Start download
            $scope.url = '/item/download'+'?token='+token+'&type='+type;
        });
    }
}]);

app.controller('rvCtrl', ['$scope', '$http', function($scope, $http) {
    $scope.rv_selection_handler = function(requisitionVoucher){
        $scope.selectedRv1 = requisitionVoucher;
    }
}]);