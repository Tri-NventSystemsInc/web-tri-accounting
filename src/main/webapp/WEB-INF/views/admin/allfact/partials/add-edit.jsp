
<div ng-controller="addEditFactorCtrl">
    <div class="row">
        <div class="col-md-12 col-lg-12">
            <a ui-sref="allocationFactor" class="btn btn-primary">Back to list</a>
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
                    <label class="input-label" for="account">Account</label>
                </div>
                <div class="col-md-5 col-lg-5">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-filter"></i></span>
                        <input value="" disabled ng-model="selectedAccount.title" id="account" name="account" class="form-control"  type="text" placeholder="Browse an account"/>
                    </div>
                </div>
                <div class="col-md-5 col-lg-5">
                    <button title="browse account" type="button" class="btn btn-primary glyphicon glyphicon-new-window" ng-click="showAccountBrowser()"></button>
                </div>
            </div>
        </div>

        <div class="row-top-buffer"></div>

        <div class="row">
            <div class="col-md-12 col-lg-12">
                <div class="col-md-2 col-lg-2">
                    <label class="input-label" for="account">Segments</label>
                </div>
                <div class="col-md-5 col-lg-5">
                    <ul style="padding-top: 8px; padding-left: 0px;" class="list-unstyled">
                        <li ng-repeat="segment in businessSegments">
                            <div class="row">
                                <div class="col-md-12 col-lg-12" style="padding-left: 0px; padding-right: 0px;">
                                    <div class="col-md-9 col-lg-9">
                                        <label style="font-weight: normal">{{segment.description}}</label>
                                    </div>
                                    <div class="col-md-3 col-lg-3">
                                        <input ng-change="checkSum(segment, '{{segment.factor}}')" autocomplete="off" ng-init="segment.factor = segment.hasOwnProperty('factor') ? segment.factor : 0" max="100" min="0" step="0.5" ng-model="segment.factor" id="name" name="name" class="form-control" type="number"/>
                                    </div>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="row">
                            <div class="col-md-12 col-lg-12" style="padding-left: 0px; padding-right: 0px;">
                                <div class="col-md-9 col-lg-9">
                                </div>
                                <div class="col-md-3 col-lg-3">
                                    <label style="padding-left: 14px;">{{getPercentageSum()}}</label>
                                </div>
                            </div>
                </div>
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
                        <button ng-mousedown="submit = true" type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-floppy-disk"></span> {{ save }}</button>
                        <button type="reset" class="btn btn-default"><span class="glyphicon glyphicon-refresh"></span> Reset</button>
                    </fieldset>
                </div>
            </div>
        </div>
    </form>

    <div ng-include="modalBodyTemplateUrl" class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true"></div>
</div>

<div style="padding-bottom: 100px;"></div>


