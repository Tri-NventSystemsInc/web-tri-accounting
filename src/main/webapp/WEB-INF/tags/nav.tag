<%@ tag %>

<%--<div style="margin-top: 20px;"></div>
<ul class="nav nav-pills">
    <li class="active"><a href="/">Home</a></li>
    <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
            Setup <span class="caret"></span>
        </a>
        <ul class="dropdown-menu" role="menu">
            <li><a href="/admin/coa">Chart of Accounts</a></li>
            <li><a href="/admin/user">Users</a></li>
            <li><a href="/admin/supplier">Suppliers</a></li>
            <li><a href="/admin/item">Items</a></li>
        </ul>
    </li>
    <li><a href="/admin/showcase">Showcase</a></li>
    <li><a href="#">Test2</a></li>
    <li><a href="#">Test3</a></li>
</ul>--%>
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
            <li ui-sref-active="active">
                <a href="/admin/dashboard"><i class="fa fa-laptop"></i> <span class="nav-label">Dashboard</span> </a>
            </li>
            <li>
                <a><i class="fa fa-th-large"></i> <span class="nav-label">Coop</span> <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li ui-sref-active="active"><a ui-sref="coa">Chart of Accounts</a></li>
                    <li ui-sref-active="active"><a href="/admin/user">Users</a></li>
                    <li ui-sref-active="active"><a href="/admin/showcase">Showcase</a></li>

                </ul>
            </li>
            <li ui-sref-active="active">
                <a href="${pageContext.request.contextPath}/lockscreen"><i class="fa fa-laptop"></i> <span class="nav-label">Lock Screen</span> </a>
            </li>
        </ul>
    </div>
</nav>


