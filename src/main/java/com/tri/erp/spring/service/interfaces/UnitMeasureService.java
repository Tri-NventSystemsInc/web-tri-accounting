package com.tri.erp.spring.service.interfaces;


import com.tri.erp.spring.model.UnitMeasure;
import com.tri.erp.spring.model.User;
import com.tri.erp.spring.reponse.CreateResponse;
import org.springframework.context.MessageSource;
import org.springframework.validation.BindingResult;

import java.util.List;

/**
 * Created by TSI Admin on 10/9/2014.
 */
public interface UnitMeasureService {
    public List<UnitMeasure> findAll();
}
