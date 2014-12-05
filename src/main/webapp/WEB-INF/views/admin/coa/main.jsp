<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytag" %>

<link href="<c:url value="/resources/css/treeGrid/treeGrid.css" />" rel="stylesheet">

<div ui-view>
    <div class="wrapper wrapper-content animated fadeInRight">
        <div class="row">
            <div class="row" style="height:10px;"></div>
            <div class="col-lg-12">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>Chart of Accounts</h5>

                        <div ibox-tools="" class="ng-scope"><div class="ibox-tools dropdown">
                            <a ng-click="showhide()"> <i class="fa fa-chevron-up"></i></a>
                            <a class="dropdown-toggle" href="" aria-haspopup="true" aria-expanded="false">
                                <i class="fa fa-wrench"></i>
                            </a>
                            <ul class="dropdown-menu dropdown-user">
                                <li><a href="">Config option 1</a>
                                </li>
                                <li><a href="">Config option 2</a>
                                </li>
                            </ul>
                            <a ng-click="closebox()"><i class="fa fa-times"></i></a>
                        </div>
                        </div>
                    </div>
                    <div class="ibox-content">
                        <div class="row">
                            <div class="col-sm-5 m-b-xs"><select class="input-sm form-control input-s-sm inline">
                                <option value="0">Option 1</option>
                                <option value="1">Option 2</option>
                                <option value="2">Option 3</option>
                                <option value="3">Option 4</option>
                            </select>
                            </div>
                            <div class="col-sm-4 m-b-xs">
                                <div data-toggle="buttons" class="btn-group">
                                    <label class="btn btn-sm btn-white"> <input type="radio" id="option1" name="options"> Day </label>
                                    <label class="btn btn-sm btn-white active"> <input type="radio" id="option2" name="options"> Week </label>
                                    <label class="btn btn-sm btn-white"> <input type="radio" id="option3" name="options"> Month </label>
                                </div>
                            </div>
                            <div class="col-sm-3">
                                <div class="input-group"><input type="text" placeholder="Search" class="input-sm form-control"> <span class="input-group-btn">
                                            <button type="button" class="btn btn-sm btn-primary"> Go!</button> </span></div>
                            </div>
                        </div>
                        <div class="table-responsive">
                            <table class="table table-striped">
                                <thead>
                                <tr>

                                    <th></th>
                                    <th>Project</th>
                                    <th>Completed</th>
                                    <th>Task</th>
                                    <th>Date</th>
                                    <th>Action</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td><div class="icheckbox_square-green checked" style="position: relative;"><input icheck="" type="checkbox" ng-model="main.checkOne" class="ng-pristine ng-valid" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; border: 0px; opacity: 0; background: rgb(255, 255, 255);"></ins></div></td>
                                    <td>Project
                                        <small>This is example of project</small>
                                    </td>
                                    <td><pie-chart data="main.PieChart4.data" options="main.PieChart4.options" class="ng-isolate-scope"><span class="" style="display: none;">1,4</span><svg class="peity" height="16" width="16"><path d="M 8 8 L 8 0 A 8 8 0 0 1 15.60845213036123 5.52786404500042 Z" fill="#1ab394"></path><path d="M 8 8 L 15.60845213036123 5.52786404500042 A 8 8 0 1 1 7.999999999999998 0 Z" fill="#d7d7d7"></path></svg></pie-chart></td>
                                    <td>20%</td>
                                    <td>Jul 14, 2013</td>
                                    <td><a href=""><i class="fa fa-check text-navy"></i></a></td>
                                </tr>
                                <tr>
                                    <td><div class="icheckbox_square-green" style="position: relative;"><input icheck="" type="checkbox" ng-model="main.unCheck1" class="ng-pristine ng-valid" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; border: 0px; opacity: 0; background: rgb(255, 255, 255);"></ins></div></td>
                                    <td>Alpha project</td>
                                    <td><pie-chart data="main.PieChart3.data" options="main.PieChart3.options" class="ng-isolate-scope"><span class="" style="display: none;">0.52,1.561</span><svg class="peity" height="16" width="16"><path d="M 8 8 L 8 0 A 8 8 0 0 1 15.999997720941021 7.993961379422852 Z" fill="#1ab394"></path><path d="M 8 8 L 15.999997720941021 7.993961379422852 A 8 8 0 1 1 7.999999999999998 0 Z" fill="#d7d7d7"></path></svg></pie-chart></td>
                                    <td>40%</td>
                                    <td>Jul 16, 2013</td>
                                    <td><a href=""><i class="fa fa-check text-navy"></i></a></td>
                                </tr>
                                <tr>
                                    <td><div class="icheckbox_square-green" style="position: relative;"><input icheck="" type="checkbox" ng-model="main.unCheck2" class="ng-pristine ng-valid" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; border: 0px; opacity: 0; background: rgb(255, 255, 255);"></ins></div></td>
                                    <td>Betha project</td>
                                    <td><pie-chart data="main.PieChart2.data" options="main.PieChart2.options" class="ng-isolate-scope"><span class="" style="display: none;">226,360</span><svg class="peity" height="16" width="16"><path d="M 8 8 L 8 0 A 8 8 0 0 1 13.265355172426087 14.022958982776313 Z" fill="#1ab394"></path><path d="M 8 8 L 13.265355172426087 14.022958982776313 A 8 8 0 1 1 7.999999999999998 0 Z" fill="#d7d7d7"></path></svg></pie-chart></td>
                                    <td>75%</td>
                                    <td>Jul 18, 2013</td>
                                    <td><a href=""><i class="fa fa-check text-navy"></i></a></td>
                                </tr>
                                <tr>
                                    <td><div class="icheckbox_square-green" style="position: relative;"><input icheck="" type="checkbox" ng-model="main.unCheck3" class="ng-pristine ng-valid" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; border: 0px; opacity: 0; background: rgb(255, 255, 255);"></ins></div></td>
                                    <td>Gamma project</td>
                                    <td><pie-chart data="main.PieChart5.data" options="main.PieChart5.options" class="ng-isolate-scope"><span class="" style="display: none;">226,134</span><svg class="peity" height="16" width="16"><path d="M 8 8 L 8 0 A 8 8 0 1 1 2.2452815972907922 13.55726696367198 Z" fill="#1ab394"></path><path d="M 8 8 L 2.2452815972907922 13.55726696367198 A 8 8 0 0 1 7.999999999999998 0 Z" fill="#d7d7d7"></path></svg></pie-chart></td>
                                    <td>18%</td>
                                    <td>Jul 22, 2013</td>
                                    <td><a href=""><i class="fa fa-check text-navy"></i></a></td>
                                </tr>
                                </tbody>
                            </table>
                        </div>

                    </div>
                </div>
            </div>

        </div>
    </div>
    <div class="row">
        <div class="col-md-12 col-lg-12">
            <a ui-sref=".new" class="btn btn-primary">Add</a>
            <a class="btn btn-primary" target="_blank" ng-href="{{url}}"  ng-mousedown="printCoa('pdf')">Print</a>
        </div>
    </div>

    <div class="row">
        <div class="col-md-12 col-lg-12">
            <div id="search-div" class="col-md-4 col-lg-4">
            </div>
            <div class="col-md-8 col-lg-8">
                <div class="pull-right">
                    <button ng-init="init()" ng-click="accounts_tree.expand_all()" class="btn btn-default btn-sm">Expand All</button>
                    <button ng-click="accounts_tree.collapse_all()" class="btn btn-default btn-sm">Collapse All</button>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div  class="col-md-12 col-lg-12">
            <div ng-show="true">
                <tree-grid tree-data="tree_data" tree-control="accounts_tree" col-defs="col_defs" expand-on="expanding_property"
                           on-select="accounts_tree_handler(branch)" expand-level="5" icon-expand="glyphicon glyphicon-tag"
                           icon-collapse="glyphicon glyphicon-tags" icon-leaf="glyphicon glyphicon-list-alt"></tree-grid>
            </div>
        </div>
    </div>
</div>