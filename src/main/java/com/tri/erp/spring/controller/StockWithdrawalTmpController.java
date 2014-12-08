package com.tri.erp.spring.controller;

import com.tri.erp.spring.model.StockWithdrawalTmp;
import com.tri.erp.spring.model.User;
import com.tri.erp.spring.model.enums.DocumentStatus;
import com.tri.erp.spring.reponse.StockWithdrawalTmpDto;
import com.tri.erp.spring.service.interfaces.StockWithdrawalTmpService;
import com.tri.erp.spring.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by TSI Admin on 9/9/2014.
 */
@Controller
@RequestMapping(value = "/inv/stockwith")
public class StockWithdrawalTmpController {

    @Autowired
    StockWithdrawalTmpService tmpService;

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "inv/stockwith/main";
    }

    @RequestMapping(value = "/all")
    @ResponseBody
    public List<StockWithdrawalTmp> getStockWithdrawalTmps(){
        return tmpService.findAll();
    }

    @RequestMapping(value = "/list")
    @ResponseBody
    public List<User> getUsers() {
        return userService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public StockWithdrawalTmp getStockWithdrawalTmp(@PathVariable Integer id) {
        return tmpService.findById(id);
    }
}