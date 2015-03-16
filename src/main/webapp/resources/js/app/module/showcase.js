var app = angular.module('showcase', [
    'cmnAccountBrowserWithSegmentApp',
    'cmnSLEntityBrowserApp',
    'cmnItemBrowserApp'
]);

app.controller('acbCtrl', ['$scope', function($scope) {
            $scope.accounts_selection_handler = function(account){
                $scope.selectedAccount = account;
            }
        }]);

app.controller('sleCtrl', ['$scope', function($scope) {
    $scope.entityTypes = [1,2,3];
            $scope.entity_selection_handler = function(entity){
                $scope.selectedEntity = entity;
            }

            $scope.entity_selection_handler2 = function(entity){
                $scope.selectedEntity2 = entity;
            }
        }]);

app.controller('itemCtrl', ['$scope', '$http', function($scope, $http) {
    $scope.item_selection_handler = function(item){
        $scope.selectedItem = item;
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