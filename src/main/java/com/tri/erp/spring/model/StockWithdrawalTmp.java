package com.tri.erp.spring.model;

import com.tri.erp.spring.model.enums.RequestType;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="dept_id")
    private Department department;

    @Column
    @NotEmpty
    private String purpose;

    @Column
    private String description;

    @Column(name = "inv_loc_id")
    private int locationId;

    @Column(name = "inv_cat_id")
    private int categoryId;

//    @Column(name = "user_id")
//    private int userId;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

//    @Column(name = "approved_by")
//    private int approvedBy;
@OneToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "approved_by")
private User approved;

//    @Column(name = "received_by")
//    private int receivedBy;
@OneToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "received_by")
private User received;

//    @Column
//    private int requisitioned;
@OneToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "requisitioned")
private User requisitioned;

//    @Column(name = "prepared_by")
//    private int preparedBy;
@OneToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "prepared_by")
private User prepared;

//    @Column(name = "noted_by")
//    private int notedBy;
@OneToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "noted_by")
private User noted;

//    @Column(name = "issued_by")
//    private int issuedBy;
@OneToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "issued_by")
private User issued;

    @Column(name = "doc_status_id")
    private int docStatusId;

    @Column
    private String remarks;

    @Column(name = "trans_date_time")
    private java.sql.Date transDateTime;

//    @Column(name = "request_type")
//    private int requestTypeId;

    @Enumerated(EnumType.ORDINAL)
    private RequestType requestType;

    @Column(name = "sw_number")
    private String referenceNo;

    @OneToMany(mappedBy = "stockWithdrawal")
    private List<StockWithdrawalDetailTmp> details;

    public StockWithdrawalTmp() {
    }

    public StockWithdrawalTmp(int transId, Date transDate, Department department, String purpose, String description, int locationId, int categoryId, User user, User approved, User received, User requisitioned, User prepared, User noted, User issued, int docStatusId, String remarks, Date transDateTime, RequestType requestType, String referenceNo) {
        this.transId = transId;
        this.transDate = transDate;
        this.department = department;
        this.purpose = purpose;
        this.description = description;
        this.locationId = locationId;
        this.categoryId = categoryId;
        this.user = user;
        this.approved = approved;
        this.received = received;
        this.requisitioned = requisitioned;
        this.prepared = prepared;
        this.noted = noted;
        this.issued = issued;
        this.docStatusId = docStatusId;
        this.remarks = remarks;
        this.transDateTime = transDateTime;
        this.requestType = requestType;
        this.referenceNo = referenceNo;
    }

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

    public List<StockWithdrawalDetailTmp> getDetails() {
        return details;
    }

    public void setDetails(List<StockWithdrawalDetailTmp> details) {
        this.details = details;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getApproved() {
        return approved;
    }

    public void setApproved(User approved) {
        this.approved = approved;
    }

    public User getReceived() {
        return received;
    }

    public void setReceived(User received) {
        this.received = received;
    }

    public User getRequisitioned() {
        return requisitioned;
    }

    public void setRequisitioned(User requisitioned) {
        this.requisitioned = requisitioned;
    }

    public User getPrepared() {
        return prepared;
    }

    public void setPrepared(User prepared) {
        this.prepared = prepared;
    }

    public User getNoted() {
        return noted;
    }

    public void setNoted(User noted) {
        this.noted = noted;
    }

    public User getIssued() {
        return issued;
    }

    public void setIssued(User issued) {
        this.issued = issued;
    }
    //    public int getUserId() {
//        return userId;
//    }
//
//    public void setUserId(int userId) {
//        this.userId = userId;
//    }

//    public int getApprovedBy() {
//        return approvedBy;
//    }
//
//    public void setApprovedBy(int approvedBy) {
//        this.approvedBy = approvedBy;
//    }
//
//    public int getReceivedBy() {
//        return receivedBy;
//    }
//
//    public void setReceivedBy(int receivedBy) {
//        this.receivedBy = receivedBy;
//    }
//
//    public int getRequisitioned() {
//        return requisitioned;
//    }
//
//    public void setRequisitioned(int requisitioned) {
//        this.requisitioned = requisitioned;
//    }
//
//    public int getPreparedBy() {
//        return preparedBy;
//    }
//
//    public void setPreparedBy(int preparedBy) {
//        this.preparedBy = preparedBy;
//    }
//
//    public int getNotedBy() {
//        return notedBy;
//    }
//
//    public void setNotedBy(int notedBy) {
//        this.notedBy = notedBy;
//    }
//
//    public int getIssuedBy() {
//        return issuedBy;
//    }
//
//    public void setIssuedBy(int issuedBy) {
//        this.issuedBy = issuedBy;
//    }

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

//    public RequestType getRequestType() {
//        return RequestType.parse(this.requestTypeId);
//    }
//
//    public void setRequestType(RequestType type) {
//        this.requestTypeId = type.getId();
//    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }
}

