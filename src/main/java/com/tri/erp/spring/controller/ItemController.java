package com.tri.erp.spring.controller;

import com.tri.erp.spring.commons.GlobalConstant;
import com.tri.erp.spring.commons.helpers.ReportUtil;
import com.tri.erp.spring.model.Item;
import com.tri.erp.spring.reponse.StatusResponse;
import com.tri.erp.spring.service.implementations.DownloadService;
import com.tri.erp.spring.service.implementations.JasperDatasourceService;
import com.tri.erp.spring.service.implementations.TokenService;
import com.tri.erp.spring.service.interfaces.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;

/**
 * Created by TSI Admin on 9/16/2014.
 */

@Controller
@RequestMapping("/item")
public class ItemController {

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
