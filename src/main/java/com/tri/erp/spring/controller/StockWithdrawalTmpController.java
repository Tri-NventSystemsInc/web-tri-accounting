package com.tri.erp.spring.controller;

import com.tri.erp.spring.model.StockWithdrawalTmp;
import com.tri.erp.spring.model.enums.DocumentStatus;
import com.tri.erp.spring.reponse.StockWithdrawalTmpDto;
import com.tri.erp.spring.service.interfaces.StockWithdrawalTmpService;
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
@RequestMapping("/withdrawal")
public class StockWithdrawalTmpController {

    @Autowired
    StockWithdrawalTmpService tmpService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public List<StockWithdrawalTmp> getAllStockWithdrawalTmp(){
        return tmpService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public StockWithdrawalTmp getStockWithdrawalTmp(@PathVariable Integer id) {
        return tmpService.findById(id);
    }
}