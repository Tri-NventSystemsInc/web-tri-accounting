var utilService = angular.module('utilService', []);

utilService.service('slEntityUtil', function() {
    this.markerToString = function(marker) {
        if (marker == 1) return {type : "Employee", class: "label-warning"};
        if (marker == 2) return {type : "Supplier", class: "label-info"};
        if (marker == 3) return {type : "Asset", class: "label-danger"};
        if (marker == 4) return {type : "Work Order", class: "label-default"};
        if (marker == 5) return {type : "Prepayments", class: "label-success"};
        if (marker == 6) return {type : "Petty Cash Fund", class: "label-primary"};
    }
});