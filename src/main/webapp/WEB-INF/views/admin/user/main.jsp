<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytag" %>

<mytag:master>
    <jsp:attribute name="head">
        <link href="<c:url value="/resources/css/treeGrid/treeGrid.css" />" rel="stylesheet">
    </jsp:attribute>
    <jsp:attribute name="body">
        <div ng-app="userManagement">
            <div id="coa-content" ng-view>Loading...</div>
        </div>
    </jsp:attribute>
</mytag:master>

<script src="<c:url value="/resources/js/app/routes/user-management-route.js" />"></script>
<script src="<c:url value="/resources/js/app/factories/user-factory.js" />"></script>
<script src="<c:url value="/resources/js/app/controllers/user-management-ctrl.js" />"></script>