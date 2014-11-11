package com.tri.erp.spring.service.interfaces;

import com.tri.erp.spring.model.Supplier;
import com.tri.erp.spring.reponse.CreateResponse;
import org.springframework.context.MessageSource;
import org.springframework.validation.BindingResult;

import java.util.List;

/**
 * Created by TSI Admin on 11/11/2014.
 */
public interface SupplierService {

    public Supplier create(Supplier supplier);
    public Supplier findById(Integer id);
    public CreateResponse processUpdate(Supplier supplier, BindingResult bindingResult, MessageSource messageSource);
    public List<Supplier> findAll();
    public CreateResponse processCreate(Supplier supplier, BindingResult bindingResult, MessageSource messageSource);

}
