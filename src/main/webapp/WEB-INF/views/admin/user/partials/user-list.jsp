<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<<<<<<< HEAD

<div class="row">
    <div class="col-md-12 col-lg-12">
        <button class="btn btn-primary" onclick="(window.location.href = '#/new')">Add</button>
    </div>
</div>
<div class="row">
    <div class="col-lg-12 col-md-12">
        <div class="row-top-buffer" style="margin-top: 15px"/>
        <div class='row' style="border-top: 1px solid #dcdcdc; padding-top: 10px">
            <div class="col-md-1 col-lg-1"><span style="font-weight: bold; padding-left: 2px;">Full name</span></div>
            <div class="col-md-5 col-lg-5"><span style="font-weight: bold; padding-left: 30px;">Description</span></div>
            <div class="col-md-1 col-lg-1"><span style="font-weight: bold">Unit</span></div>
            <div class="col-md-5 col-lg-5"><span style="font-weight: bold">Account</span></div>
        </div>
        <div class="row-top-buffer" style="margin-top: 5px"/>
        <div class="row" style='max-height: 500px; overflow: auto;'>
            <div ng-show="!items">Loading users...</div>
            <table class="table table-striped table-hover table-bordered">
                <thead>
                <tr>
                </tr>
                </thead>
                <tbody>
                <tr data-dismiss="modal" ng-repeat="item in its = (items | filter:query)" style="cursor: pointer" ng-click="selectItem(item)">
                    <td style="width: 100px;">{{item.code}}</td>
                    <td style="width: 480px;">{{item.description}}</td>
                    <td>{{item.unit.code}}</td>
                    <td style="max-width: 300px;">{{item.segmentAccount.accountCode + ' ' + item.segmentAccount.account.title}}</td>
                </tr>
                <tr ng-show="its.length == 0"><td colspan="4" align="center">No records found</td></tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
=======
<div class="row">
    <div class="col-md-12 col-lg-12">
    </div>
</div>
<div id='msgbox' title='' style='display:none'></div>
<div class="row">
    Users here!
</div>
>>>>>>> e8c629dbc8992dd16bd6fe8be124d1877cf2c5e7
