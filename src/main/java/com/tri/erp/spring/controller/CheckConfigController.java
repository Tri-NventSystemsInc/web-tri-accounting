package com.tri.erp.spring.controller;

import com.tri.erp.spring.model.CheckConfig;
import com.tri.erp.spring.model.Item;
import com.tri.erp.spring.service.interfaces.CheckConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by TSI Admin on 12/8/2014.
 */

@Controller
@RequestMapping(value = "/check")
public class CheckConfigController {

    private final String BASE_PATH = "admin/check/partials/";

    @Autowired
    CheckConfigService checkConfigService;

    // view providers
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "admin/check/main";
    }

    @RequestMapping(value = "/check-details-page", method = RequestMethod.GET)
    public String getCheckDetailsPage() {
        return BASE_PATH + "check-details";
    }


    // data providers

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CheckConfig getCheck(@PathVariable Integer id) {
        return checkConfigService.findById(id);
    }


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<CheckConfig> getCheckConfigs() {
        return checkConfigService.findAll();
    }
}
