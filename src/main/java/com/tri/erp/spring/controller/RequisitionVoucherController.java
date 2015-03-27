package com.tri.erp.spring.controller;

import com.tri.erp.spring.model.RequisitionVoucher;
import com.tri.erp.spring.service.interfaces.RequisitionVoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Personal on 3/20/2015.
 */
@Controller
@RequestMapping(value = "/requisition-voucher")
public class RequisitionVoucherController {

    @Autowired
    RequisitionVoucherService requisitionVoucherService;

    @RequestMapping(value = "/list")
    @ResponseBody
    public List<RequisitionVoucher> getRequisitionVouchers() {
        return requisitionVoucherService.findAll();
    }
}
