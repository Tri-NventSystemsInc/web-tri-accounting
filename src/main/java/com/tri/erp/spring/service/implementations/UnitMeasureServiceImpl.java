package com.tri.erp.spring.service.implementations;

import com.tri.erp.spring.commons.EntityAccountNumberGenerator;
import com.tri.erp.spring.commons.facade.AuthenticationFacade;
import com.tri.erp.spring.commons.helpers.Checker;
import com.tri.erp.spring.commons.helpers.MessageFormatter;
import com.tri.erp.spring.model.Supplier;
import com.tri.erp.spring.model.UnitMeasure;
import com.tri.erp.spring.model.User;
import com.tri.erp.spring.repo.SupplierRepo;
import com.tri.erp.spring.repo.UnitMeasureRepo;
import com.tri.erp.spring.reponse.CreateResponse;
import com.tri.erp.spring.service.interfaces.SupplierService;
import com.tri.erp.spring.service.interfaces.UnitMeasureService;
import com.tri.erp.spring.validator.SupplierValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

import java.util.List;

/**
 * Created by TSI Admin on 11/11/2014.
 */

@Service
public class UnitMeasureServiceImpl implements UnitMeasureService {

    @Autowired
    UnitMeasureRepo unitMeasureRepo;

    @Override
    public List<UnitMeasure> findAll() {
        return unitMeasureRepo.findAll();
    }

    @Override
    public UnitMeasure findById(Integer id) {
        return unitMeasureRepo.findOne(id);
    }
}
