<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytag" %>

<mytag:master>
    <jsp:attribute name="head">
    </jsp:attribute>
    <jsp:attribute name="body">
        <div ng-app="stockWithApp">
            <table class="table h6" ng-controller="StockWithdrawalTmpController">
                <thead>
                <tr>
                    <th>Reference No</th>
                    <th>Date</th>
                    <th>Purpose</th>
                </tr>
                </thead>
                <tbody ng-repeat="tmp in stockList">
                <tr>
                    <td>{{tmp.referenceNumber}}</td>
                    <td>{{tmp.transactionDate}}</td>
                    <td>{{tmp.purpose}}</td>
                </tr>
                </tbody>
            </table>
        </div>
    </jsp:attribute>
</mytag:master>

<script>
    var stockWithApp = angular.module('stockWithApp', []);

    stockWithApp.controller('StockWithdrawalTmpController', function ($scope, $http) {
        $http.get('inventory/stockwithdrawal/all').success(function(data) {
            $scope.stockList = data;
        });
    });
</script>