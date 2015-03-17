package com.tri.erp.spring.service.interfaces;

import com.tri.erp.spring.model.CheckConfig;
import com.tri.erp.spring.reponse.CreateResponse;
import org.springframework.context.MessageSource;
import org.springframework.validation.BindingResult;

import java.util.List;

/**
 * Created by TSI Admin on 12/8/2014.
 */
public interface CheckConfigService {
    public List<CheckConfig> findAll();
    public CheckConfig findById(Integer id);
    public CheckConfig findByCode(String code);
    public CreateResponse processUpdate(CheckConfig config, BindingResult bindingResult, MessageSource messageSource);
    public CreateResponse processCreate(CheckConfig config, BindingResult bindingResult, MessageSource messageSource);
}
