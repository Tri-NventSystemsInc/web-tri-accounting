<div ng-controller="browseMRCTCtrl">
    <div class="row-top-buffer"></div>
    <div class="row">
        <div class="col-md-12 col-lg-12">
            <a ui-sref="mrct2mir" class="btn btn-primary">Back to list</a>
        </div>
    </div>
    <div class="row-top-buffer"></div>
    <div class="row">

        <div class="col-md-12 col-lg-12">
            <div class="alert alert-info">{{title}}</div>
        </div>

        <div class="col-md-4">
            <div class="input-group"><input type="text" ng-model="itemDescription" placeholder="Search" class="input-sm form-control"> <span class="input-group-btn">
                                        <button type="button" class="btn btn-sm btn-primary"> Go!</button> </span></div>
        </div>

    </div>

    <div class="row-top-buffer"></div>

    <div class="row">
        <div class="col-md-12">
            <table class="table table-striped table-hover table-bordered">
                <thead>
                <tr>
                    <th>Reference No.</th>
                    <th>Date</th>
                    <th>Item Description</th>
                    <th>Quantity</th>
                    <th>Unit Cost</th>
                    <th>Item Cost</th>
                    <th>Prepared By</th>
                    <th>Issued By</th>
                    <th>Received By</th>
                    <th>Approved By</th>
                </tr>
                </thead>
                <tbody>
                <tr data-dismiss="modal" ng-repeat="item in mrctList | filter: itemDescription" ng-click="selectItem(item)">
                    <td style="width: 120px;">{{item.referenceNo}}</td>
                    <td style="width: 200px;">{{item.date}}</td>
                    <td style="width: 480px;">{{item.itemDescription}}</td>
                    <td style="width: 120px;">{{item.quantity}}</td>
                    <td style="width: 120px;">{{item.unitCost}}</td>
                    <td style="width: 120px;">{{item.itemCost}}</td>
                    <td style="width: 120px;">{{item.preparedBy}}</td>
                    <td style="width: 120px;">{{item.issuedBy}}</td>
                    <td style="width: 120px;">{{item.receivedBy}}</td>
                    <td style="width: 120px;">{{item.approvedBy}}</td>
                    <%--<td style="max-width: 300px;">{{item.segmentAccount.accountCode + ' ' + item.segmentAccount.account.title}}</td>--%>
                </tr>
                <tr ng-show="its.length == 0"><td colspan="4" align="center">No records found</td></tr>
                </tbody>
            </table>
        </div>
    </div>

    <%--<div modal="showModal" close="cancel()">--%>
        <%--<div class="modal-header">--%>
            <%--<h4>Modal Dialog</h4>--%>
        <%--</div>--%>
        <%--<div class="modal-body">--%>
            <%--<p>Example paragraph with some text.</p>--%>
        <%--</div>--%>
        <%--<div class="modal-footer">--%>
            <%--<button class="btn btn-success" ng-click="ok()">Okay</button>--%>
            <%--<button class="btn" ng-click="cancel()">Cancel</button>--%>
        <%--</div>--%>
    <%--</div>--%>

    <%--<div id="selectedItemModal" class="modal fade">--%>
        <%--<div class="modal-dialog">--%>
            <%--<div class="modal-content">--%>
                <%--<div class="modal-header">--%>
                    <%--<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>--%>
                    <%--<h4 class="modal-title">Modal title</h4>--%>
                <%--</div>--%>
                <%--<div class="modal-body">--%>
                    <%--<p>One fine body…</p>--%>
                <%--</div>--%>
                <%--<div class="modal-footer">--%>
                    <%--<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>--%>
                    <%--<button type="button" class="btn btn-primary">Save changes</button>--%>
                <%--</div>--%>
            <%--</div><!-- /.modal-content -->--%>
        <%--</div><!-- /.modal-dialog -->--%>
    <%--</div><!-- /.modal -->--%>

</div>