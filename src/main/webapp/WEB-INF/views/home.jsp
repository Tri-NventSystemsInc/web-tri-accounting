<%-- 
    Document   : admin
    Created on : 06 26, 14, 11:55:53 AM
    Author     : TSI Admin
--%>
<%--<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%--<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ILECO - Firefly 1.0.0</title>
    </head>
    <body>
        <h1>Dashboard</h1>

        <form  action="${pageContext.request.contextPath}/logout" method="post">
            <input type="submit" value="Log out" />
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
    </body>
</html>--%>

<html ng-app="inspinia">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Page title set in pageTitle directive -->
    <title page-title></title>

    <!-- Bootstrap and Fonts -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/font-awesome/css/font-awesome.css" rel="stylesheet">

    <!-- Main Inspinia CSS files -->
    <link href="resources/css/animate.css" rel="stylesheet">
    <link href="resources/css/style.css" rel="stylesheet">

</head>

<!-- ControllerAs syntax -->
<!-- Main controller with serveral data used in Inspinia theme on diferent view -->
<body ng-controller="MainCtrl as main">

<!-- Wrapper-->
<div id="wrapper">

    <!-- Navigation -->
    <div ng-include="'/resources/views/common/navigation.jsp'"></div>

    <!-- Page wraper -->
    <!-- ng-class with current state name give you the ability to extended customization your view -->
    <div id="page-wrapper" class="gray-bg {{$state.current.name}}">

        <!-- Page wrapper -->
        <div ng-include="'/resources/views/common/topnavbar.jsp'"></div>

        <!-- Main view  -->
        <!-- <div ui-view></div> -->

        <!-- Footer -->
        <div ng-include="'/resources/views/common/footer.jsp'"></div>

    </div>
    <!-- End page wrapper-->

</div>
<!-- End wrapper-->


<!-- jQuery and Bootstrap -->
<script src="resources/js/jquery/jquery-2.1.1.min.js"></script>
<script src="resources/js/plugins/jquery-ui/jquery-ui.js"></script>
<script src="resources/js/bootstrap/bootstrap.min.js"></script>

<!-- MetsiMenu -->
<script src="resources/js/plugins/metisMenu/jquery.metisMenu.js"></script>

<!-- Peace JS -->
<script src="resources/js/plugins/pace/pace.min.js"></script>

<!-- SlimScroll -->
<script src="resources/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>

<!-- Custom and plugin javascript -->
<script src="resources/js/inspinia.js"></script>

<!-- Angular scripts-->
<script src="resources/js/angular/angular.min.js"></script>
<script src="resources/js/ui-router/angular-ui-router.min.js"></script>
<script src="resources/js/bootstrap/ui-bootstrap-tpls-0.11.0.min.js"></script>

<!-- Angular Dependiences -->

<!-- Anglar App Script -->
<script src="resources/js/app.js"></script>
<script src="resources/js/config.js"></script>
<script src="resources/js/directives.js"></script>
<script src="resources/js/controllers.js"></script>

</body>
</html>
