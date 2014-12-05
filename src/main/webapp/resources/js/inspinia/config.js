/**
 * INSPINIA - Responsive Admin Theme
 * Copyright 2014 Webapplayers.com
 *
 * Inspinia theme use AngularUI Router to manage routing and views
 * Each view are defined as state.
 * Initial there are written stat for all view in theme.
 *
 */
function config($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise("main");
    $stateProvider

        .state('coa', {
            url: '/coa',
            templateUrl: '/admin/coa',
            controller: 'treeGridCtrl',
            resolve: {
                store: function ($ocLazyLoad) {
                    return $ocLazyLoad.load(
                        {
                            name: "coa",
                            files: [
                                "/resources/js/app/module/coa.js",
                                "/resources/js/app/factories/account-factory.js",
                                "/resources/js/app/factories/business-segment-factory.js",
                                "/resources/js/app/services/account-service.js",
                                "/resources/js/app/directives/tree-grid-directive.js"
                            ]
                        }
                    )
                }
            }
        })

        .state('coa.new', {
            url: '/new',
            templateUrl: 'admin/coa/new-account-page'
        })

        .state('coa.account', {
            url: '/account/{accountId}',
            templateUrl: 'admin/coa/account-details-page',
            controller: 'accountDetailsCtrl'
        })

        .state('coa.edit', {
            url: '/account/{accountId}/edit',
            templateUrl: 'admin/coa/new-account-page'
        })

        .state('item', {
            url: '/items',
            templateUrl: '/admin/item',
            controller: 'itemListCtrl',
            resolve: {
                store: function ($ocLazyLoad) {
                    return $ocLazyLoad.load(
                        {
                            name: "item",
                            files: [
                                "/resources/js/app/module/item.js",
                                "/resources/js/app/factories/business-segment-factory.js",
                                "/resources/js/app/factories/account-factory.js",
                                "/resources/js/app/directives/account-browser-s.js",
                                "/resources/js/app/factories/item-factory.js"
                            ]
                        }
                    )
                }
            }
        })

        .state('item.detail', {
            url: '/detail/{itemId}',
            templateUrl: 'admin/item/item-details-page',
            controller: 'itemDetailsCtrl'
        })

        .state('item.new', {
            url: '/new',
            templateUrl: 'admin/item/new-item-page'
        })

        .state('item.edit', {
            url: '/{itemId}/edit',
            templateUrl: 'admin/item/new-item-page'
        })

        .state('supplier', {
            url: '/suppliers',
            templateUrl: '/admin/supplier',
            controller: 'supplierListCtrl',
            resolve: {
                store: function ($ocLazyLoad) {
                    return $ocLazyLoad.load(
                        {
                            name: "supplier",
                            files: [
                                "/resources/js/app/module/supplier.js",
                                "/resources/js/app/factories/supplier-factory.js"
                            ]
                        }
                    )
                }
            }
        })

        .state('supplier.detail', {
            url: '/detail/{supplierId}',
            templateUrl: 'admin/supplier/supplier-details-page',
            controller: 'supplierDetailsCtrl'
        })

        .state('supplier.new', {
            url: '/new',
            templateUrl: 'admin/supplier/new-supplier-page'
        })

        .state('supplier.edit', {
            url: '/{supplierId}/edit',
            templateUrl: 'admin/supplier/new-supplier-page'
        })

        .state('user', {
            url: '/users-and-roles',
            templateUrl: '/admin/user',
            resolve: {
                store: function ($ocLazyLoad) {
                    return $ocLazyLoad.load(
                        {
                            name: "user",
                            files: [
                                "/resources/js/app/module/user.js",
                                "/resources/js/app/factories/user-factory.js",
                                "/resources/js/app/factories/role-factory.js",
                                "/resources/js/app/factories/menu-factory.js"
                            ]
                        }
                    )
                }
            }
        })

        .state('user.new', {
            url: '/new',
            views : {
                'userPartial@user': {
                    templateUrl: 'admin/user/new-user-page'
                }
            }
        })

        .state('user.userDetail', {
            url: '/user/{userId}',
            views : {
                'userPartial@user': {
                    templateUrl: 'admin/user/user-details-page',
                    controller: 'userDetailsCtrl'
                }
            }
        })

        .state('user.userEdit', {
            url: '/user/{userId}/edit',
            views : {
                'userPartial@user': {
                    templateUrl: 'admin/user/new-user-page'
                }
            }
        })

        .state('user.newRole', {
            url: '/new-role',
            views : {
                'rolePartial@user': {
                    templateUrl: 'admin/user/new-role-page'
                }
            }
        })

        .state('user.roleDetail', {
            url: '/role/{roleId}',
            views : {
                'rolePartial@user': {
                    templateUrl: 'admin/user/role-details-page',
                    controller: 'roleDetailsCtrl'
                }
            }
        })

        .state('user.roleEdit', {
            url: '/role/{roleId}/edit',
            views : {
                'rolePartial@user': {
                    templateUrl: 'admin/user/new-role-page'
                }
            }
        })

        .state('showcase', {
            url: '/showcase',
            templateUrl: '/admin/showcase',
            resolve: {
                store: function ($ocLazyLoad) {
                    return $ocLazyLoad.load(
                        {
                            name: "showcase",
                            files: [
                                "/resources/js/app/module/showcase.js",
                                "/resources/js/app/factories/account-factory.js",
                                "/resources/js/app/factories/business-segment-factory.js",
                                "/resources/js/app/directives/account-browser-s.js",
                                "/resources/js/app/factories/entity-factory.js",
                                "/resources/js/app/factories/item-factory.js",
                                "/resources/js/app/directives/sl-entity-browser.js",
                                "/resources/js/app/directives/item-browser.js"
                            ]
                        }
                    )
                }
            }
        })

        .state('dashboard', {
            url:  '/main'
        })
}

function decorator($provide) {
    $provide.decorator('$state', function ($delegate) {

        // let's locally use 'state' name
        var state = $delegate;

        console.log(state);

        // let's extend this object with new function
        // 'baseGo', which in fact, will keep the reference
        // to the original 'go' function
        state.baseGo = state.go;

        // here comes our new 'go' decoration
        var go = function (to, params, options) {
            options = options || {};

            // only in case of missing 'reload'
            // append our explicit 'true'
            if (angular.isUndefined(options.reload)) {

                options.reload = true;
            }

            // return processing to the 'baseGo' - original
            this.baseGo(to, params, options);
        };

        // assign new 'go', right now decorating the old 'go'
        state.go = go;

        return $delegate;
    });
}

angular
    .module('inspinia')
    .config(config)
    .run(function($rootScope, $state) {
        $rootScope.$state = $state;
    });

