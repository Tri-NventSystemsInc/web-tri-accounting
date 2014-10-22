<%@ tag %>

<%@ attribute name="head" fragment="true" %>
<%@ attribute name="topnav" fragment="true" %>
<%@ attribute name="body" fragment="true" %>
<%@ taglib prefix="my" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


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

    <my:header/>
    <jsp:invoke fragment="head"/>
</head>
<!-- ControllerAs syntax -->
<!-- Main controller with serveral data used in Inspinia theme on diferent view -->
<!--<body ng-controller="MainCtrl as main">-->
<body>
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
            <jsp:invoke fragment="topnav"/>
        </div>

        <!-- Main view  -->
         <div><jsp:invoke fragment="body"/> </div>

        <!-- Footer -->
        <div >
            <my:footer/>
        </div>

    </div>
    <!-- End page wrapper-->

</div>
<!-- End wrapper-->




</body>
</html>


