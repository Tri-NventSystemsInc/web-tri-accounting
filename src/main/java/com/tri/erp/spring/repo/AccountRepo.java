package com.tri.erp.spring.repo;

import com.tri.erp.spring.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by TSI Admin on 9/9/2014.
 */
public interface AccountRepo extends JpaRepository<Account, Integer> {
    public List<Account> findByTitle(String title);
    public List<Account> findAllByOrderByTitleAsc();
    public List<Account> findByParentAccountIdOrderByCodeAsc(Integer accountId);
    public List<Account> findByIdNotIn(Integer... accountId);
    public List<Account> findByIdNotInOrderByTitleAsc(Integer... accountId);

    @Transactional
    @Query(value = "SELECT Account.id, " +
            "Account.title, " +
            "segment_accounts.acct_code, " +
            "account_type.description " +
            "FROM Account " +
            "JOIN segment_accounts ON Account.id = segment_accounts.acct_id " +
            "LEFT JOIN account_type ON Account.FK_accountTypeId = account_type.id " +
            "WHERE segment_accounts.bus_seg_id IN (:segmentIds) " +
            "ORDER BY Account.code ASC, segment_accounts.acct_code ASC", nativeQuery = true)
    public List<Object[]> findBySegmentIds(@Param("segmentIds") List<String> segmentIds);
}
