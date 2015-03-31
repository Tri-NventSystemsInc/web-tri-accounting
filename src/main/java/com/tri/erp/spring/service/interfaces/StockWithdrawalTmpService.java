package com.tri.erp.spring.service.interfaces;

import com.tri.erp.spring.reponse.StockWithdrawalTmpDto;
import com.tri.erp.spring.model.StockWithdrawalTmp;

import java.util.List;

/**
 * Created by Ryan D. Repe on 10/8/2014.
 */
public interface StockWithdrawalTmpService {
    public StockWithdrawalTmp create(StockWithdrawalTmp tmp);
    public StockWithdrawalTmp delete(int id);
    public List<StockWithdrawalTmpDto> findAll();
    public StockWithdrawalTmp update(StockWithdrawalTmp tmp);
    public StockWithdrawalTmpDto findById(int id);
//    public AccountResponse processCreate(Account account, BindingResult bindingResult, MessageSource messageSource);
//    public AccountResponse processUpdate(Account account, BindingResult bindingResult, MessageSource messageSource);
    public List<StockWithdrawalTmpDto> findByStatus(int id);
}
