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
            controller: 'treeGridCtrl'
        })

        .state('coa.new', {
            url: '/new',
            templateUrl: 'coa/new-account-page'
        })

        .state('coa.account', {
            url: '/account/{accountId}',
            templateUrl: 'coa/account-details-page',
            controller: 'accountDetailsCtrl'
        })

        .state('lockscreen', {
            url: "/#/lockscreen",
            templateUrl: "views/lockscreen.jsp",
            data: { pageTitle: 'Lock Screen' }
        })

        .state('users', {
            url: '/users',
            templateUrl: '/common/users'
        })

        .state('showcase', {
            url: '/showcase',
            templateUrl: '/common/showcase'
        })

        .state('dashboard', {
            url:  '/main'
        })
}


angular
    .module('inspinia')
    .config(config)
    .run(function($rootScope, $state) {
        $rootScope.$state = $state;
    });

