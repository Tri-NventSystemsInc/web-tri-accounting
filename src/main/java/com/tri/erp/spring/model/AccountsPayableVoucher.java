package com.tri.erp.spring.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by TSI Admin on 2/26/2015.
 */

@Entity
public class AccountsPayableVoucher implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer id;

    @Column
    private String code;

    @Column
    private String particulars;

    @Column
    private Date voucherDate;

    @Column
    private Date dueDate;

    @ManyToOne
    @JoinColumn(name = "FK_transactionId")
    private Transaction transaction;

    @ManyToOne
    @JoinColumn(name = "FK_checkedByUserId")
    private User checker;

    @ManyToOne
    @JoinColumn(name = "FK_approvedByUserId")
    private User approvingOfficer;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date updatedAt;

    public AccountsPayableVoucher() {}

    public AccountsPayableVoucher(String code, String particulars, Date voucherDate, Date dueDate, Transaction transaction, User checker, User approvingOfficer, Date createdAt, Date updatedAt) {
        this.code = code;
        this.particulars = particulars;
        this.voucherDate = voucherDate;
        this.dueDate = dueDate;
        this.transaction = transaction;
        this.checker = checker;
        this.approvingOfficer = approvingOfficer;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParticulars() {
        return particulars;
    }

    public void setParticulars(String particulars) {
        this.particulars = particulars;
    }

    public Date getVoucherDate() {
        return voucherDate;
    }

    public void setVoucherDate(Date voucherDate) {
        this.voucherDate = voucherDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public User getChecker() {
        return checker;
    }

    public void setChecker(User checker) {
        this.checker = checker;
    }

    public User getApprovingOfficer() {
        return approvingOfficer;
    }

    public void setApprovingOfficer(User approvingOfficer) {
        this.approvingOfficer = approvingOfficer;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
