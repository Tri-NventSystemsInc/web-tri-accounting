<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytag" %>

<div  ui-view>
    <div ng-controller="acbCtrl">
        <p>You selected account: <b>{{selectedAccount ? (selectedAccount.segmentAccountCode + ' ' + selectedAccount.title) : 'None'}}</b></p>
        <div account-browser-s btn_label="Browse accounts" handler="accounts_selection_handler(account)" />
    </div>
    <p></p>
    <div ng-controller="sleCtrl">

        <p>You selected entity: <b>{{selectedEntity ? (selectedEntity.accountNo + ' ' + selectedEntity.name) : 'None'}}</b></p>
        <button sl-entity-browser
                types="entityTypes1"
                handler="entity_selection_handler"
                class="btn btn-primary">Browse entity 1</button>

        <p>You selected entity: <b>{{selectedEntity2 ? (selectedEntity2.accountNo + ' ' + selectedEntity2.name) : 'None'}}</b></p>
        <button sl-entity-browser
                types="entityTypes2"
                handler="entity_selection_handler2"
                class="btn btn-primary">Browse entity 2</button>
    </div>
    <p></p>
    <div ng-controller="itemCtrl">

        <p>You selected item: <b>{{selectedItem ? (selectedItem.code + ' ' + selectedItem.description) : 'None'}}</b></p>
        <div item-browser btn_label="Browse items" handler="item_selection_handler(item)" />

        <p></p>
        <a class="btn btn-primary" title="export to excel" target="_blank" ng-href="{{url}}"  ng-mousedown="export('xls')">Export items to excel</a>
    </div>
</div>