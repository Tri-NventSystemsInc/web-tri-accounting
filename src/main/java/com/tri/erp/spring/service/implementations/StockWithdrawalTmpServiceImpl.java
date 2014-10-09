package com.tri.erp.spring.service.implementations;

import com.tri.erp.spring.reponse.StockWithdrawalTmpDto;
import com.tri.erp.spring.model.StockWithdrawalTmp;
import com.tri.erp.spring.repo.StockWithdrawalTmpRepo;
import com.tri.erp.spring.service.interfaces.StockWithdrawalTmpService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ryan D. Repe on 10/8/2014.
 */
public class StockWithdrawalTmpServiceImpl implements StockWithdrawalTmpService {

    private List<StockWithdrawalTmpDto> tmpDtoList;

    @Resource
    private StockWithdrawalTmpRepo stockWithdrawalTmpRepo;

    @Override
    public StockWithdrawalTmp create(StockWithdrawalTmp tmp) {
        return stockWithdrawalTmpRepo.save(tmp);
    }

    @Override
    public StockWithdrawalTmp delete(int id) {
        return null;
    }

    @Override
    public List<StockWithdrawalTmpDto> findAll() {

        tmpDtoList = new ArrayList<>();

        List<StockWithdrawalTmp> tmpList = stockWithdrawalTmpRepo.findAll();

        for (StockWithdrawalTmp tmp : tmpList){

            StockWithdrawalTmpDto d = new StockWithdrawalTmpDto();

            d.setId(tmp.getId());
            d.setReferenceNo(tmp.getReferenceNo());
            d.setTransDate(tmp.getTransDate());
            d.setPurpose(tmp.getPurpose());

            tmpDtoList.add(d);
        }

        return tmpDtoList;
    }

    @Override
    public StockWithdrawalTmp update(StockWithdrawalTmp tmp) {
        return null;
    }

    @Override
    public StockWithdrawalTmpDto findById(int id) {
        return null;
    }

    @Override
    public List<StockWithdrawalTmpDto> findByStatus(int id) {

        tmpDtoList = new ArrayList<>();

        List<StockWithdrawalTmp> tmpList = stockWithdrawalTmpRepo.findByDocStatusId(id);

        for (StockWithdrawalTmp tmp : tmpList){

            StockWithdrawalTmpDto d = new StockWithdrawalTmpDto();

            d.setId(tmp.getId());
            d.setReferenceNo(tmp.getReferenceNo());
            d.setTransDate(tmp.getTransDate());
            d.setPurpose(tmp.getPurpose());

            tmpDtoList.add(d);
        }

        return tmpDtoList;
    }
}
