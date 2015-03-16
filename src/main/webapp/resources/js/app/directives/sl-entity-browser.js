(function () {
    var app;
    var app = angular.module('cmnSLEntityBrowserApp', ['entityFactory', 'utilService']);

    app.directive('slEntityBrowser', ['$timeout', 'entityFactory', 'slEntityUtil', function ($timeout, entityFactory, slEntityUtil) {
        return {
            scope : {
                types: "=",
                handler: '&'
            },
            restrict: 'AE',
                controller: function($scope, $modal) {
                    // create open() method
                    // to open a modal
                    $scope.open = function() {
                        $modal.open({
                            scope: $scope,
                            windowClass: 'sl-entity-browser-modal-window',
                            templateUrl: '/common/sl-entity-browser',
                            controller: function($scope, $modalInstance) {
                                $scope.close  = function() {
                                    $modalInstance.close();
                                };

                                // expose selected account to the outside world :)
                                $scope.selectEntity = function(entity) {
                                    $scope.handler()(entity);
                                    $modalInstance.close();
                                }
                            }
                        });
                    };


                },
            link: function (scope, elem, attrs) {

                console.log(scope.types);

                elem.bind('click', function () {
                    if (angular.isDefined(scope.slEntities) && scope.slEntities.length > 0)  {
                        scope.open();
                        return;
                    }
                    else  // cache
                    {
                        scope.$apply(function () {
                            entityFactory.getEntities().success(function (data) {
                                scope.slEntities = data;
                                scope.open();
                            });
                        });
                    }
                });

                scope.convert = function(marker) {
                    var obj = slEntityUtil.markerToString(marker);
                    return obj.type;
                }

                scope.entityClass = function(marker) {
                    var obj = slEntityUtil.markerToString(marker);
                    return obj.class;
                }
            }
        };
    }]);
}).call(this);
