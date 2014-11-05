<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="row">
    <div class="col-md-12 col-lg-12">

    </div>
</div>
<div class="row">
    <div class="col-md-12 col-lg-12">
        <div class="alert alert-info" style="margin-bottom: 5px;">Users <span class="pull-right" style="cursor: pointer"><i class="fa fa-plus" title="Add user" onclick="(window.location.href = '#/new')"></i></span></div>
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
        <div style='max-height: 500px; overflow: auto;' ng-controller="userListCtrl">
            <div ng-show="!users">Loading items...</div>
            <table class="table table-striped table-hover table-bordered">
                <thead>
                <tr>
                </tr>
                </thead>
                <tbody>
                <tr data-dismiss="modal" ng-repeat="user in us = (users | filter:query)">
                    <td style="width: 22%;">{{user.fullName}}</td>
                    <td style="width: 15%;">{{user.username}}</td>
                    <td style="width: 23%;">{{user.email}}</td>
                    <td style="width: 15%;">{{user.createdBy.username}}</td>
                    <td style="width: 15%;">{{user.updatedAt | date:'MMM dd, yyyy HH:mm a'}}</td>
                    <td style='width: 4%; vertical-align: middle'>
                        <a style='padding: 0' title='View' href="#/user/{{user.id}}"><i class='fa fa-search'></i></a>
                        <a style='padding: 0' title='Edit' href="#/user/{{user.id}}/edit"><i class='fa fa-edit'></i></a>
                    </td>
                </tr>
                <tr ng-show="us.length == 0"><td colspan="4" align="center">No records found</td></tr>
                </tbody>
            </table>
        </div>
    </div>
</div>


<%--roles here--%>



<div class="row">
    <div class="col-md-12 col-lg-12">

    </div>
</div>
<div class="row">
    <div class="col-md-12 col-lg-12">
        <div class="alert alert-info" style="margin-bottom: 5px;">Roles <span class="pull-right" style="cursor: pointer"><i class="fa fa-plus" title="Add role" onclick="(window.location.href = '#/new-role')"></i></span></div>
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
        <div style='max-height: 500px; overflow: auto;' ng-controller="roleListCtrl">
            <div ng-show="!roles">Loading roles...</div>
            <table class="table table-striped table-hover table-bordered">
                <thead>
                <tr>
                </tr>
                </thead>
                <tbody>
                <tr data-dismiss="modal" ng-repeat="role in r = (roles | filter:query)">
                    <td style="width: 22%;">{{role.name}}</td>
                    <td style="width: 20%;">{{role.updatedAt | date:'MMM dd, yyyy HH:mm a'}}</td>
                    <td style='width: 4%; vertical-align: middle; text-align: center'>
                        <a style='padding: 0' title='View' href="#/role/{{user.id}}"><i class='fa fa-search'></i></a>
                        <a style='padding: 0' title='Edit' href="#/role/{{user.id}}/edit"><i class='fa fa-edit'></i></a>
                    </td>
                </tr>
                <tr ng-show="r.length == 0"><td colspan="4" align="center">No records found</td></tr>
                </tbody>
            </table>
        </div>
    </div>
</div>