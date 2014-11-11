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
                        <input required maxlength="512" ng-model="supplier.name" id="name" name="name" class="form-control" type="text" placeholder="Enter name"/>
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
                        <textarea  maxlength="1024" rows="5" cols="63" ng-model="supplier.address" id="address" name="address" placeholder="Enter address"></textarea>
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
                        <input maxlength="255" ng-model="supplier.contactPerson" id="contactPerson" name="contactPerson" class="form-control" type="text" placeholder="Enter contact person"/>
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
        <div class="row-top-buffer"></div>
        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                </div>
                <div class="col-md-9 col-lg-9">
                    <div class="inline-group">
                        <label><input ng-model="user.enabled" type="checkbox" id="enabled" name="enabled"> Enabled</label>
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


