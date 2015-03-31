<div ng-controller="addEditRvForPOCtrl">
<div class="row-top-buffer"></div>
<div class="row">
    <div class="col-md-12 col-lg-12">
        <a ui-sref="rv" class="btn btn-primary">Back to list</a>
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
                <label class="input-label" for="rvdate">Date</label>
            </div>
            <div class="col-md-5 col-lg-5">
                <div class="input-group date">
                    <span class="input-group-addon">
                        <i class="fa fa-calendar">
                        </i>
                    </span>
                    <input class="datepicker" type="text" class="input-sm form-control" id="rvdate" name="rvdate" value="05/14/2014">
                </div>
            </div>
            <form-error err_field="errors.err_payee"></form-error>
        </div>
    </div>

    <div class="row-top-buffer"></div>

    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div class="col-md-2 col-lg-2">
                <label class="input-label" for="deldate">Del. Date</label>
            </div>
            <div class="col-md-5 col-lg-5">
                <div class="input-group date">
                    <span class="input-group-addon">
                        <i class="fa fa-calendar">
                        </i>
                    </span>
                    <input class="datepicker" type="text" class="input-sm form-control" id="deldate" name="deldate" value="05/14/2014">
                </div>
            </div>
            <form-error err_field="errors.err_payee"></form-error>
        </div>
    </div>

    <div class="row-top-buffer"></div>

    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div class="col-md-2 col-lg-2">
                <label class="input-label" for="purpose">Reason(s)/Purpose(s)</label>
            </div>
            <div class="col-md-5 col-lg-5">
                <div class="input-group">
                    <textarea  maxlength="1024" rows="5" cols="59" ng-model="apv.particulars" id="purpose"
                               name="purpose" placeholder="Enter purpose"></textarea>
                </div>
            </div>
            <form-error err_field="errors.err_particulars"></form-error>
        </div>
    </div>

    <div class="row-top-buffer"></div>
    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div class="col-md-2 col-lg-2">
                <label class="input-label">Items to be Requested</label>
            </div>
            <div class="col-md-7 col-lg-7">
                <div class="table-responsive white-bg">
                    <table class="table table-striped">
                        <thead>
                        <tr>

                            <th style="text-align: center">Item No.</th>
                            <th>Description</th>
                            <th>Quantity</th>
                            <th style="width: 60px"></th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td style="text-align: center">1</td>
                            <td>Ballpen Faber castel</td>
                            <td>&nbsp;&nbsp;2 pcs</td>
                            <td style="text-align: center"><a style='padding: 0' title='Edit'><i class='fa fa-edit'></i></a>&nbsp;&nbsp;<a style='padding: 0' title='Remove'><i class='fa fa-minus'></i></a></td>
                        </tr>
                        <tr>
                            <td style="text-align: center">2</td>
                            <td>Bond paper long-S, 20-paper one</td>
                            <td>&nbsp;&nbsp;12 rimm</td>
                            <td style="text-align: center"><a style='padding: 0' title='Edit'><i class='fa fa-edit'></i></a>&nbsp;&nbsp;<a style='padding: 0' title='Remove'><i class='fa fa-minus'></i></a></td>
                        </tr>
                        <tr>
                            <td style="text-align: center">3</td>
                            <td>Expandable file folder thick-green(long)</td>
                            <td>&nbsp;&nbsp;6 pcs</td>
                            <td style="text-align: center"><a style='padding: 0' title='Edit'><i class='fa fa-edit'></i></a>&nbsp;&nbsp;<a style='padding: 0' title='Remove'><i class='fa fa-minus'></i></a></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td><span class="pull-right"></span></td>
                            <td><span class="pull-right"></span></td>
                            <td style="text-align: center"><a style='padding: 0' title='Add'><i item-browser handler="item_selection_handler1" class='fa fa-plus'></i></a></td>
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
                <label class="input-label" for="request">Requested By</label>
            </div>
            <div class="col-md-5 col-lg-5">
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                    <input disabled="" ng-model="selectedReqOfficer.name" id="request" name="request" class="form-control ng-pristine ng-valid" type="text" placeholder="Browse Requesting officer"/>
                </div>
            </div>
            <div class="col-md-5 col-lg-5">
                <button sl-entity-browser
                        handler="req_selection_handler"
                        types="signatories"
                        class="btn btn-primary">Browse Requesting Officer</button>
            </div>
            <form-error err_field="errors.err_checker"></form-error>
        </div>
    </div>

    <div class="row-top-buffer"></div>

    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div class="col-md-2 col-lg-2">
                <label class="input-label" for="recapp">Rec. Approval</label>
            </div>
            <div class="col-md-5 col-lg-5">
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                    <input disabled="" ng-model="selectedRecappOfficer.name" id="recapp" name="recapp" class="form-control ng-pristine ng-valid" type="text" placeholder="Browse Rec. Approval Officer"/>
                </div>
            </div>
            <div class="col-md-5 col-lg-5">
                <button sl-entity-browser
                        handler="recapp_selection_handler"
                        types="signatories"
                        class="btn btn-primary">Browse Rec. Approval Officer</button>
            </div>
            <form-error err_field="errors.err_checker"></form-error>
        </div>
    </div>

    <div class="row-top-buffer"></div>

    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div class="col-md-2 col-lg-2">
                <label class="input-label" for="check">Checked By</label>
            </div>
            <div class="col-md-5 col-lg-5">
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                    <input disabled="" ng-model="selectedCheckerOfficer.name" id="check" name="check" class="form-control ng-pristine ng-valid" type="text" placeholder="Browse Checking Officer"/>
                </div>
            </div>
            <div class="col-md-5 col-lg-5">
                <button sl-entity-browser
                        handler="checker_selection_handler"
                        types="signatories"
                        class="btn btn-primary">Browse Checking Officer</button>
            </div>
            <form-error err_field="errors.err_checker"></form-error>
        </div>
    </div>

    <div class="row-top-buffer"></div>

    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div class="col-md-2 col-lg-2">
                <label class="input-label" for="audit">Audit By</label>
            </div>
            <div class="col-md-5 col-lg-5">
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                    <input disabled="" ng-model="selectedAuditorOfficer.name" id="audit" name="audit" class="form-control ng-pristine ng-valid" type="text" placeholder="Browse Auditing Officer"/>
                </div>
            </div>
            <div class="col-md-5 col-lg-5">
                <button sl-entity-browser
                        handler="auditor_selection_handler"
                        types="signatories"
                        class="btn btn-primary">Browse Auditing Officer</button>
            </div>
            <form-error err_field="errors.err_approvar"></form-error>
        </div>
    </div>

    <div class="row-top-buffer"></div>

    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div class="col-md-2 col-lg-2">
                <label class="input-label" for="approve">Approved By</label>
            </div>
            <div class="col-md-5 col-lg-5">
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                    <input disabled="" ng-model="selectedAppOfficer.name" id="approve" name="approve" class="form-control ng-pristine ng-valid" type="text" placeholder="Browse Approving Officer"/>
                </div>
            </div>
            <div class="col-md-5 col-lg-5">
                <button sl-entity-browser
                        handler="app_selection_handler"
                        types="signatories"
                        class="btn btn-primary">Browse Approving Officer</button>
            </div>
            <form-error err_field="errors.err_checker"></form-error>
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