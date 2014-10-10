<%--
  Created by IntelliJ IDEA.
  User: ENGKOI
  Date: 10/6/2014
  Time: 11:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<nav class="navbar-default navbar-static-side" role="navigation">
    <div class="sidebar-collapse">
        <ul side-navigation class="nav" id="side-menu">
            <li class="nav-header">

                <div class="dropdown profile-element">
                    <!-- Picture of user -->
                    <!--<img alt="image" class="img-circle" src="img/profile_small.jpg"/>-->
                    <a class="dropdown-toggle" href>

                        <small>Company Logo</small>

                    </a>
                    <ul class="dropdown-menu animated fadeInRight m-t-xs">
                        <li><a href="">Logout</a></li>
                    </ul>
                </div>
                <div class="logo-element">
                    Firefly
                </div>

            </li>
            <li ui-sref-active="active">
                <a ui-sref="main"><i class="fa fa-laptop"></i> <span class="nav-label">Dashboards</span> </a>
            </li>
            <li>
                <a href="index.html"><i class="fa fa-th-large"></i> <span class="nav-label">Coop</span> <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li ui-sref-active="active"><a ui-sref="dashboard_1">Chart of Accounts</a></li>
                    <li ui-sref-active="active"><a ui-sref="dashboard_2">Supplier</a></li>
                    <li ui-sref-active="active"><a ui-sref="dashboard_3">Item</a></li>
                    <li ui-sref-active="active"><a ui-sref="dashboard_3">Supplier</a></li>
                </ul>
            </li>

            <li>
                <a href=""><i class="fa fa-paper-plane"></i> <span class="nav-label">Create New</span><span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">

                    <li ui-sref-active="active"><a ui-sref="morris_chart">Requisition</a></li>
                    <li ui-sref-active="active"><a ui-sref="rickshaw_chart">Purchase Order</a></li>
                    <li ui-sref-active="active"><a ui-sref="flot_chart">Job Order</a></li>
                </ul>
            </li>
            <li>
                <a ui-sref="inbox"><i class="fa fa-envelope"></i> <span class="nav-label">Pending</span><span class="label label-warning pull-right">16</span></a>
                <ul class="nav nav-second-level">
                    <li ui-sref-active="active"><a ui-sref="inbox">Inbox</a></li>
                    <li ui-sref-active="active"><a ui-sref="email_view">Email view</a></li>
                    <li ui-sref-active="active"><a ui-sref="email_compose">Compose email</a></li>
                </ul>
            </li>
            <li>
                <a ui-sref="inbox"><i class="fa fa-envelope"></i> <span class="nav-label">Check</span><span class="label label-info pull-right">8</span></a>
                <ul class="nav nav-second-level">
                    <li ui-sref-active="active"><a ui-sref="inbox">Inbox</a></li>
                    <li ui-sref-active="active"><a ui-sref="email_view">Email view</a></li>
                    <li ui-sref-active="active"><a ui-sref="email_compose">Compose email</a></li>
                </ul>
            <li>
                <a ui-sref="inbox"><i class="fa fa-envelope"></i> <span class="nav-label">Audit</span><span class="label label pull-right">3</span></a>
                <ul class="nav nav-second-level">
                    <li ui-sref-active="active"><a ui-sref="inbox">Inbox</a></li>
                    <li ui-sref-active="active"><a ui-sref="email_view">Email view</a></li>
                    <li ui-sref-active="active"><a ui-sref="email_compose">Compose email</a></li>
                </ul>
            </li>
            </li>
        </ul>

    </div>
</nav>