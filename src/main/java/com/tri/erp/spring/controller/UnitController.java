package com.tri.erp.spring.controller;

import com.tri.erp.spring.model.Supplier;
import com.tri.erp.spring.model.UnitMeasure;
import com.tri.erp.spring.reponse.CreateResponse;
import com.tri.erp.spring.service.interfaces.SupplierService;
import com.tri.erp.spring.service.interfaces.UnitMeasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by TSI Admin on 11/11/2014.
 */

@Controller
@RequestMapping(value = "/unit")
public class UnitController {

    @Autowired
    MessageSource messageSource;

    @Autowired
    UnitMeasureService unitMeasureService;

    @RequestMapping(value = "/list")
    @ResponseBody
    public List<UnitMeasure> getUnits() {
        return unitMeasureService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public UnitMeasure getUnit(@PathVariable Integer id) {
        return unitMeasureService.findById(id);
    }
}
