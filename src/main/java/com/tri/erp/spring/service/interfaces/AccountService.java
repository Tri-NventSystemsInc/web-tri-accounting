package com.tri.erp.spring.service.interfaces;

import com.tri.erp.spring.reponse.AccountResponse;
import com.tri.erp.spring.reponse.AccountDto;
import com.tri.erp.spring.model.Account;
import org.springframework.context.MessageSource;
import org.springframework.validation.BindingResult;

import java.util.List;

public interface AccountService {
    public Account create(Account shop);
    public Account delete(int id);
    public List<AccountDto> findAll();
    public Account update(Account account);
    public AccountDto findById(int id);
    public AccountResponse processCreate(Account account, BindingResult bindingResult, MessageSource messageSource);
    public AccountResponse processUpdate(Account account, BindingResult bindingResult, MessageSource messageSource);
    public List<Account> findByTitle(String title);
    public List<Account> findByIdNotIn(Integer... accountId);
    public List<AccountDto> findAllTree();
    public List<AccountDto> findAllBySegment(String[] segmentIds);
}
