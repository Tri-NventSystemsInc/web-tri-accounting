package com.tri.erp.spring.controller;

import com.tri.erp.spring.reponse.StatusResponse;
import com.tri.erp.spring.service.implementations.DownloadService;
import com.tri.erp.spring.service.implementations.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by TSI Admin on 9/9/2014.
 */
@Controller
@RequestMapping("/admin/user")
public class UserManagementController {

    private final String BASE_PATH = "admin/user/partials/";

    // view providers
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "admin/user/main";
    }

    @RequestMapping(value = "/user-list-page", method = RequestMethod.GET)
    public String getUserListPage() {
        return BASE_PATH + "user-list";
    }
}