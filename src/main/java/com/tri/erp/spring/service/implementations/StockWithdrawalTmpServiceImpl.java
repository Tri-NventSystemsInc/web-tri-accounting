package com.tri.erp.spring.service.implementations;

import com.tri.erp.spring.reponse.StockWithdrawalTmpDto;
import com.tri.erp.spring.model.StockWithdrawalTmp;
import com.tri.erp.spring.repo.StockWithdrawalTmpRepo;
import com.tri.erp.spring.service.interfaces.StockWithdrawalTmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ryan D. Repe on 10/8/2014.
 */
@Service
public class StockWithdrawalTmpServiceImpl implements StockWithdrawalTmpService {

    private List<StockWithdrawalTmpDto> tmpDtoList;

    @Autowired
    StockWithdrawalTmpRepo stockWithdrawalTmpRepo;

    @Override
    public StockWithdrawalTmp create(StockWithdrawalTmp tmp) {
        return stockWithdrawalTmpRepo.save(tmp);
    }

    @Override
    public StockWithdrawalTmp delete(int id) {
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public List<StockWithdrawalTmp> findAll() {
        List<StockWithdrawalTmp> tmpList = stockWithdrawalTmpRepo.findAll();
        return tmpList;
    }

    @Override
    public StockWithdrawalTmp update(StockWithdrawalTmp tmp) {
        return stockWithdrawalTmpRepo.save(tmp);
    }

    @Override
    public StockWithdrawalTmp findById(int id) {
        return null;
    }

    @Override
    public List<StockWithdrawalTmp> findByDocumentStatus(int id) {

        tmpDtoList = new ArrayList<>();

        List<StockWithdrawalTmp> tmpList = stockWithdrawalTmpRepo.findByDocumentStatus(id);

        return tmpList;
    }
}
