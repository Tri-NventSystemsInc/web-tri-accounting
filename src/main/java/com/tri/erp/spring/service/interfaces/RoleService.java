package com.tri.erp.spring.service.interfaces;

import com.tri.erp.spring.model.Account;
import com.tri.erp.spring.model.Role;
import com.tri.erp.spring.reponse.AccountDto;
import com.tri.erp.spring.reponse.CreateResponse;
import org.springframework.context.MessageSource;
import org.springframework.validation.BindingResult;

import java.util.List;

public interface RoleService {
    public List<Role> findAll();
    public Role findById(Integer id);
    public CreateResponse processCreate(Role role, BindingResult bindingResult, MessageSource messageSource);
    public Role findByName(String str);
    public CreateResponse processUpdate(Role role, BindingResult bindingResult, MessageSource messageSource);
}