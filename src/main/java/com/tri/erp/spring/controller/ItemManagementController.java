package com.tri.erp.spring.controller;

import com.tri.erp.spring.commons.Debug;
import com.tri.erp.spring.commons.facade.AuthenticationFacade;
import com.tri.erp.spring.service.interfaces.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by TSI Admin on 11/13/2014.
 */

@Controller
@RequestMapping(value = "/admin/item")
public class ItemManagementController {

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @Autowired
    private RoleService roleService;

    private final String BASE_PATH = "admin/item/partials/";
    private final String MAIN = "admin/item/main";

    // view providers
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView index() {
        return getModelAndView(MAIN);
    }

    @RequestMapping(value = "/item-list-page", method = RequestMethod.GET)
    public String getItemListPage() {
        return BASE_PATH + "item-list";
    }

    @RequestMapping(value = "/new-item-page", method = RequestMethod.GET)
    public String newItem(HttpServletRequest request) {
        Boolean hasPermissionOnMethod = roleService.isAuthorized(authenticationFacade.getLoggedIn().getId(), request.getRequestURI());
        return hasPermissionOnMethod ? (BASE_PATH + "add-edit-item") : "403";
    }

    @RequestMapping(value = "/item-details-page", method = RequestMethod.GET)
    public ModelAndView itemDetails() {
        return getModelAndView(BASE_PATH + "item-details");
    }

    private ModelAndView getModelAndView(String path) {
        ModelAndView modelAndView = new ModelAndView(path);

        Map<String, String> pageComponents = roleService.findPageComponentByUserId(authenticationFacade.getLoggedIn().getId());
        if (pageComponents != null && pageComponents.size() > 0) {
            modelAndView.addAllObjects(pageComponents);
        } else {
            modelAndView.setViewName("403");
        }
        return modelAndView;
    }

}
