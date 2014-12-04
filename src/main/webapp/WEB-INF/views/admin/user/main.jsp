<div style="margin-bottom: 50px;">

    <div class="panel blank-panel ui-tab">

        <div class="panel-heading">
            <div class="panel-title m-b-md"><h4>Users & Roles</h4></div>
        </div>

        <div class="panel-body">
            <tabset>
                <tab heading="Users">
                    <div ui-view="userPartial"  autoscroll="false">
                        <div ng-controller="userListCtrl">
                            <div class="row">
                                <div class="col-md-12 col-lg-12">

                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12 col-lg-12">
                                    <span class="pull-right" style="cursor: pointer"><a ui-sref="user.new"><i class="fa fa-plus" title="Add user"></i></a></span>
                                </div>
                            </div>

                            <div class="row-top-buffer" style="margin-top: 15px"></div>

                            <div class="row">
                                <div class="col-md-12 col-lg-12">
                                    <div class="input-group" style="width: 300px">
                                        <input class="form-control" placeholder="Search" ng-model="query_u" />
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-search"></i></span>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12 col-lg-12">

                                    <div class="row-top-buffer" style="margin-top: 15px"></div>

                                    <div style="border-top: 1px solid #dcdcdc; padding-top: 10px">
                                        <div class="col-md-3 col-lg-3"><span style="font-weight: bold; padding-right: 0;">Full name</span></div>
                                        <div class="col-md-2 col-lg-2" style="padding-left: 0"><span style="font-weight: bold;">Username</span></div>
                                        <div class="col-md-3 col-lg-3" style="padding-left: 0"><span style="font-weight: bold;">Email</span></div>
                                        <div class="col-md-2 col-lg-2" style="padding-left: 0; padding-right: 0;"><span style="font-weight: bold;">Created by</span></div>
                                        <div class="col-md-2 col-lg-2" style="padding-left: 0"><span style="font-weight: bold;">Last updated</span></div>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12 col-lg-12">
                                    <div class="row-top-buffer" style="margin-top: 5px"/>
                                    <div ng-controller="userListCtrl">
                                        <div ng-show="!users">Loading items...</div>
                                        <table class="table table-striped table-hover table-bordered">
                                            <thead>
                                            <tr>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <tr data-dismiss="modal" ng-repeat="user in us = (users | filter:query_u)">
                                                <td style="width: 22%;">{{user.fullName}}</td>
                                                <td style="width: 15%;">{{user.username}}</td>
                                                <td style="width: 23%;">{{user.email}}</td>
                                                <td style="width: 15%;">{{user.createdBy.username}}</td>
                                                <td style="width: 15%;">{{user.updatedAt | date:'MMM dd, yyyy HH:mm a'}}</td>
                                                <td style='width: 4%; vertical-align: middle'>
                                                    <a style='padding: 0' title='View' ui-sref=".userDetail({userId: user.id})"><i class='fa fa-search'></i></a>
                                                    <a style='padding: 0' title='Edit' ui-sref=".userEdit({userId: user.id})"><i class='fa fa-edit'></i></a>
                                                </td>
                                            </tr>
                                            <tr ng-show="us.length == 0"><td colspan="4" align="center">No records found</td></tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </tab>
                <tab heading="Roles">

                    <div ui-view="rolePartial" autoscroll="false">

                        <div ng-controller="roleListCtrl">
                            <div class="row">
                                <div class="col-md-12 col-lg-12">

                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12 col-lg-12">
                                    <span class="pull-right" style="cursor: pointer"><a ui-sref="user.newRole"><i class="fa fa-plus" title="Add role"></i></a></span>
                                </div>
                            </div>

                            <div class="row-top-buffer" style="margin-top: 15px"></div>

                            <div class="row">
                                <div class="col-md-12 col-lg-12">
                                    <div class="input-group" style="width: 300px">
                                        <input class="form-control" placeholder="Search" ng-model="query_r" />
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-search"></i></span>
                                    </div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-12 col-lg-12">

                                    <div class="row-top-buffer" style="margin-top: 15px"></div>

                                    <div style="border-top: 1px solid #dcdcdc; padding-top: 10px">
                                        <div class="col-md-6 col-lg-6"><span style="font-weight: bold; padding-right: 10;">Name</span></div>
                                        <div class="col-md-2 col-lg-2" style="padding-left: 0"><span style="font-weight: bold; padding-right: 150;">Last updated</span></div>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12 col-lg-12">
                                    <div class="row-top-buffer" style="margin-top: 5px"/>
                                    <div ng-controller="roleListCtrl">
                                        <div ng-show="!roles">Loading roles...</div>
                                        <table class="table table-striped table-hover table-bordered">
                                            <thead>
                                            <tr>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <tr data-dismiss="modal" ng-repeat="role in r = (roles | filter:query_r)">
                                                <td style="width: 22%;">{{role.name}}</td>
                                                <td style="width: 20%;">{{role.updatedAt | date:'MMM dd, yyyy HH:mm a'}}</td>
                                                <td style='width: 4%; vertical-align: middle; text-align: center'>
                                                    <a style='padding: 0' title='View' ui-sref=".roleDetail({roleId: role.id})"><i class='fa fa-search'></i></a>
                                                    <a style='padding: 0' title='Edit' ui-sref=".roleEdit({roleId: role.id})"><i class='fa fa-edit'></i></a>
                                                </td>
                                            </tr>
                                            <tr ng-show="r.length == 0"><td colspan="4" align="center">No records found</td></tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </tab>
            </tabset>

        </div>

    </div>

</div>