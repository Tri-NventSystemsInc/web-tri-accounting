var mrctFactory = angular.module('mrctFactory', []);

mrctFactory.factory('mrctFactory', ['$http', function($http) {

    this.getMRCTList1 = function(){

        return [{

            referenceNo: "MRCT-01-15-0001",
            date: "January 1, 2015",
            purpose: "A sample purpose",
            preparedBy: "John Rsample",
            issuedBy: "Joseph Xsample",
            receivedBy: "Mark Lsample",
            approvedBy: "Vince Isample",
            details: [
                {
                    itemDescription: "Short bond paper 8.5 x 11",
                    quantity: 2,
                    unitCost: 150,
                    itemCost: 300
                },
                {
                    itemDescription: "Epson Printer",
                    quantity: 1,
                    unitCost: 1500,
                    itemCost: 1500
                },
                {
                    itemDescription: "Pilot Ballpen",
                    quantity: 100,
                    unitCost: 7,
                    itemCost: 700
                }
            ]

        },
            {

                referenceNo: "MRCT-01-15-0001",
                date: "January 1, 2015",
                purpose: "What is the purpose?",
                preparedBy: "John Rsample",
                issuedBy: "Joseph Xsample",
                receivedBy: "Mark Lsample",
                approvedBy: "Vince Isample",
                details: [
                    {
                        itemDescription: "Short bond paper 8.5 x 11",
                        quantity: 2,
                        unitCost: 150,
                        itemCost: 300
                    },
                    {
                        itemDescription: "Epson Printer",
                        quantity: 1,
                        unitCost: 1500,
                        itemCost: 1500
                    },
                    {
                        itemDescription: "Pilot Ballpen",
                        quantity: 100,
                        unitCost: 7,
                        itemCost: 700
                    }
                ]

            },
            {

                referenceNo: "MRCT-01-15-0001",
                date: "January 1, 2015",
                purpose: "The purpose should be required",
                preparedBy: "John Rsample",
                issuedBy: "Joseph Xsample",
                receivedBy: "Mark Lsample",
                approvedBy: "Vince Isample",
                details: [
                    {
                        itemDescription: "Short bond paper 8.5 x 11",
                        quantity: 2,
                        unitCost: 150,
                        itemCost: 300
                    },
                    {
                        itemDescription: "Epson Printer",
                        quantity: 1,
                        unitCost: 1500,
                        itemCost: 1500
                    },
                    {
                        itemDescription: "Pilot Ballpen",
                        quantity: 100,
                        unitCost: 7,
                        itemCost: 700
                    }
                ]

            }];

    };

    this.getMRCTList = function () {

        return [
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
            }];
//        return $http.get('/bus-seg/list');
    };

    return this;
}]);