var supplierManagementCtrls = angular.module('supplierManagementCtrl', ['ngResource', 'ngSanitize']);

supplierManagementCtrls.controller('supplierListCtrl', ['$scope', '$http', 'supplierFactory',
    function($scope,  $http, supplierFactory) {

        supplierFactory.getSuppliers()
            .success(function (data) {
                $scope.suppliers = data;
            })
            .error(function (error) {
                toastr.error('Failed to load suppliers!');
            });
    }]);

supplierManagementCtrls.controller('addEditSupplierCtrl', ['$scope', '$routeParams', '$http', 'supplierFactory', 'errorToElementBinder',
    'csrf',
    function($scope, $routeParams, $http, supplierFactory, errorToElementBinder, csrf) {

        $scope.title = 'Add supplier';
        $scope.save = 'Save';
        $scope.showForm = true;

        $scope.supplier = {};

        var resourceURI = '/supplier/create';
        if(!($routeParams.supplierId === undefined)) {  // update mode
            $scope.title = 'Update user';
            $scope.showForm = false;

            $scope.supplierId = $routeParams.supplierId;

            supplierFactory.getSupplier($scope.supplierId).success(function (data) {
                if (data === '' || data.id <= 0) {    // not found
                    window.location.hash = '#/suppliers';
                } else {
                    $scope.supplier = data;

                    console.log(data);

                    $scope.showForm = true;
                }
            })
                .error(function (error) {
                    toastr.warning('Supplier not found!');
                    window.location.hash = '#/suppliers';
                });

            resourceURI = '/supplier/update';
        }


        $scope.processForm = function() {

            $scope.save ='Saving...';

            $scope.errors = {};
            $scope.submitting = true;
            csrf.setCsrfToken();

            console.log($scope.supplier);

            var res = $http.post(resourceURI, $scope.supplier);
            res.success(function(data) {
                if (!data.success) {
                    $scope.errors = errorToElementBinder.bindToElements(data, $scope.errors);
                    $scope.save ='Save';
                    $scope.submitting = false;
                    toastr.warning('Error found.');
                } else {
                    window.location.hash = '#/supplier/' + data.modelId;
                    toastr.success('Supplier successfully saved!');
                }
            });
            res.error(function(data, status, headers, config) {
                toastr.error('Something went wrong!');
                $scope.save ='Save';
                $scope.submitting = false;
            });
        }

        $scope.showError = function(val) {
            console.log(val);
        }
    }]);

supplierManagementCtrls.controller('supplierDetailsCtrl', ['$scope', '$routeParams', '$http', 'supplierFactory',
    function($scope,  $routeParams, $http, supplierFactory) {

    $scope.showDetails = false;

    if(!($routeParams.supplierId === undefined)) {
        $scope.title = 'Supplier details';

        $scope.supplierId = $routeParams.supplierId;

        supplierFactory.getSupplier( $scope.supplierId)
            .success(function (data) {

                console.log(data);

                if (data === '' || data.id <= 0) {    // not found
                    toastr.warning('Supplier not found!');
                    window.location.hash = '#/suppliers';
                } else {
                    $scope.supplier = data;
                    $scope.showDetails = true;
                }
        });
    } else {
        toastr.warning('Supplier not found!');
        window.location.hash = '#/suppliers';
    }

    $scope.pointToEditForm = function() {
        window.location.hash = '#/supplier/' + $scope.supplierId + "/edit";
    }
}]);