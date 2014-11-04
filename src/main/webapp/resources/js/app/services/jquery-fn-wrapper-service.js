var jQueryFnWrapperService = angular.module('jQueryFnWrapperService', []);

jQueryFnWrapperService.service('modalToggler', function() {
    this.show = function(modalId) {
        modalId = '#' + modalId
        $(modalId).modal('show');
    };

    this.hide = function(modalId) {
        modalId = '#' + modalId
        $(modalId).modal('hide');
    };

    this.getCsrfToken = function() {
        return $('input[name=_csrf]').val();
    }
});

jQueryFnWrapperService.service('csrf', function() {
    this.getCsrfToken = function() {
        return $('input[name=_csrf]').val();
    }
});