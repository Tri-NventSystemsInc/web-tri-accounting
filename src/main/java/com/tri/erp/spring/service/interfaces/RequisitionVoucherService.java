package com.tri.erp.spring.service.interfaces;

import com.tri.erp.spring.model.RequisitionVoucher;

import java.util.List;

/**
 * Created by Personal on 3/20/2015.
 */
public interface RequisitionVoucherService {
    public RequisitionVoucher findByRvNumber(String rvNumber);
    public List<RequisitionVoucher> findAll();
    public RequisitionVoucher findByRvId(Integer rvId);
}
