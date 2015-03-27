package com.tri.erp.spring.service.implementations;

import com.tri.erp.spring.commons.facade.AuthenticationFacade;
import com.tri.erp.spring.commons.helpers.Checker;
import com.tri.erp.spring.model.RequisitionVoucher;
import com.tri.erp.spring.repo.RequisitionVoucherRepo;
import com.tri.erp.spring.service.interfaces.RequisitionVoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Personal on 3/20/2015.
 */
@Service
public class RequisitionVoucherServiceImpl implements RequisitionVoucherService {

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @Autowired
    RequisitionVoucherRepo requisitionVoucherRepo;

    @Override
    @Transactional(readOnly = true)
    public RequisitionVoucher findByRvNumber(String rvNumber) {
        List<RequisitionVoucher> requisitionVouchers = requisitionVoucherRepo.findByRvNumber(rvNumber);

        if (!Checker.collectionIsEmpty(requisitionVouchers)) {
            return requisitionVouchers.get(0);
        } else return null;
    }

    @Override
    public List<RequisitionVoucher> findAll() {
        return requisitionVoucherRepo.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public RequisitionVoucher findByRvId(Integer id) {
        return requisitionVoucherRepo.findOne(id);
    }
}
