<div ng-controller="addEditSupplierCtrl">
    <div class="row">
        <div class="col-md-12 col-lg-12">
            <button class="btn btn-primary" onclick="(window.location.href = '#/suppliers')">Suppliers</button>
        </div>
    </div>
    <div class="row-top-buffer"></div>
    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div class="alert alert-info">{{ title }}</div>
        </div>
    </div>
    <form ng-submit="processForm()" ng-show="showForm">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                    <label class="input-label" for="name">Name</label>
                </div>
                <div class="col-md-5 col-lg-5">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                        <input required maxlength="512" ng-model="supplier.name" id="name" name="name" class="form-control"
                               type="text" placeholder="Enter name"/>
                    </div>
                </div>
                <div class="col-md-5 col-lg-5">
                    <span style="color: red !important;" ng-show="errors.err_name">
                        <ul class="error-list">
                            <li ng-repeat="err in errors.err_name">
                                {{ err }}
                            </li>
                        </ul>
                    </span>
                </div>
            </div>
        </div>

        <div class="row-top-buffer"></div>

        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                    <label class="input-label" for="address">Address</label>
                </div>
                <div class="col-md-5 col-lg-5">
                    <div class="input-group">
                        <textarea  maxlength="1024" rows="5" cols="63" ng-model="supplier.address" id="address"
                                   name="address" placeholder="Enter address"></textarea>
                    </div>
                </div>
                <div class="col-md-5 col-lg-5">
                    <span style="color: red !important;" ng-show="errors.err_address">
                        <ul class="error-list">
                            <li ng-repeat="err in errors.err_address">
                                {{ err }}
                            </li>
                        </ul>
                    </span>
                </div>
            </div>
        </div>

        <div class="row-top-buffer"></div>

        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                    <label class="input-label" for="contactPerson">Contact Person</label>
                </div>
                <div class="col-md-5 col-lg-5">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                        <input maxlength="512" ng-model="supplier.contactPerson" id="contactPerson" name="contactPerson"
                               class="form-control" type="text" placeholder="Enter contact person"/>
                    </div>
                </div>
                <div class="col-md-5 col-lg-5">
                    <span style="color: red !important;" ng-show="errors.err_contactPerson">
                        <ul class="error-list">
                            <li ng-repeat="err in errors.err_contactPerson">
                                {{ err }}
                            </li>
                        </ul>
                    </span>
                </div>
            </div>
        </div>

        <div class="row-top-buffer"></div>

        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                    <label class="input-label" for="contactPersonPosition">Position</label>
                </div>
                <div class="col-md-5 col-lg-5">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                        <input maxlength="255" ng-model="supplier.contactPersonPosition" id="contactPersonPosition"
                               name="contactPersonPosition" class="form-control" type="text" placeholder="Enter contact person position"/>
                    </div>
                </div>
                <div class="col-md-5 col-lg-5">
                    <span style="color: red !important;" ng-show="errors.err_contactPersonPosition">
                        <ul class="error-list">
                            <li ng-repeat="err in errors.err_contactPersonPosition">
                                {{ err }}
                            </li>
                        </ul>
                    </span>
                </div>
            </div>
        </div>

        <div class="row-top-buffer"></div>

        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                    <label class="input-label" for="bankAccountNumber">Bank Account</label>
                </div>
                <div class="col-md-5 col-lg-5">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                        <input maxlength="255" ng-model="supplier.bankAccountNumber" id="bankAccountNumber"
                               name="bankAccountNumber" class="form-control" type="text" placeholder="Enter bank account number"/>
                    </div>
                </div>
                <div class="col-md-5 col-lg-5">
                    <span style="color: red !important;" ng-show="errors.err_bankAccountNumber">
                        <ul class="error-list">
                            <li ng-repeat="err in errors.err_bankAccountNumber">
                                {{ err }}
                            </li>
                        </ul>
                    </span>
                </div>
            </div>
        </div>

        <div class="row-top-buffer"></div>

        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                    <label class="input-label" for="email">Email</label>
                </div>
                <div class="col-md-5 col-lg-5">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                        <input maxlength="255" ng-model="supplier.email" id="email" name="email" class="form-control"
                               type="text" placeholder="Enter email"/>
                    </div>
                </div>
                <div class="col-md-5 col-lg-5">
                    <span style="color: red !important;" ng-show="errors.err_email">
                        <ul class="error-list">
                            <li ng-repeat="err in errors.err_email">
                                {{ err }}
                            </li>
                        </ul>
                    </span>
                </div>
            </div>
        </div>

        <div class="row-top-buffer"></div>

        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                    <label class="input-label" for="creditLimit">Credit Limit</label>
                </div>
                <div class="col-md-5 col-lg-5">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                        <input ng-model="supplier.creditLimit" id="creditLimit" name="creditLimit" class="form-control"
                               type="number"  step="any" placeholder="Enter credit limit"/>
                    </div>
                </div>
                <div class="col-md-5 col-lg-5">
                    <span style="color: red !important;" ng-show="errors.err_creditLimit">
                        <ul class="error-list">
                            <li ng-repeat="err in errors.err_creditLimit">
                                {{ err }}
                            </li>
                        </ul>
                    </span>
                </div>
            </div>
        </div>

        <div class="row-top-buffer"></div>

        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                    <label class="input-label" for="fax">Fax</label>
                </div>
                <div class="col-md-5 col-lg-5">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                        <input maxlength="255" ng-model="supplier.fax" id="fax" name="fax" class="form-control"
                               type="text" placeholder="Enter fax"/>
                    </div>
                </div>
                <div class="col-md-5 col-lg-5">
                    <span style="color: red !important;" ng-show="errors.err_fax">
                        <ul class="error-list">
                            <li ng-repeat="err in errors.err_fax">
                                {{ err }}
                            </li>
                        </ul>
                    </span>
                </div>
            </div>
        </div>

        <div class="row-top-buffer"></div>

        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                    <label class="input-label" for="phone">Phone</label>
                </div>
                <div class="col-md-5 col-lg-5">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                        <input maxlength="255" ng-model="supplier.phone" id="phone" name="phone" class="form-control"
                               type="text" placeholder="Enter phone"/>
                    </div>
                </div>
                <div class="col-md-5 col-lg-5">
                    <span style="color: red !important;" ng-show="errors.err_phone">
                        <ul class="error-list">
                            <li ng-repeat="err in errors.err_phone">
                                {{ err }}
                            </li>
                        </ul>
                    </span>
                </div>
            </div>
        </div>

        <div class="row-top-buffer"></div>

        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                    <label class="input-label" for="tin">TIN</label>
                </div>
                <div class="col-md-5 col-lg-5">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                        <input maxlength="255" ng-model="supplier.tin" id="tin" name="tin" class="form-control"
                               type="text" placeholder="Enter tin"/>
                    </div>
                </div>
                <div class="col-md-5 col-lg-5">
                    <span style="color: red !important;" ng-show="errors.err_phone">
                        <ul class="error-list">
                            <li ng-repeat="err in errors.err_phone">
                                {{ err }}
                            </li>
                        </ul>
                    </span>
                </div>
            </div>
        </div>

        <div class="row-top-buffer"></div>
        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                </div>
                <div class="col-md-9 col-lg-9">
                    <div class="inline-group">
                        <label><input ng-model="supplier.isVatable" type="checkbox" id="isVatable" name="enabled"> VATable</label>
                    </div>
                </div>
            </div>
        </div>

        <div class="row-top-buffer"></div>
        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                </div>
                <div class="col-md-9 col-lg-9">
                    <div class="inline-group">
                        <label><input ng-model="supplier.status" type="checkbox" id="status" name="status"> Enabled</label>
                    </div>
                </div>
            </div>
        </div>

        <div class="row-top-buffer"></div>

        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                </div>
                <div class="col-md-5 col-lg-5">
                    <fieldset ng-disabled="submitting">
                        <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-floppy-disk"></span> {{ save }}</button>
                        <button type="reset" class="btn btn-default"><span class="glyphicon glyphicon-refresh"></span> Reset</button>
                    </fieldset>
                </div>
            </div>
        </div>
    </form>
</div>


