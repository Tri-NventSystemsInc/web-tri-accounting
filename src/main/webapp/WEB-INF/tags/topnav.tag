<%@ tag %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<div class="row border-bottom ng-scope">
    <nav class="navbar navbar-static-top white-bg" role="navigation" style="margin-bottom: 0">
        <div class="navbar-header">
            <span minimaliza-sidebar></span>
            <form role="search" class="navbar-form-custom" method="post" action="">
                <div class="form-group">

                </div>
            </form>
        </div>

        <ul class="nav navbar-top-links navbar-right">
            <li>
                <a href="${pageContext.request.contextPath}/login">
                    <i class="fa fa-sign-out"></i> Log out
                </a>
            </li>
        </ul>
        <ul class="nav navbar-top-links navbar-right">
            <li>
                <span class="m-r-sm text-muted welcome-message"><span class="label label-primary"><strong>Firefly v1.0</strong></span></span>
            </li>
            <li class="dropdown">
                <a class="dropdown-toggle count-info" href>
                    <i class="fa fa-bell"></i> <span class="label label-danger">8</span>
                </a>
                <ul class="dropdown-menu dropdown-alerts">
                    <li>
                        <div class="text-center link-block">
                            <a ui-sref="notifications_tooltips">
                                <strong>See All Pendings</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </div>
                    </li>
                </ul>
            </li>

        </ul>

    </nav>
</div>