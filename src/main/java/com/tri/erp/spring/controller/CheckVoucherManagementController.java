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
@RequestMapping(value = "/check-voucher")
public class CheckVoucherManagementController {

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @Autowired
    private RoleService roleService;

    private final String BASE_PATH = "cv/partials/";
    private final String MAIN = "cv/main";

    // view providers
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView index() {
        return ControllerHelper.getModelAndView(MAIN, roleService, authenticationFacade.getLoggedIn().getId());
    }

    @RequestMapping(value = "/new-cv-page", method = RequestMethod.GET)
    public String newCv(HttpServletRequest request) {
        Boolean hasPermissionOnMethod = roleService.isAuthorized(authenticationFacade.getLoggedIn().getId(), request.getRequestURI());
        return hasPermissionOnMethod ? (BASE_PATH + "add-edit") : "403";
    }
}
