package com.tri.erp.spring.service.interfaces;

import com.tri.erp.spring.model.AccountsPayableVoucher;
import com.tri.erp.spring.model.Item;
import com.tri.erp.spring.reponse.CreateResponse;
import org.springframework.context.MessageSource;
import org.springframework.validation.BindingResult;

import java.util.List;

public interface ApvService {
    public CreateResponse processUpdate(AccountsPayableVoucher apv, BindingResult bindingResult, MessageSource messageSource);
    public CreateResponse processCreate(AccountsPayableVoucher apv, BindingResult bindingResult, MessageSource messageSource);
}
