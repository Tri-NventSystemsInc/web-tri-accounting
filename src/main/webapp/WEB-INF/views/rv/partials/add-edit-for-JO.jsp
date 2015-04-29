<div ui-view>
<div class="row wrapper border-bottom white-bg page-heading">
    <div class="col-lg-9">
        <h2><b>Requisition Issue Voucher</b></h2>
        <ol class="breadcrumb">
            <li>
                <a href="index.html">Home</a>
            </li>
            <li>
                <a ui-sref="rv">RIV List</a>
            </li>
            <li class="active">
                <strong>New RIV for IT</strong>
            </li>
        </ol>
    </div>
</div>
<div class="wrapper wrapper-content animated fadeInRight">
<div class="row">
    <div class="col-md-12 col-lg-12">
    </div>
</div>

<div class="row">
<div class="col-lg-12">
<div class="ibox float-e-margins">
<div class="ibox-title">
    <h5>Create New Requisition For Job Order</h5>
    <div class="ibox-tools ">
        <a ui-sref="rv"><i class="fa fa-times"></i></a>
    </div>
</div>
<div class="ibox-content">


<div ng-controller="addEditRvForJOCtrl">
<div class="row-top-buffer"></div>

<form ng-submit="processForm()" ng-show="showForm">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div class="col-md-3 col-lg-3">
                <label class="input-label" for="payee">Payee</label>
            </div>
            <div class="col-md-4 col-lg-4">
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-user"></i></span>
                    <select required="" class="form-control" id="payee">
                        <option value="">SELECT</option>
                        <option value="">Apple, Inc</option>
                        <option value="">Google, Inc</option>
                        <option value="">Oracle</option>
                    </select>
                </div>
            </div>
            <form-error err_field="errors.err_payee"></form-error>
        </div>
    </div>

    <div class="row-top-buffer"></div>

    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div class="col-md-3 col-lg-3">
                <label class="input-label" for="particulars">Particulars</label>
            </div>
            <div class="col-md-5 col-lg-5">
                <div class="input-group">
                    <textarea  maxlength="1024" rows="5" cols="59" ng-model="apv.particulars" id="particulars" class="form-control "
                               name="particulars" placeholder=""></textarea>
                </div>
            </div>
            <form-error err_field="errors.err_particulars"></form-error>
        </div>
    </div>

    <div class="row-top-buffer"></div>

    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div class="col-md-3 col-lg-3">
                <label class="input-label" for="vdate">Voucher Date</label>
            </div>
            <div class="col-md-2 col-lg-2">
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                    <input  type="text" class="input-sm form-control datepicker" id="vdate" name="vdate" value="05/14/2014">
                </div>
            </div>
            <form-error err_field="errors.err_apvDate"></form-error>
        </div>


    </div>

    <div class="row-top-buffer"></div>

    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div class="col-md-3 col-lg-3">
                <label class="input-label" for="checkDate">Check Date</label>
            </div>
            <div class="col-md-2 col-lg-2">
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                    <input type="text" class="input-sm form-control datepicker" id="checkDate" name="checkDate" value="05/14/2014">
                </div>
            </div>
            <form-error err_field="errors.err_checkDate"></form-error>
        </div>
    </div>

    <div class="row-top-buffer"></div>
    <div class="hr-line-dashed"></div>
    <div class="row-top-buffer"></div>

    <div class="row-top-buffer"></div>
    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div class="col-md-3 col-lg-3">
                <label class="input-label">Journal Entries</label>
            </div>
            <div class="col-md-9 col-lg-9">
                <div class="table-responsive white-bg">
                    <table class="table table-striped">
                        <thead>
                        <tr>

                            <th>Account</th>
                            <th><span class="pull-right">Debit</span></th>
                            <th><span class="pull-right">Credit</span></th>
                            <th style="width: 90px"></th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td class="hasSLAccount" data-container="body" data-toggle="popover" data-placement="right" title="SL Account" data-content="CITI hardware">00-11-2221 Office supplies</td>
                            <td><span class="pull-right">100.00</span></td>
                            <td><span class="pull-right"></span></td>
                            <td style="text-align: right">
                                <a href="" class="btn btn-white btn-sm"><i class="fa fa-pencil"></i></a>
                                <a href="" class="btn btn-white btn-sm"><i class="fa fa-trash-o"></i></a>
                            </td>
                        </tr>
                        <tr>
                            <td class="hasSLAccount" data-container="body" data-toggle="popover" data-placement="right" title="SL Account" data-content="Ace hardware">00-11-2221 Water pipes</td>
                            <td><span class="pull-right">45,562.00</span></td>
                            <td><span class="pull-right"></span></td>
                            <td style="text-align: right">
                                <a href="" class="btn btn-white btn-sm"><i class="fa fa-pencil"></i></a>
                                <a href="" class="btn btn-white btn-sm"><i class="fa fa-trash-o"></i></a>
                            </td>
                        </tr>
                        <tr>
                            <td>22-11-2221 Maybank - checking</td>
                            <td><span class="pull-right"></span></td>
                            <td><span class="pull-right">56,726.00</span></td>
                            <td style="text-align: right">
                                <a href="" class="btn btn-white btn-sm"><i class="fa fa-pencil"></i></a>
                                <a href="" class="btn btn-white btn-sm"><i class="fa fa-trash-o"></i></a>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <form-error err_field="errors.err_particulars"></form-error>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div class="col-md-3 col-lg-3">
            </div>
            <div class="col-md-9 col-lg-9 ">
                <a href="" class="btn btn-primary btn-sm pull-right"><i class="fa fa-plus-circle" title='Add'></i> Add Account </a>
            </div>
        </div>
    </div>

    <div class="row-top-buffer"></div>
    <div class="hr-line-dashed"></div>
    <div class="row-top-buffer"></div>

    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div class="col-md-3 col-lg-3">
                <label class="input-label" for="checker">Checker</label>
            </div>
            <div class="col-md-4 col-lg-4">
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-user"></i></span>
                    <select required="" class="form-control" id="checker">
                        <option value="">SELECT</option>
                        <option value="">John Doe</option>
                    </select>
                </div>
            </div>
            <form-error err_field="errors.err_checker"></form-error>
        </div>
    </div>

    <div class="row-top-buffer"></div>

    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div class="col-md-3 col-lg-3">
                <label class="input-label" for="auditor">Auditor</label>
            </div>
            <div class="col-md-4 col-lg-4">
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-user"></i></span>
                    <select required="" class="form-control" id="auditor">
                        <option value="">SELECT</option>
                        <option value="">John Doe</option>
                    </select>
                </div>
            </div>
            <form-error err_field="errors.err_checker"></form-error>
        </div>
    </div>

    <div class="row-top-buffer"></div>

    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div class="col-md-3 col-lg-3">
                <label class="input-label" for="approvar">Approving Officer</label>
            </div>
            <div class="col-md-4 col-lg-4">
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-user"></i></span>
                    <select required="" class="form-control" id="approvar">
                        <option value="">SELECT</option>
                        <option value="">John Doe</option>
                    </select>
                </div>
            </div>
            <form-error err_field="errors.err_approvar"></form-error>
        </div>
    </div>

    <div class="row-top-buffer"></div>

    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div class="col-md-3 col-lg-3">
            </div>
            <div class="col-md-4 col-lg-4">
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
</div>
</div>
</div>
</div>
</div>
</div>