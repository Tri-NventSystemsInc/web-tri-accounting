<%@ tag %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="head" fragment="true" %>
<%@ attribute name="nav" fragment="true" %>
<%@ attribute name="topnav" fragment="true" %>
<%@ attribute name="footer" fragment="true" %>
<%@ attribute name="body" fragment="true" %>
<%@ taglib prefix="my" tagdir="/WEB-INF/tags" %>


<%--<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">--%>
<!DOCTYPE html>
<%--<html lang="en">
<head>

    <my:header/>
    <jsp:invoke fragment="head"/>
</head>
<body>
<div class="container">
    <my:nav />
    <hr/>
    <jsp:invoke fragment="body"/>
<my:footer />
</div>
</body>
</html>--%>


<html ng-app="inspinia">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta charset="utf-8">



    <!-- Page title set in pageTitle directive -->
    <title page-title></title>
    <!-- Bootstrap and Fonts -->
    <link href="<c:url value="/resources/css/inspinia/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/fonts/inspinia/font-awesome/css/font-awesome.css" />" rel="stylesheet">

    <!-- Main Inspinia CSS files -->
    <link href="<c:url value="/resources/css/inspinia/animate.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/inspinia/style.css" />" rel="stylesheet">

</head>

<!-- ControllerAs syntax -->
<!-- Main controller with serveral data used in Inspinia theme on diferent view -->
<body ng-controller="MainCtrl as main">

<!-- Wrapper-->
<div id="wrapper">

    <!-- Navigation -->
    <div>
        <my:nav/>

    </div>

    <!-- Page wraper -->
    <!-- ng-class with current state name give you the ability to extended customization your view -->
    <div id="page-wrapper" class="gray-bg {{$state.current.name}}">

        <!-- Page wrapper -->
        <div>
            <my:topnav/>

        </div>

        <!-- Main view  -->
        <!-- <div ui-view></div> -->

        <!-- Footer -->
        <div >
            <my:footer/>
        </div>

    </div>
    <!-- End page wrapper-->

</div>
<!-- End wrapper-->


<!-- jQuery and Bootstrap -->
<script src="<c:url value="/resources/js/jquery/inspinia/jquery-2.1.1.min.js" />"></script>
<script src="<c:url value="/resources/js/plugins/jquery-ui/jquery-ui.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap/inspinia/bootstrap.min.js" />"></script>

<!-- MetsiMenu -->
<script src="<c:url value="/resources/js/plugins/metisMenu/jquery.metisMenu.js" />"></script>

<!-- Peace JS -->
<script src="<c:url value="/resources/js/plugins/pace/pace.min.js" />"></script>

<!-- SlimScroll -->
<script src="<c:url value="/resources/js/plugins/slimscroll/jquery.slimscroll.min.js" />"></script>

<!-- Custom and plugin javascript -->
<script src="<c:url value="/resources/js/inspinia/inspinia.js" />"></script>

<!-- Angular scripts-->
<script src="<c:url value="/resources/js/angular/inspinia/angular.min.js" />"></script>
<script src="<c:url value="/resources/js/ui-router/angular-ui-router.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap/inspinia/ui-bootstrap-tpls-0.11.0.min.js" />"></script>

<!-- Angular Dependiences -->

<!-- Anglar App Script -->
<script src="<c:url value="/resources/js/inspinia/app.js" />"></script>
<script src="<c:url value="/resources/js/inspinia/config.js" />"></script>
<script src="<c:url value="/resources/js/inspinia/directives.js" />"></script>
<script src="<c:url value="/resources/js/inspinia/controllers.js" />"></script>

</body>
</html>


