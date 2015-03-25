<div ui-view>
    <div class="row">
        <div class="col-md-12 col-lg-12">
        </div>
    </div>

    <div class="row">
        <div class="col-lg-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>List of Journal Vouchers </h5>
                </div>
                <div class="ibox-content">
                    <div class="row">
                        <div class="col-sm-3">
                            <a ui-sref="jv.new" class="btn btn-primary">Create</a>
                        </div>
                        <div class="col-sm-3 pull-right">
                            <div class="input-group"><input type="text" placeholder="Search" class="input-sm form-control"> <span class="input-group-btn">
                                        <button type="button" class="btn btn-sm btn-primary"> Go!</button> </span></div>
                        </div>
                    </div>
                    <div class="table-responsive">
                        <table class="table table-striped">
                            <thead>
                            <tr>

                                <th>Code</th>
                                <th>Particulars</th>
                                <th><span class="pull-right">Amount</span></th>
                                <th>Date</th>
                                <th>Status</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>JV-201501</td>
                                <td>To record Green Core Power Cost for the month of January.</td>
                                <td><span class="pull-right">$ 1,300.00</span></td>
                                <td>Jan 14, 2015</td>
                                <td><span class="label label-danger">For recommendation</span></td>
                            </tr>
                            <tr>
                                <td>JV-201502</td>
                                <td>To record Green Core Power Cost for the month of February.</td>
                                <td><span class="pull-right">$ 453,562.00</span></td>
                                <td>Feb 14, 2015</td>
                                <td><span class="label label-warning">Pending</span></td>
                            </tr>
                            <tr>
                                <td>JV-201503</td>
                                <td>To record Green Core Power Cost for the month of March.</td>
                                <td><span class="pull-right">$ 356,726.00</span></td>
                                <td>Mar 24, 2015</td>
                                <td><span class="label label-info">Approved</span></td>
                            </tr>
                            <tr>
                                <td>JV-201504</td>
                                <td>To record Green Core Power Cost for the month of August.</td>
                                <td><span class="pull-right">$ 31,600.00</span></td>
                                <td>Aug 13, 2015</td>
                                <td><span class="label label-primary">For Approval</span></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
