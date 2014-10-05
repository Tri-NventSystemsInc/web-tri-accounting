package com.tri.erp.spring.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Ryan D. Repe on 10/5/2014.
 */
@Entity
@Table(name = "stock_withdrawal_tmp")
public class StockWithdrawalTmp {

    @Id
    @GeneratedValue
    @Column(name = "stock_withdrawal_id")
    private int id;

    @Column(name = "trans_id")
    private int transId;

    @Column(name = "trans_date")
    private java.sql.Date transDate;

    @Column(name = "dept_id")
    private int deptId;

    @Column
    @NotEmpty
    private String purpose;

    @Column
    private String description;

    @Column(name = "inv_loc_id")
    private int locationId;

    @Column(name = "inv_cat_id")
    private int categoryId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "approved_by")
    private int approvedBy;

    @Column(name = "received_by")
    private int receivedBy;

    @Column
    private int requisitioned;

    @Column(name = "prepared_by")
    private int preparedBy;

    @Column(name = "noted_by")
    private int notedBy;

    @Column(name = "issued_by")
    private int issuedBy;

    @Column(name = "doc_status_id")
    private int docStatusId;

    @Column
    private String remarks;

    @Column(name = "trans_date_time")
    private java.sql.Date transDateTime;

    @Column(name = "request_type")
    private int requestType;

    @Column(name = "sw_number")
    private String referenceNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTransId() {
        return transId;
    }

    public void setTransId(int transId) {
        this.transId = transId;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(int approvedBy) {
        this.approvedBy = approvedBy;
    }

    public int getReceivedBy() {
        return receivedBy;
    }

    public void setReceivedBy(int receivedBy) {
        this.receivedBy = receivedBy;
    }

    public int getRequisitioned() {
        return requisitioned;
    }

    public void setRequisitioned(int requisitioned) {
        this.requisitioned = requisitioned;
    }

    public int getPreparedBy() {
        return preparedBy;
    }

    public void setPreparedBy(int preparedBy) {
        this.preparedBy = preparedBy;
    }

    public int getNotedBy() {
        return notedBy;
    }

    public void setNotedBy(int notedBy) {
        this.notedBy = notedBy;
    }

    public int getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(int issuedBy) {
        this.issuedBy = issuedBy;
    }

    public int getDocStatusId() {
        return docStatusId;
    }

    public void setDocStatusId(int docStatusId) {
        this.docStatusId = docStatusId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getTransDateTime() {
        return transDateTime;
    }

    public void setTransDateTime(Date transDateTime) {
        this.transDateTime = transDateTime;
    }

    public int getRequestType() {
        return requestType;
    }

    public void setRequestType(int requestType) {
        this.requestType = requestType;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }
}

