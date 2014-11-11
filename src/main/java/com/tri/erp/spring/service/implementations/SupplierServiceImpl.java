package com.tri.erp.spring.service.implementations;

import com.tri.erp.spring.commons.helpers.MessageFormatter;
import com.tri.erp.spring.model.Supplier;
import com.tri.erp.spring.repo.SupplierRepo;
import com.tri.erp.spring.reponse.CreateResponse;
import com.tri.erp.spring.service.interfaces.SupplierService;
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
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    SupplierRepo supplierRepo;

    @Override
    @Transactional(readOnly = true)
    public Supplier create(Supplier supplier) {
        return supplierRepo.save(supplier);
    }

    @Override
    @Transactional(readOnly = true)
    public Supplier findById(Integer id) {
        return supplierRepo.findOne(id);
    }

    @Override
    @Transactional
    public CreateResponse processUpdate(Supplier supplier, BindingResult bindingResult, MessageSource messageSource) {
        CreateResponse response = new CreateResponse();
        MessageFormatter messageFormatter = new MessageFormatter(bindingResult, messageSource, response);

        if (bindingResult.hasErrors()) {
            messageFormatter.buildErrorMessages();
            response = messageFormatter.getResponse();
            response.setSuccess(false);
        } else {
            Supplier newSupplier = this.create(supplier);
            response.setModelId(newSupplier.getId());
            response.setSuccessMessage("Supplier successfully saved!");
            response.setSuccess(true);
        }

        return response;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Supplier> findAll() {
        return supplierRepo.findAll();
    }

    @Override
    public CreateResponse processCreate(Supplier supplier, BindingResult bindingResult, MessageSource messageSource) {
        return processCreate(supplier, bindingResult, messageSource);
    }
}
