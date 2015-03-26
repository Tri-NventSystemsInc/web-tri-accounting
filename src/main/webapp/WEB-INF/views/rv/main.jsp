

<div ui-view>
    <div class="row wrapper border-bottom white-bg page-heading">
        <div class="col-lg-9">
            <h2><b>Requisition Issue Voucher</b></h2>
            <ol class="breadcrumb">
                <li>
                    <a href="index.html">Home</a>
                </li>
                <li class="active">
                    <strong>RIV List</strong>
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
                            <h5>List of Requested Issue Voucher/s</h5>
                            <div class="ibox-tools ">
                                <a href="index.html"><i class="fa fa fa-sign-out"></i></a>
                            </div>
                        </div>
                        <div class="ibox-content">
                            <div class="row">
                                <div class="col-sm-3">
                                    <div class="btn-group" dropdown >
                                        <button type="button" class="btn btn-primary btn-sm dropdown-toggle"><i class="fa fa-file-o"></i>&nbsp;&nbsp;
                                            Create New&nbsp;<span class="caret"></span>
                                        </button>

                                        <ul class="dropdown-menu" role="menu">
                                            <li><a ui-sref="rv.newPO" ng-click="open()"><i class="fa fa-file-o "></i>&nbsp;&nbsp;<strong>Purchase Order</strong>  Request</a></li>
                                            <li><a ui-sref="rv.newJO"><i class="fa fa-file-o "></i>&nbsp;&nbsp;<strong>Job Order</strong> Request</a></li>
                                            <li><a ui-sref="rv.newIT"><i class="fa fa-file-o "></i>&nbsp;&nbsp;<strong>Info Tech</strong> Request</a></li>
                                            <li><a ui-sref="rv.newRep"><i class="fa fa-file-o "></i>&nbsp;&nbsp;<strong>Repair</strong> Request</a></li>
                                            <li><a ui-sref="rv.newLab"><i class="fa fa-file-o "></i>&nbsp;&nbsp;<strong>Labor</strong> Request</a></li>
                                        </ul>
                                    </div>

                                   <%-- <button type="button" id="refresh" class="btn btn-default btn-sm"><i class="fa fa-refresh"></i> Refresh</button>--%>
                                </div>



                                <div class="col-sm-3 pull-right">
                                    <input type="search" placeholder="Search" class="input-sm form-control">
                                </div>


                              </div>
                            <div class="table-responsive project-list">
                                <table class="table table-striped ">
                                    <thead>
                                    <tr>
                                        <th>Status</th>
                                        <th>Reference</th>
                                        <th>Particular</th>
                                        <th>Prepared by</th>
                                        <th>Type</th>
                                        <th>Actions/Views</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <%--rec--%>
                                    <tr >
                                        <td class="project-status" style="width: 100px">
                                            <span class="label label-default " ><i class="fa fa-flag-o"></i>&nbsp;Document Created</span>
                                        </td>
                                        <td style="width: 220px" align="center">

                                            <small>RIV No.</small><br>
                                            <small><strong>RIV-2014-01-0001</strong></small><br>
                                            <small>Date of Delivery</small><br>
                                            <small><strong>Jul 20, 2013</strong></small>

                                        </td>
                                        <td style="width:600px" class="project-title" >
                                            <small>Purpose:</small><br>
                                            <small><strong>Labor for Network/Electrical rewiring & rearrangement using wiring ducts, etc.</strong></small><br>
                                            <small>Remarks:</small><br>
                                            <small><strong></strong></small>

                                        </td>
                                        <td style="width:300px" align="center">
                                            <div class="feed-element">
                                                <a>
                                                    <img alt="image" class="img-circle" src="/resources/images/pix/a1.jpg">
                                                </a>
                                                <div>
                                                    <small><strong>Tony Zerna</strong></small><br>
                                                    <small> MIS Head</small> <br>
                                                    <small class="text-muted">Created: Jul 14, 2013</small>
                                                </div>
                                            </div>
                                        </td>
                                       <td>
                                            <span class="label label-warning-light " style="width: 100px">PO</span>
                                        </td>
                                        <td  style="width: 150px" align="center">
                                            <div class="btn-group" dropdown >
                                                <button type="button" class="btn  btn-primary btn-group btn-sm dropdown-toggle"><i class="fa fa-hand-o-right"></i>&nbsp;&nbsp;
                                                    Actions/Views&nbsp;<span class="caret"></span>
                                                </button>

                                                <ul class="dropdown-menu" role="menu">
                                                    <li><a ui-sref=""><i class="fa fa-print "></i>&nbsp;&nbsp;<strong>Print</strong> RIV</a></li>
                                                    <li><a ui-sref=""><i class="fa fa-edit "></i>&nbsp;&nbsp;<strong>Edit</strong> RIV</a></li>
                                                    <li><a ui-sref=""><i class="fa fa-send-o "></i>&nbsp;&nbsp;<strong>Send</strong> For Canvass</a></li>
                                                    <li class="divider"></li>
                                                    <li><a ui-sref=""><i class="fa fa-list-alt "></i>&nbsp;&nbsp;<strong>Signatories</strong> View</a></li>
                                                    <li><a ui-sref=""><i class="fa fa-pencil-square-o"></i>&nbsp;&nbsp;<strong>Timeline</strong> View</a></li>
                                                </ul>
                                            </div>
                                        </td>
                                    </tr>


                                    </tbody>
                                </table>
                            </div>


                        </div>
                    </div>

                </div>
            </div>
        </div>
</div>
