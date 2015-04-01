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
                <strong>New RIV for PO</strong>
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
    <h5>Create New Requisition For Purchase Order</h5>
    <div class="ibox-tools ">
        <a ui-sref="rv"><i class="fa fa fa-sign-out"></i></a>
    </div>
</div>
<div class="ibox-content">
<div ng-controller="addEditRvForPOCtrl">

<div class="row-top-buffer"></div>

<div class="row-top-buffer"></div>
<form ng-submit="processForm()" ng-show="showForm">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div class="col-md-3 col-lg-3">
                <label class="input-label" for="rvdate">Date</label>
            </div>
            <div class="col-md-2 col-lg-2">
                <div class="input-group date">
                    <span class="input-group-addon">
                        <i class="fa fa-calendar"></i>
                    </span>
                    <input type="text" class="form-control input-sm" id="rvdate" name="rvdate" value="05/14/2015">
                </div>
            </div>
            <form-error err_field="errors.err_payee"></form-error>
        </div>
    </div>

    <div class="row-top-buffer"></div>

    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div class="col-md-3 col-lg-3">
                <label class="input-label" for="deldate">Delivery Date</label>
            </div>
            <div class="col-md-2 col-lg-2">
                <div class="input-group date">
                    <span class="input-group-addon">
                        <i class="fa fa-calendar"></i>
                    </span>
                    <input type="text" class="form-control input-sm" id="deldate" name="deldate" value="05/14/2015">
                </div>
            </div>
            <form-error err_field="errors.err_payee"></form-error>
        </div>
    </div>

    <div class="row-top-buffer"></div>

    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div class="col-md-3 col-lg-3">
                <label class="input-label" for="purpose">Reason(s)/Purpose(s)</label>
            </div>
            <div class="col-md-7 col-lg-7">
                <div class="input-group">
                    <textarea maxlength="1024" rows="5" cols="59" class="form-control " ng-model="apv.particulars" id="purpose"
                              name="purpose" ></textarea>
                </div>
            </div>
            <form-error err_field="errors.err_particulars"></form-error>
        </div>
    </div>

    <div class="row-top-buffer"></div>
    <div class="hr-line-dashed"></div>
    <div class="row-top-buffer"></div>

    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div class="col-md-3 col-lg-3">
                <label class="input-label">Items to be Requested</label>
            </div>
            <div class="col-md-9 col-lg-9">
                <div class="table-responsive white-bg">
                    <table class="table table-striped">
                        <thead>
                        <tr >

                            <th style="text-align: center " >Item No.</th>
                            <th style="width: 420px">Description</th>
                            <th>Quantity</th>
                            <th style="width: 90px">Action</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td style="text-align: center">1</td>
                            <td>Ballpen Faber castel</td>
                            <td>&nbsp;&nbsp;2 pcs</td>
                            <td style="text-align: right">
                                <a href="" class="btn btn-white btn-sm"><i class="fa fa-pencil"></i></a>
                                <a href="" class="btn btn-white btn-sm"><i class="fa fa-trash-o"></i></a>
                            </td>
                        </tr>
                        <tr>
                            <td style="text-align: center">2</td>
                            <td>Bond paper long-S, 20-paper one</td>
                            <td>&nbsp;&nbsp;12 rimm</td>
                            <td style="text-align: right">
                                <a href="" class="btn btn-white btn-sm"><i class="fa fa-pencil"></i></a>
                                <a href="" class="btn btn-white btn-sm"><i class="fa fa-trash-o"></i></a>
                            </td>
                        </tr>
                        <tr>
                            <td style="text-align: center">3</td>
                            <td>Expandable file folder thick-green(long)</td>
                            <td>&nbsp;&nbsp;<strong>6</strong> pcs</td>
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
                <a href="" class="btn btn-primary btn-sm pull-right"><i class="fa fa-plus-circle" title='Add'></i> Add Item </a>
            </div>
        </div>
    </div>

    <div class="row-top-buffer"></div>
    <div class="hr-line-dashed"></div>
    <div class="row-top-buffer"></div>

    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div class="col-md-3 col-lg-3">
                <label class="input-label" for="request">Requested By</label>
            </div>
            <div class="col-md-4 col-lg-4">
                <div class="input-group">
                    <span class="input-group-addon">
                        <i class="fa fa-user"></i>
                    </span>
                    <select required="" class="form-control" id="request" tabindex="1">
                        <option value="">SELECT</option>
                        <option value="">Mikho Malto</option>
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
                <label class="input-label" for="recapp">Recommending Approval</label>
            </div>
            <div class="col-md-4 col-lg-4">
                <div class="input-group">
                    <span class="input-group-addon">
                        <i class="fa fa-user"></i>
                    </span>
                    <select required="" class="form-control" id="recapp">
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
                <label class="input-label" for="check">Checked By</label>
            </div>
            <div class="col-md-4 col-lg-4">
                <div class="input-group">
                    <span class="input-group-addon">
                        <i class="fa fa-user"></i>
                    </span>
                    <select required="" class="form-control" id="check">
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
                <label class="input-label" for="audit">Audited By</label>
            </div>
            <div class="col-md-4 col-lg-4">
                <div class="input-group">
                    <span class="input-group-addon">
                        <i class="fa fa-user"></i>
                    </span>
                    <select required="" class="form-control" id="audit">
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
                <label class="input-label" for="approve">Approved By</label>
            </div>
            <div class="col-md-4 col-lg-4">
                <div class="input-group">
                    <span class="input-group-addon">
                        <i class="fa fa-user"></i>
                    </span>
                    <select required="" class="form-control" id="approve">
                        <option value="">SELECT</option>
                        <option value="">John Doe</option>
                    </select>
                </div>
             </div>
            <form-error err_field="errors.err_checker"></form-error>
        </div>
    </div>

    <div class="row-top-buffer"></div>
    <div class="hr-line-dashed"></div>
    <div class="row-top-buffer"></div>
    <div class="row-top-buffer"></div>

    <div class="row">

        <div class="col-md-12 col-lg-12">
            <div class="col-md-3 col-lg-3">
            </div>
            <div class="col-md-7 col-lg-7">
                <fieldset ng-disabled="submitting">
                    <button class="btn  btn-primary"  ng-mousedown="submit = true" type="submit" ><span class="fa fa-save"></span> {{save}}</button>
                    <button type="reset" class="btn  btn-default"><span class="fa fa-refresh"></span> Reset</button>
                </fieldset>
            </div>
        </div>
    </div>
</form>
</div>
</div></div></div></div></div></div></div>
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