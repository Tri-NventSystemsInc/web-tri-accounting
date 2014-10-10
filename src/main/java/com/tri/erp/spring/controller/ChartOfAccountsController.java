package com.tri.erp.spring.controller;

import com.tri.erp.spring.commons.GlobalConstant;
import com.tri.erp.spring.commons.helpers.ReportUtil;
import com.tri.erp.spring.reponse.StatusResponse;
import com.tri.erp.spring.service.implementations.DownloadService;
import com.tri.erp.spring.service.implementations.JasperDatasourceService;
import com.tri.erp.spring.service.implementations.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 * Created by TSI Admin on 9/9/2014.
 */
@Controller
@RequestMapping("/admin/coa")
public class ChartOfAccountsController {
    @Autowired
    private DownloadService downloadService;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private JasperDatasourceService datasource;

    private final String BASE_PATH = "admin/coa/partials/";

    // view providers
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "admin/coa/main";
    }

    @RequestMapping(value = "/accounts-tree-page", method = RequestMethod.GET)
    public String accountsTree() {
        return BASE_PATH + "chart-of-accounts";
    }

    @RequestMapping(value = "/new-account-page", method = RequestMethod.GET)
    public String newAccount() {
        return BASE_PATH + "add-edit";
    }

    @RequestMapping(value = "/account-details-page", method = RequestMethod.GET)
    public String accountDetails() {
        return BASE_PATH + "account-details";
    }
    // end: view providers


    // coa print
    @RequestMapping(value="/download/progress")
    public @ResponseBody
    StatusResponse checkDownloadProgress(@RequestParam String token) {
        return new StatusResponse(true, tokenService.check(token));
    }

    @RequestMapping(value="/download/token")
    public @ResponseBody StatusResponse getDownloadToken() {
        return new StatusResponse(true, tokenService.generate());
    }

    @RequestMapping(value="/download")
    public void download(@RequestParam(value = "type") String type,
                         @RequestParam(value = "token") String token,
                         HttpServletResponse response, HttpServletRequest request) {

        HashMap<String, Object> params = ReportUtil.setupSharedReportHeaders(request);

        String template = GlobalConstant.JASPER_BASE_PATH + "/coa/ChartOfAccounts.jrxml";
        downloadService.download(type, token, response, params, template, datasource.getCoaDataSource());
    }
}

// TODO: work with parent account in hibernate to avoid workarounds