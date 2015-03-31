package com.tri.erp.spring.controller;

import com.tri.erp.spring.model.StockWithdrawalTmp;
import com.tri.erp.spring.model.enums.DocumentStatus;
import com.tri.erp.spring.reponse.StockWithdrawalTmpDto;
import com.tri.erp.spring.service.interfaces.StockWithdrawalTmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by TSI Admin on 9/9/2014.
 */
@Controller
@RequestMapping("/inventory/withdrawal")
public class StockWithdrawalController {

    @Autowired
    StockWithdrawalTmpService tmpService;

    // view providers
    @RequestMapping(method =  RequestMethod.GET)
    public String index() {
        return "inventory/withdrawal/main";
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public List<StockWithdrawalTmpDto> createdList(@RequestParam(value="status", required=true) Integer id){
        return tmpService.findByStatus(id);
    }

    @RequestMapping(value = "/list/{id}",method = RequestMethod.GET)
    @ResponseBody
    public StockWithdrawalTmpDto tmpRequest(@PathVariable Integer id){
        return tmpService.findById(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public StockWithdrawalTmp createNew(@Valid @RequestBody StockWithdrawalTmp tmp) {
        return tmpService.create(tmp);
    }

    @RequestMapping(value = "/sendforchecking/", method = RequestMethod.PUT)
    @ResponseBody
    public StockWithdrawalTmp sendForChecking(@PathVariable Integer id) {

        StockWithdrawalTmpDto tmp = tmpService.findById(id);
        StockWithdrawalTmp updated = new StockWithdrawalTmp();

        updated.setDocStatusId(DocumentStatus.For_Checking.getId());

        return tmpService.update(updated);
    }
}