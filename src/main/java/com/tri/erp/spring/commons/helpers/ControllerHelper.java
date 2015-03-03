package com.tri.erp.spring.commons.helpers;

import com.tri.erp.spring.service.interfaces.RoleService;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by TSI Admin on 3/3/2015.
 */
public class ControllerHelper {

    public static ModelAndView getModelAndView(String path, RoleService roleService, Integer userId) {
        ModelAndView modelAndView = new ModelAndView(path);

        Map<String, String> pageComponents = roleService.findPageComponentByUserId(userId);
        if (pageComponents != null && pageComponents.size() > 0) {
            modelAndView.addAllObjects(pageComponents);
        } else {
            modelAndView.setViewName("403");
        }

        return modelAndView;
    }
}
