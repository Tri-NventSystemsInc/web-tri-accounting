<div class="inmodal">
    <div class="modal-header">
        <h4 class="modal-title">Select Supplier</h4>
    </div>
    <div class="modal-body">
        <div class="row">
            <div class="col-lg-12 col-md-12">
                <div class="row" style='max-height: 500px; overflow: auto;'>
                    <div ng-show="!slEntities">Loading entities...</div>
                    <table class="table table-striped table-hover table-bordered">
                        <thead>
                        <th class="sorting_desc" tabindex="0" aria-controls="DataTables_Table_2" rowspan="1" colspan="1" aria-label="Rendering engine: activate to sort column ascending" style="width: 90px;" aria-sort="descending">AcctNo</th>
                        <th class="sorting_desc" tabindex="0" aria-controls="DataTables_Table_2" rowspan="1" colspan="1" aria-label="Rendering engine: activate to sort column ascending" style="width: 188px;" aria-sort="descending">Name</th>
                        <th class="sorting_desc" tabindex="0" aria-controls="DataTables_Table_2" rowspan="1" colspan="1" aria-label="Rendering engine: activate to sort column ascending" style="width: 400px;" aria-sort="descending">Address</th>

                        </thead>
                        <tbody>
                        <tr data-dismiss="modal" ng-repeat="entity in entities = (slEntities | filter:query)" style="cursor: pointer" ng-click="selectEntity(entity)">
                            <td style="width: 100px;">{{entity.accountNo}}</td>
                            <td style="width: 480px;"> <img src="/resources/images/icons/supplier.png">{{entity.name}} <span class="label {{entityClass(entity.marker)}} pull-right">{{convert(entity.marker)}}</span></td>
                            <td>{{entity.address}}</td>
                        </tr>
                        <tr ng-show="entities.length == 0"><td colspan="3" align="center">No records found</td></tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <div class="modal-footer">
        <button type="button" class="btn btn-white" ng-click="close()">Close</button>
    </div>

</div>

