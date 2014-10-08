(function () {
    var app;
    var app = angular.module('cmnItemBrowserApp', ['itemFactory']);

    app.directive('itemBrowser', ['$timeout', 'itemFactory', function ($timeout, itemFactory) {
        return {
            scope : {
                btnLabel : '@',
                handler: '&'
            },
            restrict: 'AE',
            templateUrl: '/common/item-browser',
            link: function (scope, elem, attrs) {

                elem.bind('click', function () {
                    if (angular.isDefined(scope.items) && scope.items.length > 0)  return; // cache

                    scope.$apply(function () {
                        itemFactory.getItems().success(function (data) {
                            scope.items = data;
                        });
                    });
                });

                // expose selected item to the outside world :)
                scope.selectItem = function(item) {
                    return $timeout(function() {
                        return scope.handler({
                            item: item
                        });
                    });
                }
            }
        };
    }]);
}).call(this);
