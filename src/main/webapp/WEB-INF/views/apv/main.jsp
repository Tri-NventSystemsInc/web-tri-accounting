<div ui-view>
    <div class="row">
        <div class="col-md-12 col-lg-12">
        </div>
    </div>

    <div class="row">
        <div class="col-lg-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>List of Accounts Payable Vouchers </h5>
                </div>
                <div class="ibox-content">
                    <div class="row">
                        <div class="col-sm-3">
                            <a ui-sref="apv.new" class="btn btn-primary">Create</a>
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
                                <th>Supplier</th>
                                <th><span class="pull-right">Amount</span></th>
                                <th>Particulars</th>
                                <th>Date</th>
                                <th>Status</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>APV-201301</td>
                                <td>Apple, Inc</td>
                                <td><span class="pull-right">$ 100.00</span></td>
                                <td>Please attach needed docs!</td>
                                <td>Jul 14, 2013</td>
                                <td><span class="label label-danger">For recommendation</span></td>
                            </tr>
                            <tr>
                                <td>APV-201302</td>
                                <td>Pinterest</td>
                                <td><span class="pull-right">$ 45,562.00</span></td>
                                <td>Please pin it home!</td>
                                <td>Feb 14, 2008</td>
                                <td><span class="label label-warning">Pending</span></td>
                            </tr>
                            <tr>
                                <td>APV-201303</td>
                                <td>Instagram</td>
                                <td><span class="pull-right">$ 56,726.00</span></td>
                                <td>Please view my recent selfie!</td>
                                <td>Dec 24, 2012</td>
                                <td><span class="label label-info">Approved</span></td>
                            </tr>
                            <tr>
                                <td>APV-201304</td>
                                <td>Samsung</td>
                                <td><span class="pull-right">$ 1,600.00</span></td>
                                <td>Please attach the S6 edge</td>
                                <td>Aug 13, 2014</td>
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
