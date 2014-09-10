<div class="row">
    <div class="col-md-12 col-lg-12">
        <div class="alert alert-info">Add an account</div>
    </div>
</div>
<form id="add-account-form" method="POST">
    <div class="row">
        <div class="col-md-7 col-lg-7">
            <div class="col-md-3 col-lg-3">
                <label class="input-label" for="code">Code</label>
            </div>
            <div class="col-md-5 col-lg-5">
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                    <input id="code" name="code" class="form-control" type="text" placeholder="Auto generated" disabled/>
                </div>
            </div>
        </div>
    </div>
    <div class="row-top-buffer"></div>
    <div class="row">
        <div class="col-md-7 col-lg-7">
            <div class="col-md-3 col-lg-3">
                <label class="input-label" for="title">Title</label>
            </div>
            <div class="col-md-9 col-lg-9">
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                    <input id="title" name="title" class="form-control" type="text" placeholder="Enter account title"/>
                </div>
            </div>
        </div>
    </div>

    <div class="row-top-buffer"></div>
    <div class="row">
        <div class="col-md-7 col-lg-7">
            <div class="col-md-3 col-lg-3">
                <label class="input-label" for="gl_acct">GL Account</label>
            </div>
            <div class="col-md-5 col-lg-5">
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                    <input id="gl_acct" name="gl_acct" class="form-control" type="text" placeholder="Enter GL account"/>
                </div>
            </div>
        </div>
    </div>

    <div class="row-top-buffer"></div>
    <div class="row">
        <div class="col-md-7 col-lg-7">
            <div class="col-md-3 col-lg-3">
                <label class="input-label" for="sl_acct">SL Account</label>
            </div>
            <div class="col-md-5 col-lg-5">
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                    <input id="sl_acct" name="sl_acct" class="form-control" type="text" placeholder="Enter SL account"/>
                </div>
            </div>
        </div>
    </div>

    <div class="row-top-buffer"></div>
    <div class="row">
        <div class="col-md-7 col-lg-7">
            <div class="col-md-3 col-lg-3">
                <label class="input-label" for="auxilliary_acct">Auxiliary Account</label>
            </div>
            <div class="col-md-5 col-lg-5">
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                    <input id="auxilliary_acct" name="auxilliary_acct" class="form-control" type="text" placeholder="Enter auxiliary account"/>
                </div>
            </div>
        </div>
    </div>

    <div class="row-top-buffer"></div>
    <div class="row">
        <div class="col-md-7 col-lg-7">
            <div class="col-md-3 col-lg-3">
                <label class="input-label" for="normal_balance">Normal balance</label>
            </div>
            <div class="col-md-5 col-lg-5">
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                    <select id="normal_balance" name="normal_balance" class="form-control">
                        <option value="1">Debit</option>
                        <option value="2">Credit</option>
                    </select>
                </div>
            </div>
        </div>
    </div>

    <div class="row-top-buffer"></div>
    <div class="row">
        <div class="col-md-7 col-lg-7">
            <div class="col-md-3 col-lg-3">
                <label class="input-label" for="acct_group_id">Group</label>
            </div>
            <div class="col-md-9 col-lg-9">
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                    <select id="acct_group_id" name="acct_group_id" class="form-control">
                        <option value="0">Select group</option>
                        <option value="29">Accounts Payable</option>
                        <option value="14">Accounts Receivable Items-Under Litigation</option>
                        <option value="32">Accrued Interest</option>
                    </select>
                </div>
            </div>
        </div>
    </div>


    <div class="row-top-buffer"></div>
    <div class="row">
        <div class="col-md-7 col-lg-7">
            <div class="col-md-3 col-lg-3">
                <label class="input-label" for="acct_type_id">Type</label>
            </div>
            <div class="col-md-9 col-lg-9">
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                    <select id="acct_type_id" name="acct_type_id" class="form-control">
                        <option value="0">Select type</option>
                        <option value="1">Asset</option>
                        <option value="2">Liabilities</option>
                        <option value="3">Members' Equity and Margins</option>
                        <option value="4">Revenue</option>
                        <option value="5">Cost and Expenses</option>
                    </select>
                </div>
            </div>
        </div>
    </div>


    <div class="row-top-buffer"></div>
    <div class="row">
        <div class="col-md-7 col-lg-7">
            <div class="col-md-3 col-lg-3">
                <label class="input-label" for="parent_acct_id">Parent account</label>
            </div>
            <div class="col-md-9 col-lg-9">
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                    <select id="parent_acct_id" name="parent_acct_id" class="form-control">
                        <option value="0">Select parent</option>
                        <option value="19">ASSETS</option>
                        <option value="20">NON-CURRENT ASSETS</option>
                        <option value="32">CURRENT ASSETS</option>
                        <option value="147">LIABILITIES</option>
                        <option value="149">NON CURRENT LIABILITIES</option>
                        <option value="227">CURRENT LIABILITIES</option>
                        <option value="286">MARGINS</option>
                        <option value="303">REVENUES</option>
                        <option value="331">COST AND EXPENSES</option>
                    </select>
                </div>
            </div>
        </div>
    </div>


    <div class="row-top-buffer"></div>
    <div class="row">
        <div class="col-md-7 col-lg-7">
            <div class="col-md-3 col-lg-3">
            </div>
            <div class="col-md-9 col-lg-9">
                <div class="inline-group">
                    <label style="margin-right: 20px;"><input type="checkbox" id="has_sl" name="has_sl"> Has SL</label>
                    <label style="margin-right: 20px;"><input type="checkbox" id="is_header" name="is_header"> Is Header</label>
                    <label><input type="checkbox" id="isActive" name="isActive"> Active</label>
                </div>
            </div>
        </div>
    </div>

    <div class="row-top-buffer"></div>
    <div class="row">
        <div class="col-md-7 col-lg-7">
            <div class="col-md-3 col-lg-3">
            </div>
            <div class="col-md-5 col-lg-5">
                <button type="reset" class="btn btn-default">Reset</button>
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </div>
    </div>
</form>