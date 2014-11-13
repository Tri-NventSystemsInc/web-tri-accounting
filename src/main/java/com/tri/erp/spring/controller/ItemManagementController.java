package com.tri.erp.spring.controller;

import com.tri.erp.spring.model.Item;
import com.tri.erp.spring.service.interfaces.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by TSI Admin on 11/13/2014.
 */

@Controller
@RequestMapping(value = "/admin/item")
public class ItemManagementController {

    private final String BASE_PATH = "admin/item/partials/";

    // view providers
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "admin/item/main";
    }

    @RequestMapping(value = "/item-list-page", method = RequestMethod.GET)
    public String getItemListPage() {
        return BASE_PATH + "item-list";
    }

    @RequestMapping(value = "/new-item-page", method = RequestMethod.GET)
    public String newItem() {
        return BASE_PATH + "add-edit-item";
    }

    @RequestMapping(value = "/item-details-page", method = RequestMethod.GET)
    public String itemDetails() {
        return BASE_PATH + "item-details";
    }
}
