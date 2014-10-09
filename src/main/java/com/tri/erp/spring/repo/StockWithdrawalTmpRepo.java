package com.tri.erp.spring.repo;

import com.tri.erp.spring.model.StockWithdrawalTmp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ryan D. Repe on 10/8/2014.
 */
public interface StockWithdrawalTmpRepo extends JpaRepository<StockWithdrawalTmp, Integer> {
    @Transactional
    public List<StockWithdrawalTmp> findByDocStatusId(int id);
}
