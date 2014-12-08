package com.tri.erp.spring.service.implementations;

import com.tri.erp.spring.model.CheckConfig;
import com.tri.erp.spring.repo.CheckConfigRepo;
import com.tri.erp.spring.reponse.CreateResponse;
import com.tri.erp.spring.service.interfaces.CheckConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.List;

/**
 * Created by TSI Admin on 12/8/2014.
 */

@Service
public class CheckConfigServiceImpl implements CheckConfigService {

    @Autowired
    CheckConfigRepo checkConfigRepo;

    @Override
    public List<CheckConfig> findAll() {
        return checkConfigRepo.findAll();
    }

    @Override
    public CheckConfig findById(Integer id) {
        return checkConfigRepo.findOne(id);
    }

    @Override
    public CreateResponse processUpdate(CheckConfig config, BindingResult bindingResult, MessageSource messageSource) {
        return null;
    }

    @Override
    public CreateResponse processCreate(CheckConfig config, BindingResult bindingResult, MessageSource messageSource) {
        return null;
    }
}
