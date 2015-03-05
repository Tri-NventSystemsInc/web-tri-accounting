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
                                "/resources/js/app/factories/item-factory.js",
                                "/resources/js/app/factories/unit-factory.js"
                            ]
                        }
                    )
                }
            }
        })

        .state('item.detail', {
            url: '/{itemId}/detail',
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
            url: '/{supplierId}/detail',
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
                            files: getUserDependencies("/resources/js/app/module/user.js")
                        }
                    )
                }
            }
        })

        .state('user.list', {
            url: '/users',
            templateUrl: '/admin/user/user-list-page',
            controller: 'userListCtrl'
        })

        .state('user.new', {
            url: '/user/new',
            templateUrl: 'admin/user/new-user-page'
        })

        .state('user.detail', {
            url: '/user/{userId}/detail',
            templateUrl: 'admin/user/user-details-page',
            controller: 'userDetailsCtrl'
        })

        .state('user.edit', {
            url: '/user/{userId}/edit',
            views : {
                '': {
                    templateUrl: 'admin/user/new-user-page'
                }
            }
        })

        .state('user.roles', {
            url: '/roles',
            templateUrl: '/admin/user/role-list-page',
            controller: 'roleListCtrl'
        })

        .state('user.newRole', {
            url: '/role/new',
            templateUrl: 'admin/user/new-role-page'
        })

        .state('user.roleDetail', {
            url: '/role/{roleId}/detail',
            templateUrl: 'admin/user/role-details-page',
            controller: 'roleDetailsCtrl'
        })

        .state('user.roleEdit', {
            url: '/role/{roleId}/edit',
            templateUrl: 'admin/user/new-role-page'
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

        .state('notification', {
            url: '/notifications',
            templateUrl: '/common//notifications-page'
        })

        .state('profile', {
            url:  '/user/profile',
            templateUrl:  '/user/profile-page',
            resolve: {
                store: function ($ocLazyLoad) {
                    return $ocLazyLoad.load(
                        {
                            name: "profile",
                            files: getUserDependencies("/resources/js/app/module/profile.js")
                        }
                    )
                }
            }
        })

        .state('check', {
            url: '/checks',
            templateUrl: '/admin/check',
            controller: 'checkListCtrl',
            resolve: {
                store: function ($ocLazyLoad) {
                    return $ocLazyLoad.load(
                        {
                            name: "check",
                            files: [
                                "/resources/js/app/module/check.js",
                                "/resources/js/app/factories/business-segment-factory.js",
                                "/resources/js/app/factories/account-factory.js",
                                "/resources/js/app/directives/account-browser-s.js",
                                "/resources/js/app/factories/check-factory.js"
                            ]
                        }
                    )
                }
            }
        })

        .state('check.detail', {
            url: '/{checkId}/detail',
            templateUrl: '/admin/check/check-details-page',
            controller: 'checkDetailsCtrl'
        })

        .state('check.edit', {
            url: '/{checkId}/edit',
            templateUrl: '/admin/check/edit-check-page',
            controller: 'addEditCheckCtrl'
        })

        .state('check.new', {
            url: '/new',
            templateUrl: '/admin/check/edit-check-page',
            controller: 'addEditCheckCtrl'
        })

        .state('profile.edit', {
            url:  '/edit',
            templateUrl:  '/user/edit-profile-page'
        })

        .state('unit', {
            url: '/unit-measures',
            templateUrl: '/admin/unit-measures',
            controller: 'unitListCtrl',
            resolve: {
                store: function ($ocLazyLoad) {
                    return $ocLazyLoad.load(
                        {
                            name: "unit",
                            files: [
                                "/resources/js/app/module/unit.js",
                                "/resources/js/app/factories/unit-factory.js"
                            ]
                        }
                    )
                }
            }
        })

        .state('unit.detail', {
            url: '/{unitId}/detail',
            templateUrl: '/admin/unit-measures/unit-details-page',
            controller: 'unitDetailsCtrl'
        })

        .state('unit.edit', {
            url: '/{unitId}/edit',
            templateUrl: '/admin/unit-measures/new-unit-page'
        })

        .state('unit.new', {
            url: '/new',
            templateUrl: '/admin/unit-measures/new-unit-page'
        })

        .state('dashboard', {
            url:  '/main'
        })


        .state('apv', {
            url:  '/accounts-payable',
            templateUrl:  '/accounts-payable',
            resolve: {
                store: function ($ocLazyLoad) {
                    return $ocLazyLoad.load(
                        {
                            name: "apv",
                            files: getUserDependencies("/resources/js/app/module/apv.js")
                        }
                    )
                }
            }
        })

        .state('apv.new', {
            url:  '/new',
            templateUrl:  '/accounts-payable/new-apv-page'
        })

        .state('rv', {
            url:  '/requisition-voucher',
            templateUrl:  '/requisition-voucher',
            resolve: {
                store: function ($ocLazyLoad) {
                    return $ocLazyLoad.load(
                        {
                            name: "rv",
                            files: getUserDependencies("/resources/js/app/module/rv.js")
                        }
                    )
                }
            }
        })

        .state('rv.new', {
            url:  '/new',
            templateUrl:  '/requisition-voucher/new-rv-page'
        })
}

function getUserDependencies(moduleJs) {
     return [
         moduleJs,
        "/resources/js/app/factories/user-factory.js",
        "/resources/js/app/factories/role-factory.js",
        "/resources/js/app/factories/menu-factory.js"
    ]
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

