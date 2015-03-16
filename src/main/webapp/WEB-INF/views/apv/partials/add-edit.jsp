
<div ng-controller="addEditApvCtrl">
    <div class="row-top-buffer"></div>
    <div class="row">
        <div class="col-md-12 col-lg-12">
            <a ui-sref="apv" class="btn btn-primary">Back to list</a>
        </div>
    </div>
    <div class="row-top-buffer"></div>
    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div class="alert alert-info">{{title}}</div>
        </div>
    </div>
    <form ng-submit="processForm()" ng-show="showForm">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                    <label class="input-label" for="supplier">Supplier</label>
                </div>
                <div class="col-md-5 col-lg-5">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                        <input disabled="" ng-model="selectedSupplier.name" id="supplier" name="supplier" class="form-control ng-pristine ng-valid" type="text" placeholder="Browse supplier"/>
                    </div>
                </div>
                <div class="col-md-5 col-lg-5">
                    <button sl-entity-browser
                            handler="supplier_selection_handler"
                            class="btn btn-primary">Browse supplier</button>
                </div>
                <form-error err_field="errors.err_supplier"></form-error>
            </div>
        </div>

        <div class="row-top-buffer"></div>

        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                    <label class="input-label" for="particulars">Particulars</label>
                </div>
                <div class="col-md-5 col-lg-5">
                    <div class="input-group">
                        <textarea  maxlength="1024" rows="5" cols="59" ng-model="apv.particulars" id="particulars"
                                   name="particulars" placeholder="Enter particulars"></textarea>
                    </div>
                </div>
                <form-error err_field="errors.err_particulars"></form-error>
            </div>
        </div>

        <div class="row-top-buffer"></div>

        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                    <label class="input-label" for="vdate">Voucher Date</label>
                </div>
                <div class="col-md-5 col-lg-5">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                        <input class="datepicker" type="text" class="input-sm form-control" id="vdate" name="vdate" value="05/14/2014">
                    </div>
                </div>
                <form-error err_field="errors.err_apvDate"></form-error>
            </div>
        </div>

        <div class="row-top-buffer"></div>

        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                    <label class="input-label" for="dueDate">Due Date</label>
                </div>
                <div class="col-md-5 col-lg-5">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                        <input class="datepicker" type="text" class="input-sm form-control" id="dueDate" name="dueDate" value="05/14/2014">
                    </div>
                </div>
                <form-error err_field="errors.err_dueDate"></form-error>
            </div>
        </div>

        <div class="row-top-buffer"></div>

        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                    <label class="input-label">Journal Entries</label>
                </div>
                <div class="col-md-7 col-lg-7">
                    <div class="table-responsive white-bg">
                        <table class="table table-striped">
                            <thead>
                            <tr>

                                <th>Account</th>
                                <th><span class="pull-right">Debit</span></th>
                                <th><span class="pull-right">Credit</span></th>
                                <th style="width: 60px"></th>
                            </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>00-11-2221 Office supplies</td>
                                    <td><span class="pull-right">$ 100.00</span></td>
                                    <td><span class="pull-right"></span></td>
                                    <td style="text-align: center"><a style='padding: 0' title='Edit'><i class='fa fa-edit'></i></a>&nbsp;&nbsp;<a style='padding: 0' title='Remove'><i class='fa fa-minus'></i></a></td>
                                </tr>
                                <tr>
                                    <td>00-11-2221 Water pipes</td>
                                    <td><span class="pull-right">$ 45,562.00</span></td>
                                    <td><span class="pull-right"></span></td>
                                    <td style="text-align: center"><a style='padding: 0' title='Edit'><i class='fa fa-edit'></i></a>&nbsp;&nbsp;<a style='padding: 0' title='Remove'><i class='fa fa-minus'></i></a></td>
                                </tr>
                                <tr>
                                    <td class="hasSLAccount" data-container="body" data-toggle="popover" data-placement="right" title="SL Account" data-content="CITI hardware<br/>Ace hardware">22-11-2221 Supplier</td>
                                    <td><span class="pull-right"></span></td>
                                    <td><span class="pull-right">$ 56,726.00</span></td>
                                    <td style="text-align: center"><a style='padding: 0' title='Edit'><i class='fa fa-edit'></i></a>&nbsp;&nbsp;<a style='padding: 0' title='Remove'><i class='fa fa-minus'></i></a></td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td><span class="pull-right"></span></td>
                                    <td><span class="pull-right"></span></td>
                                    <td style="text-align: center"><a style='padding: 0' title='Add'><i class='fa fa-plus'></i></a></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
                <form-error err_field="errors.err_particulars"></form-error>
            </div>
        </div>

        <div class="row-top-buffer"></div>

        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                    <label class="input-label" for="checker">Checker</label>
                </div>
                <div class="col-md-5 col-lg-5">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                        <input disabled="" ng-model="selectedChecker.name" id="checker" name="checker" class="form-control ng-pristine ng-valid" type="text" placeholder="Browse checker"/>
                    </div>
                </div>
                <div class="col-md-5 col-lg-5">
                    <button sl-entity-browser
                            handler="checker_selection_handler"
                            class="btn btn-primary">Browse checker</button>
                </div>
                <form-error err_field="errors.err_checker"></form-error>
            </div>
        </div>

        <div class="row-top-buffer"></div>

        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                    <label class="input-label" for="approvar">Approving Officer</label>
                </div>
                <div class="col-md-5 col-lg-5">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                        <input disabled="" ng-model="selectedApprovingOfficer.name" id="approvar" name="approvar" class="form-control ng-pristine ng-valid" type="text" placeholder="Browse approving officer"/>
                    </div>
                </div>
                <div class="col-md-5 col-lg-5">
                    <button sl-entity-browser
                            handler="approvar_selection_handler"
                            class="btn btn-primary">Browse approving officer</button>
                </div>
                <form-error err_field="errors.err_approvar"></form-error>
            </div>
        </div>

        <div class="row-top-buffer"></div>

        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                </div>
                <div class="col-md-5 col-lg-5">
                    <fieldset ng-disabled="submitting">
                        <button ng-mousedown="submit = true" type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-floppy-disk"></span> {{save}}</button>
                        <button type="reset" class="btn btn-default"><span class="glyphicon glyphicon-refresh"></span> Reset</button>
                    </fieldset>
                </div>
            </div>
        </div>
    </form>
</div>

<div style="margin-bottom: 100px;" />


<script>
    $('.datepicker').datepicker({
        todayBtn: "linked",
        keyboardNavigation: false,
        forceParse: false,
        calendarWeeks: true,
        autoclose: true
    });

    $(function () {
        $('[data-toggle="popover"]').popover({ trigger: "hover", html: true })
    })
</script>

