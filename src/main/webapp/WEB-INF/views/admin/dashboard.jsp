<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytag" %>


<mytag:master>
    <jsp:attribute name="body">
      <div class="row  border-bottom white-bg dashboard-header">
    <div class="col-sm-3">
        <h2>Welcome Amelia</h2>
        <small>You have 42 messages and 6 notifications.</small>
        <ul class="list-group clear-list m-t">
            <li class="list-group-item fist-item">

                <span class="label label-success">10</span> Requisition Issue Voucher
            </li>
            <li class="list-group-item">

                <span class="label label-info">05</span> Check Voucher
            </li>
            <li class="list-group-item">

                <span class="label label-primary">02</span> Account Payable Voucher
            </li>
            <li class="list-group-item">

                <span class="label label-default">05</span> Job Order
            </li>
            <li class="list-group-item">

                <span class="label label-primary">04</span> Purchase Order
            </li>
        </ul>
    </div>
    <div class="col-sm-6">
    </div>


    </jsp:attribute>
</mytag:master>
