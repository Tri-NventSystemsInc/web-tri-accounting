package com.tri.erp.spring.controller;

import com.tri.erp.spring.commons.facade.AuthenticationFacade;
import com.tri.erp.spring.commons.helpers.StringFormatter;
import com.tri.erp.spring.model.Item;
import com.tri.erp.spring.model.RequisitionVoucher;
import com.tri.erp.spring.service.interfaces.RequisitionVoucherService;
import com.tri.erp.spring.service.interfaces.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Personal on 3/20/2015.
 */
@Controller
@RequestMapping(value = "/requisition-voucher")
public class RequisitionVoucherController {

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @Autowired
    RequisitionVoucherService requisitionVoucherService;

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<RequisitionVoucher> getRequisitionVouchers() {
        return requisitionVoucherService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public RequisitionVoucher getRequisitionVoucher(@PathVariable Integer id, HttpServletRequest request) {
        String uri = StringFormatter.replaceRouteParamWithPlaceholder(request.getRequestURI(), String.valueOf(id));
        Boolean hasPermissionOnMethod = roleService.isRouteAuthorized(authenticationFacade.getLoggedIn().getId(), uri);

        if (hasPermissionOnMethod) {
            return requisitionVoucherService.findByRvId(id);
        } else {
            return null;
        }
    }
}
