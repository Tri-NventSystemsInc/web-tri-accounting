var requisitionVoucherFactory = angular.module('requisitionVoucherFactory', []);

requisitionVoucherFactory.factory('requisitionVoucherFactory', ['$http', function($http) {
    this.getRequisitionVouchers = function () {
        return $http.get('/requisition-voucher/list/');
    };
//    this.getSupplier = function (id) {
//        return $http.get('/supplier/'+id);
//    };
    return this;
}]);