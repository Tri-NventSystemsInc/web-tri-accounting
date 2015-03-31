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
@RequestMapping(value = "/reports")
public class ReportsCenterController {

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @Autowired
    private RoleService roleService;

    private final String BASE_PATH = "reports/partials/";
    private final String MAIN = "reports/";

    // view providers
    @RequestMapping(value = "/accounting", method = RequestMethod.GET)
    public ModelAndView indexAccounting(HttpServletRequest request) {
        return ControllerHelper.getModelAndView(MAIN + "accounting", roleService, authenticationFacade.getLoggedIn().getId(), request.getRequestURI());
    }
}
