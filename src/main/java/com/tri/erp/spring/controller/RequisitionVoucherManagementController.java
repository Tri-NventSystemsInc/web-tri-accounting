package com.tri.erp.spring.controller;

import com.tri.erp.spring.commons.facade.AuthenticationFacade;
import com.tri.erp.spring.commons.helpers.ControllerHelper;
import com.tri.erp.spring.service.interfaces.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by TSI Admin on 11/13/2014.
 */

@Controller
@RequestMapping(value = "/requisition-voucher")
public class RequisitionVoucherManagementController {

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @Autowired
    private RoleService roleService;

    private final String BASE_PATH = "rv/partials/";
    private final String MAIN = "rv/main";

    // view providers
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request) {
        return ControllerHelper.getModelAndView(MAIN, roleService, authenticationFacade.getLoggedIn().getId(), request.getRequestURI());
    }

    @RequestMapping(value = "/new-rvPO-page", method = RequestMethod.GET)
    public String newRvPO(HttpServletRequest request) {
        Boolean hasPermissionOnMethod = roleService.isRouteAuthorized(authenticationFacade.getLoggedIn().getId(), request.getRequestURI());
        return hasPermissionOnMethod ? (BASE_PATH + "add-edit-for-PO") : "403";
    }

    @RequestMapping(value = "/new-rvIT-page", method = RequestMethod.GET)
    public String newRvIT(HttpServletRequest request) {
        Boolean hasPermissionOnMethod = roleService.isRouteAuthorized(authenticationFacade.getLoggedIn().getId(), request.getRequestURI());
        return hasPermissionOnMethod ? (BASE_PATH + "add-edit-for-IT") : "403";
    }

    @RequestMapping(value = "/new-rvJO-page", method = RequestMethod.GET)
    public String newRvJO(HttpServletRequest request) {
        Boolean hasPermissionOnMethod = roleService.isRouteAuthorized(authenticationFacade.getLoggedIn().getId(), request.getRequestURI());
        return hasPermissionOnMethod ? (BASE_PATH + "add-edit-for-JO") : "403";
    }
}
