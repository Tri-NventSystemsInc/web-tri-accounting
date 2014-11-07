<div ng-controller="addEditRoleCtrl">
    <div class="row">
        <div class="col-md-12 col-lg-12">
            <button class="btn btn-primary" onclick="(window.location.href = '#/users')">Users & Groups</button>
        </div>
    </div>
    <div class="row-top-buffer"></div>
    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div class="alert alert-info">{{ title }}</div>
        </div>
    </div>
    <form ng-submit="processForm()" ng-show="showForm">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                    <label class="input-label" for="name">Name</label>
                </div>
                <div class="col-md-5 col-lg-5">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                        <input required maxlength="512" ng-model="role.name" id="name" name="name" class="form-control" type="text" placeholder="Enter role name"/>
                    </div>
                </div>
                <div class="col-md-5 col-lg-5">
                    <span style="color: red !important;" ng-show="errors.err_name">
                        <ul class="error-list">
                            <li ng-repeat="err in errors.err_name">
                                {{ err }}
                            </li>
                        </ul>
                    </span>
                </div>
            </div>
        </div>

        <div style="margin-top: 20px;" class="row-top-buffer"></div>

        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                    <label class="input-label" for="name">Modules</label>
                </div>
                <div class="col-md-10 col-lg-10">
                    <ul style="list-style: none; padding-left: 2px;">
                        <li ng-repeat="menu in menus">
                            <label class="{{menu.parentMenu != null ? 'sub-menu' : ''}}" style="cursor: pointer">
                                <input ng-model="menu.selected" type="checkbox" ng-click="toggleParent(menu)"/> {{menu.title}}
                            </label>
                        </li>
                    </ul>
                </div>
            </div>
        </div>

        <div class="row-top-buffer"></div>

        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                </div>
                <div class="col-md-5 col-lg-5">
                    <fieldset ng-disabled="submitting">
                        <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-floppy-disk"></span> {{ save }}</button>
                        <button type="reset" class="btn btn-default"><span class="glyphicon glyphicon-refresh"></span> Reset</button>
                    </fieldset>
                </div>
            </div>
        </div>
    </form>
</div>


