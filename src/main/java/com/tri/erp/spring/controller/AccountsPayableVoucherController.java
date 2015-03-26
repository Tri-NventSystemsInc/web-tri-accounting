package com.tri.erp.spring.controller;

import com.tri.erp.spring.commons.GlobalConstant;
import com.tri.erp.spring.commons.facade.AuthenticationFacade;
import com.tri.erp.spring.commons.helpers.ReportUtil;
import com.tri.erp.spring.commons.helpers.StringFormatter;
import com.tri.erp.spring.model.AccountsPayableVoucher;
import com.tri.erp.spring.model.Item;
import com.tri.erp.spring.reponse.CreateResponse;
import com.tri.erp.spring.reponse.CreateRoleResponse;
import com.tri.erp.spring.reponse.StatusResponse;
import com.tri.erp.spring.service.implementations.DownloadService;
import com.tri.erp.spring.service.implementations.JasperDatasourceService;
import com.tri.erp.spring.service.implementations.TokenService;
import com.tri.erp.spring.service.interfaces.ApvService;
import com.tri.erp.spring.service.interfaces.ItemService;
import com.tri.erp.spring.service.interfaces.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by TSI Admin on 9/16/2014.
 */

@Controller
@RequestMapping("/apv")
public class AccountsPayableVoucherController {

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @Autowired
    private RoleService roleService;

    @Autowired
    MessageSource messageSource;

    @Autowired
    ApvService apvService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<Item> apvList() {
        return null;
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    @ResponseBody
    public CreateResponse createApv(@Valid @RequestBody AccountsPayableVoucher apv, BindingResult bindingResult) {
        return apvService.processCreate(apv, bindingResult, messageSource);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Item getApv(@PathVariable Integer id, HttpServletRequest request) {
        String uri = StringFormatter.replaceRouteParamWithPlaceholder(request.getRequestURI(), String.valueOf(id));
        Boolean hasPermissionOnMethod = roleService.isRouteAuthorized(authenticationFacade.getLoggedIn().getId(), uri);

        if (hasPermissionOnMethod) {
            return null;
        } else {
            return null;
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public CreateResponse updateApv(@Valid @RequestBody  Item item, BindingResult bindingResult, HttpServletRequest request) {
        Boolean hasPermissionOnMethod = roleService.isRouteAuthorized(authenticationFacade.getLoggedIn().getId(), request.getRequestURI());
        if (hasPermissionOnMethod) {
            return null;
        } else {
            ArrayList<String> messages = new ArrayList<>();
            messages.add("Permission denied!");

            CreateResponse response = new CreateRoleResponse();
            response.setSuccess(false);
            response.setMessages(messages);
            response.isNotAuthorized(true);

            return response;
        }
    }
}
