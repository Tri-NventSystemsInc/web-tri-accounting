package com.tri.erp.spring.service.implementations;

import com.tri.erp.spring.model.AccountsPayableVoucher;
import com.tri.erp.spring.model.Page;
import com.tri.erp.spring.model.PageComponent;
import com.tri.erp.spring.repo.PageComponentRepo;
import com.tri.erp.spring.repo.PageRepo;
import com.tri.erp.spring.reponse.CreateResponse;
import com.tri.erp.spring.reponse.PageComponentDto;
import com.tri.erp.spring.service.interfaces.ApvService;
import com.tri.erp.spring.service.interfaces.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TSI Admin on 10/9/2014.
 */


@Service
public class ApvServiceImpl implements ApvService {

    @Override
    public CreateResponse processUpdate(AccountsPayableVoucher apv, BindingResult bindingResult, MessageSource messageSource) {
        return null;
    }

    @Override
    public CreateResponse processCreate(AccountsPayableVoucher apv, BindingResult bindingResult, MessageSource messageSource) {
        return null;
    }
}
