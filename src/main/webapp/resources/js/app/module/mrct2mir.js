var mrct2mirApp = angular.module('mrct2mir', [
    'jQueryFnWrapperService',
    'errorHandlerService',
    'cmnFormErrorApp',
    'utilService'
]);

mrct2mirApp.controller('browseMRCTCtrl', ['$scope', '$stateParams', '$http', 'errorToElementBinder', 'csrf',
    function($scope, $stateParams, $http, errorToElementBinder, csrf) {

        $scope.title = 'Select MRCT to be posted to MIR';
        $scope.save = 'Save';
        $scope.showForm = true;
        $scope.selectedItemData = {};

        $scope.selectItem = function(item){

            $scope.selectedItemData = item;

        };

        $scope.mrctList = [
            {
                referenceNo: "MRCT-01-15-0001",
                date: "January 1, 2015",
                itemDescription: "Short bond paper 8.5 x 11",
                quantity: 2,
                unitCost: 150,
                itemCost: 300,
                preparedBy: "John Rsample",
                issuedBy: "Joseph Xsample",
                receivedBy: "Mark Lsample",
                approvedBy: "Vince Isample"
            },
            {
                referenceNo: "MRCT-01-15-0002",
                date: "January 2, 2015",
                itemDescription: "Epson Printer",
                quantity: 1,
                unitCost: 1500,
                itemCost: 1500,
                preparedBy: "John Rsample",
                issuedBy: "Joseph Xsample",
                receivedBy: "Mark Lsample",
                approvedBy: "Vince Isample"
            },
            {
                referenceNo: "MRCT-01-15-0003",
                date: "January 3, 2015",
                itemDescription: "Pilot Ballpen",
                quantity: 100,
                unitCost: 7,
                itemCost: 700,
                preparedBy: "John Rsample",
                issuedBy: "Joseph Xsample",
                receivedBy: "Mark Lsample",
                approvedBy: "Vince Isample"
            }
//            ,
//            {
//                referenceNo: "MRCT-01-15-0004",
//                date: "January 1, 2015",
//                itemDescription: "Short bond paper 8.5 x 11",
//                quantity: 2,
//                unitCost: 150,
//                itemCost: 300,
//                preparedBy: "John Rsample",
//                issuedBy: "Joseph Xsample",
//                receivedBy: "Mark Lsample",
//                approvedBy: "Vince Isample"
//            },
//            {
//                referenceNo: "MRCT-01-15-0005",
//                date: "January 1, 2015",
//                itemDescription: "Short bond paper 8.5 x 11",
//                quantity: 2,
//                unitCost: 150,
//                itemCost: 300,
//                preparedBy: "John Rsample",
//                issuedBy: "Joseph Xsample",
//                receivedBy: "Mark Lsample",
//                approvedBy: "Vince Isample"
//            }
        ];

    }]);

//rvApp.controller('addEditRvForITCtrl', ['$scope', '$stateParams', '$http', 'errorToElementBinder', 'csrf',
//    function($scope, $stateParams, $http, errorToElementBinder, csrf) {
//
//        $scope.title = 'Create Requisition Voucher For IT';
//        $scope.save = 'Save';
//        $scope.showForm = true;
//    }]);
//
//rvApp.controller('addEditRvForJOCtrl', ['$scope', '$stateParams', '$http', 'errorToElementBinder', 'csrf',
//    function($scope, $stateParams, $http, errorToElementBinder, csrf) {
//
//        $scope.title = 'Create Requisition Voucher For JO';
//        $scope.save = 'Save';
//        $scope.showForm = true;
//    }]);