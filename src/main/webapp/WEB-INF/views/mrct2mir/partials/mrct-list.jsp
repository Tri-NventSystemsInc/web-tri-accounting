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
                <tr data-toggle="modal"
                    data-target="#showModal" data-dismiss="modal" ng-repeat="item in mrctList | filter: itemDescription" ng-click="selectItem(item)">
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





    <div class="modal fade" id="showModal" tabindex="-1" role="dialog" aria-labelledby="basicModal" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">x</button>
                    <h4 class="modal-title" id="myModalLabel">Current Selection - {{selectedItemData.referenceNo}}</h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <span>Reference Number:</span>
                        <span>{{selectedItemData.referenceNo}}</span>
                    </div>
                    <div class="form-group">
                        <span>Date:</span>
                        <span>{{selectedItemData.date}}</span>
                    </div>
                    <div class="form-group">
                        <span>Description:</span>
                        <span>{{selectedItemData.itemDescription}}</span>
                    </div>
                    <div class="form-group">
                        <span>Quantity:</span>
                        <span>{{selectedItemData.quantity}}</span>
                    </div>
                    <div class="form-group">
                        <span>Unit Cost:</span>
                        <span>{{selectedItemData.unitCost}}</span>
                    </div>
                    <div class="form-group">
                        <span>Item Cost:</span>
                        <span>{{selectedItemData.itemCost}}</span>
                    </div>
                    <div class="form-group">
                        <span>Prepared By:</span>
                        <span>{{selectedItemData.preparedBy}}</span>
                    </div>
                    <div class="form-group">
                        <span>Issued By:</span>
                        <span>{{selectedItemData.issuedBy}}</span>
                    </div>
                    <div class="form-group">
                        <span>Received By:</span>
                        <span>{{selectedItemData.receivedBy}}</span>
                    </div>
                    <div class="form-group">
                        <span>Approved By:</span>
                        <span>{{selectedItemData.approvedBy}}</span>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary">Post</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                </div>
            </div>
        </div>
    </div>



</div>