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
    $urlRouterProvider.otherwise("admin/dashboard");
    $stateProvider
    .state('lockscreen', {
            url: "/lockscreen",
            templateUrl: "lockscreen.jsp",
            data: { pageTitle: 'Lock Screen' }
        })

}


angular
    .module('inspinia')
    .config(config)
    .run(function($rootScope, $state) {
        $rootScope.$state = $state;
    });