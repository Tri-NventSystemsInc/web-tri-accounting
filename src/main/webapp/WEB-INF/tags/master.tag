<%@ tag %>

<%@ attribute name="head" fragment="true" %>
<%@ attribute name="topnav" fragment="true" %>
<%@ attribute name="body" fragment="true" %>
<%@ taglib prefix="my" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" ng-app="inspinia">
<head>
    <my:header/>
    <jsp:invoke fragment="head"/>
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
    <div id="page-wrapper" class="gray-bg">

        <!-- Page wrapper -->
        <div>
            <my:topnav/>
            <jsp:invoke fragment="topnav"/>
        </div>

        <!-- Main view  -->
         <div ui-view><jsp:invoke fragment="body"/> </div>

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


    <%--Chart of accounts--%>
<script src="<c:url value="/resources/js/app/module/coa.js" />"></script>
<script src="<c:url value="/resources/js/app/factories/account-factory.js" />"></script>
<script src="<c:url value="/resources/js/app/factories/business-segment-factory.js" />"></script>
<script src="<c:url value="/resources/js/app/services/error-handler-service.js" />"></script>
<script src="<c:url value="/resources/js/app/services/account-service.js" />"></script>
<script src="<c:url value="/resources/js/app/services/jquery-fn-wrapper-service.js" />"></script> 
<script src="<c:url value="/resources/js/app/directives/tree-grid-directive.js" />"></script>
<script src="<c:url value="/resources/js/app/directives/form-error.js" />"></script>

<!-- Anglar App Script -->
<script src="<c:url value="/resources/js/inspinia/app.js" />"></script>
<script src="<c:url value="/resources/js/inspinia/config.js" />"></script>
<script src="<c:url value="/resources/js/inspinia/directives.js" />"></script>
<script src="<c:url value="/resources/js/inspinia/controllers.js" />"></script>

 <%--toaster--%>
<script src="<c:url value="/resources/js/toastr/toastr.min.js" />"></script>

 <%--firefly--%>
<script src="<c:url value="/resources/js/app/common/firefly.js" />"></script>

</body>
</html>



