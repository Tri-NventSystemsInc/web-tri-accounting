package com.tri.erp.spring.controller;

import com.tri.erp.spring.commons.GlobalConstant;
import com.tri.erp.spring.commons.facade.AuthenticationFacade;
import com.tri.erp.spring.commons.helpers.ReportUtil;
import com.tri.erp.spring.commons.helpers.StringFormatter;
import com.tri.erp.spring.model.Item;
import com.tri.erp.spring.reponse.CreateResponse;
import com.tri.erp.spring.reponse.CreateRoleResponse;
import com.tri.erp.spring.reponse.StatusResponse;
import com.tri.erp.spring.service.implementations.DownloadService;
import com.tri.erp.spring.service.implementations.JasperDatasourceService;
import com.tri.erp.spring.service.implementations.TokenService;
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
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @Autowired
    private RoleService roleService;

    @Autowired
    MessageSource messageSource;

    @Autowired
    ItemService itemService;

    @Autowired
    private DownloadService downloadService;

    @Autowired
    private JasperDatasourceService datasource;

    @Autowired
    private TokenService tokenService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<Item> itemList() {
        return itemService.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CreateResponse createItem(@Valid @RequestBody Item item, BindingResult bindingResult) {
        return itemService.processCreate(item, bindingResult, messageSource);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Item getItem(@PathVariable Integer id, HttpServletRequest request) {
        String uri = StringFormatter.replaceRouteParamWithPlaceholder(request.getRequestURI(), String.valueOf(id));
        Boolean hasPermissionOnMethod = roleService.isRouteAuthorized(authenticationFacade.getLoggedIn().getId(), uri);

        if (hasPermissionOnMethod) {
            return itemService.findById(id);
        } else {
            return null;
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public CreateResponse updateSupplier(@Valid @RequestBody  Item item, BindingResult bindingResult, HttpServletRequest request) {
        Boolean hasPermissionOnMethod = roleService.isRouteAuthorized(authenticationFacade.getLoggedIn().getId(), request.getRequestURI());
        if (hasPermissionOnMethod) {
            return itemService.processUpdate(item, bindingResult, messageSource);
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

    @RequestMapping(value="/download/token")
    public @ResponseBody
    StatusResponse getDownloadToken() {
        return new StatusResponse(true, tokenService.generate());
    }

    @RequestMapping(value="/download")
    public void download(@RequestParam(value = "type") String type,
                         @RequestParam(value = "token") String token,
                         HttpServletResponse response) {

        HashMap<String, Object> params = ReportUtil.setupSharedReportHeaders();

        String template = GlobalConstant.JASPER_BASE_PATH + "/item/ItemList.jrxml";
        downloadService.download(type, token, response, params, template, datasource.getItemDataSource());
    }
}
