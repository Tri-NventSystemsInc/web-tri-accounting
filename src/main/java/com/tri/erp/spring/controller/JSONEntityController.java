/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tri.erp.spring.controller;

import com.tri.erp.spring.model.SlEntity;
import com.tri.erp.spring.service.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
public class JSONEntityController {


    @Autowired
    SlEntityService slEntityService;

    @RequestMapping(value = "/entities", method = RequestMethod.GET)
    @ResponseBody
    public List<SlEntity> getEntities() {
        return slEntityService.findAll();
    }
}
