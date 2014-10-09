package com.tri.erp.spring.reponse;

import com.tri.erp.spring.model.Department;
import com.tri.erp.spring.model.StockWithdrawalDetailTmp;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ryan D. Repe on 10/5/2014.
 */
public class StockWithdrawalTmpDto {
    private int id;
    private int transId;
    private java.sql.Date transDate;
    private Department department;
    private String purpose;
    private String description;
    private int locationId;
    private int categoryId;
    private int userId;
    private int approvedBy;
    private int receivedBy;
    private int requisitioned;
    private int preparedBy;
    private int notedBy;
    private int issuedBy;
    private int docStatusId;
    private String remarks;
    private java.sql.Date transDateTime;
    private int requestTypeId;
    private String referenceNo;
    private List<StockWithdrawalDetailTmp> details = new ArrayList<>();

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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
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

    public int getRequestTypeId() {
        return requestTypeId;
    }

    public void setRequestTypeId(int requestTypeId) {
        this.requestTypeId = requestTypeId;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public List<StockWithdrawalDetailTmp> getDetails() {
        return details;
    }

    public void setDetails(List<StockWithdrawalDetailTmp> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return referenceNo;
    }
}
