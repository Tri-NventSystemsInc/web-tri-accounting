<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
<%--<link href="<c:url value="/resources/css/bootstrap/bootstrap-theme.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/custom/app.css" />" rel="stylesheet">--%>

 <%--   <link href="/resources/css/bootstrap.min.css" rel="stylesheet">--%>
    <link href="/resources/font-awesome/css/font-awesome.css" rel="stylesheet">

    <link href="/resources/css/animate.css" rel="stylesheet">
    <link href="/resources/css/style.css" rel="stylesheet">



    <title>Firefly | Login</title>
</head>
<body class="gray-bg">
<%--<div class="container">
	<div class="row-top-buffer"></div>
	<form  class="m-t" name="f" method="post" action="${pageContext.request.contextPath}/login">
		<div class="row">
			<div class="col-md-4 col-md-offset-4" style="border: solid 1px gray;"> 
		            <fieldset>
		                <legend>Please Login:</legend>
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
		                
		                <div class="row">
					      <div class="col-md-4">
				      	    <label for="username">Username</label>
				      	  </div>
					      <div class="col-md-8">
					      	<div class="input-group">
								  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
								  <input class="form-control" type="text" id="username" name="username" placeholder="Username" />
							</div>     
					      </div>
					    </div>  
					    
					    <div class="row row-top-buffer">
					      <div class="col-md-4">
					         <label for="password">Password</label>
					      </div>
					      <div class="col-md-8"> 
						      <div class="input-group">
								  <span class="input-group-addon">@</span>
								  <input class="form-control" type="password" id="password" name="password" placeholder="Password" />
							  </div>
						  </div>
					    </div>  
					    
					    <div class="row row-top-buffer">
					      <div class="col-md-4">
					         <label for="password">&nbsp;</label>
					      </div>
					      <div class="col-md-8 form-actions">
		                    <button type="submit" class="btn btn-primary">Log in</button> 
					      </div>
					    </div>   
					    
					    <div class="row row-top-buffer"> 
					    </div> 
		            </fieldset>
		        	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/> 
	 		</div>
	 	</div>
 	</form>
</div> --%>

<div class="middle-box text-center loginscreen  animated fadeInDown">
    <div>
        <div>

            <img src="/resources/img/firefly1.png">

        </div>
        <h3>Welcome to Company Name</h3>
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

 <%--<script src="<c:url value="/resources/js/jquery/jquery-1.11.1.min.js" />"></script>
    <script src="<c:url value="/resources/js/bootstrap/bootstrap.min.js" />"></script> --%>
</body>
</html>