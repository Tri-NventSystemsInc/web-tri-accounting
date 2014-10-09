package com.tri.erp.spring.repo;

import com.tri.erp.spring.model.StockWithdrawalTmp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Ryan D. Repe on 10/8/2014.
 */
public interface StockWithdrawalTmpRepo extends JpaRepository<StockWithdrawalTmp, Integer> {
    public List<StockWithdrawalTmp> findByDocStatus(int id);
}
