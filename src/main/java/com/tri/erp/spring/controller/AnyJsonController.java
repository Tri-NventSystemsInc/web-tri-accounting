/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tri.erp.spring.controller;

import com.tri.erp.spring.model.Menu;
import com.tri.erp.spring.model.Page;
import com.tri.erp.spring.model.SlEntity;
import com.tri.erp.spring.reponse.MenuDto;
import com.tri.erp.spring.reponse.PageComponentDto;
import com.tri.erp.spring.service.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *
 * @author TSI Admin
 */

@Controller
@RequestMapping("/json")
public class AnyJsonController {

    @Autowired
    MenuService menuService;

    @Autowired
    PageService pageService;

    @Autowired
    SlEntityService slEntityService;

    @RequestMapping(value = "/entities", method = RequestMethod.GET)
    @ResponseBody
    public List<SlEntity> getEntities() {
        return slEntityService.findAll();
    }

    @RequestMapping(value = "/menus", method = RequestMethod.GET)
    @ResponseBody
    public List<MenuDto> getMenus() {
        return menuService.findAll();
    }

    @RequestMapping(value = "/pages", method = RequestMethod.GET)
    @ResponseBody
    public List<Page> getPages() {
        return pageService.findAll();
    }

    @RequestMapping(value = "/page-components/{pageId}", method = RequestMethod.GET)
    @ResponseBody
    public List<PageComponentDto> getPageComponents(@PathVariable Integer pageId) {
        return pageService.getPageComponents(pageId);
    }
}
