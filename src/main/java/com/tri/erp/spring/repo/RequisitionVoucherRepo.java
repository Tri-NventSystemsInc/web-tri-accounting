package com.tri.erp.spring.repo;

import com.tri.erp.spring.model.RequisitionVoucher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Personal on 3/20/2015.
 */
public interface RequisitionVoucherRepo extends JpaRepository<RequisitionVoucher, Integer> {
    public List<RequisitionVoucher> findByRvNumber(String rvNumber);
}
