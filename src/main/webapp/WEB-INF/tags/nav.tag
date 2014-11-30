<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<nav class="navbar-default navbar-static-side" role="navigation">
    <div class="sidebar-collapse">
        <ul side-navigation class="nav" id="side-menu">
            <li>

             <div class="dropdown profile-element">
                    <!-- Picture of user -->
                    <!--<img alt="image" class="img-circle" src="img/profile_small.jpg"/>-->

                    <div align="center">
                        <div class="row" style="height:30px;"></div>
                        <div><img src="/resources/images/main/ileco.png"></div>
                        <div class="row" style="height:30px;"></div>
                    </div>
                    <ul class="dropdown-menu animated fadeInRight m-t-xs">

                        <li><a href="">Logout</a></li>
                    </ul>
                </div>
                <div class="logo-element">
                    Firefly
                </div>

            </li>
            <li  ui-sref-active="active">
                <a ui-sref="dashboard"><i class="fa fa-laptop"></i> <span class="nav-label">Dashboard</span> </a>
            </li>
            <li>
                <a><i class="fa fa-th-large"></i> <span class="nav-label">Coop</span> <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <c:forEach items="${menus}" var="menu">
                        <c:if test="${menu.state != null && fn:length(menu.state) > 0}">
                            <li ui-sref-active="active">
                                <a ui-sref="${menu.state}"><i class="${menu.iconClass}"></i><span class="nav-label">${menu.title}</span></a>
                            </li>
                        </c:if>
                    </c:forEach>
                </ul>
            </li>
        </ul>
    </div>
</nav>


