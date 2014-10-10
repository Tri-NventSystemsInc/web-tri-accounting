<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link href="<c:url value="/resources/css/inspinia/bootstrap.min.css" />" rel="stylesheet">
    <link href="/resources/fonts/inspinia/font-awesome/css/font-awesome.css" rel="stylesheet">
    <link href="/resources/css/inspinia/animate.css" rel="stylesheet">
    <link href="/resources/css/inspinia/style.css" rel="stylesheet">
    <title>Firefly | Login</title>
</head>
    <body class="gray-bg">
        <div class="middle-box text-center loginscreen  animated fadeInDown">
            <div>
                <div>
                    <img src="/resources/images/main/firefly1.png">
                </div>
                <h3>Welcome to <strong>ILECO I</strong></h3>
                <p>Accounting and Inventory System.
                    <!--Continually expanded and constantly improved Inspinia Admin Them (IN+)-->
                </p>
                <form method="post" action="${pageContext.request.contextPath}/login">
                    <fieldset>
                        <c:if test="${param.error != null}">
                            <div class="alert alert-danger">
                                Invalid username and password.
                            </div>
                        </c:if>
                        <c:if test="${param.logout != null}">
                            <div class="alert alert-info">
                                You have been logged out.
                            </div>
                        </c:if>

                        <div class="form-group">
                            <input type="text" class="form-control"  required="" id="username" name="username" placeholder="Username" />
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-control"  required="" id="password" name="password" placeholder="Password" />
                        </div>
                        <button type="submit" class="btn btn-primary block full-width m-b">Login</button>
                    </fieldset>
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

                </form>
                <p class="m-t"> <small><strong>Copyright</strong> Company Name &copy; 2014</small> </p>
            </div>
        </div>
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
        <script src="resources/js/inspinia/inspinia.js"></script>
        <!-- Angular scripts-->
        <script src="resources/js/inspinia/angular/angular.min.js"></script>
        <script src="resources/js/ui-router/angular-ui-router.min.js"></script>
        <script src="resources/js/bootstrap/ui-bootstrap-tpls-0.11.0.min.js"></script>
        <!-- Angular Dependiences -->
        <!-- Anglar App Script -->
        <script src="resources/js/inspinia/app.js"></script>
        <script src="resources/js/inspinia/config.js"></script>
        <script src="resources/js/inspinia/directives.js"></script>
        <script src="resources/js/inspinia/controllers.js"></script>
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
        <!-- Angular scripts-->
        <script src="resources/js/inspinia/angular/angular.min.js"></script>
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