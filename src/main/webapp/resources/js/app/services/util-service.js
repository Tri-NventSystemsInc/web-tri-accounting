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

utilService.service('routeUtil', function() {
    this.gotoMain = function($state) {
        $state.go('^', $state.params, { reload: true });
    }
});


utilService.service('voucherUtil', function() {
    this.calculateJournalTotals = function(journalEntries) {
        var sumDr = 0;
        var sumCr = 0;
        var totals =  {"debit" : 0, "credit" : 0};

        if (typeof journalEntries !== 'undefined') {

            angular.forEach(journalEntries, function (entry, key) {
                try {
                    var dr = parseFloat(entry['debit']);
                    var cr = parseFloat(entry['credit']);
                    if (isNaN(dr)) {
                        dr = 0;
                    }
                    if (isNaN(cr)) {
                        cr = 0;
                    }

                    sumDr += dr
                    sumCr += cr
                } catch (e) {
                    console.log(e)
                }
            });

            totals['debit'] = sumDr;
            totals['credit'] = sumCr;
        }

        return totals;
    }
});