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
@Table
public class StockWithdrawalTmp {

    public StockWithdrawalTmp() {
    }

    public StockWithdrawalTmp(int transId, Date transDate, Department department, String purpose, String description, int invLocId, int invCatId, User user, User approvedBy, User receivedBy, User requisitioned, User preparedBy, User notedBy, User issuedBy, int docStatusId, String remarks, Date transDateTime, RequestType requestType, String referenceNo, List<StockWithdrawalDetailTmp> details) {
        this.transId = transId;
        this.transDate = transDate;
        this.department = department;
        this.purpose = purpose;
        this.description = description;
        this.invLocId = invLocId;
        this.invCatId = invCatId;
        this.user = user;
        this.approvedBy = approvedBy;
        this.receivedBy = receivedBy;
        this.requisitioned = requisitioned;
        this.preparedBy = preparedBy;
        this.notedBy = notedBy;
        this.issuedBy = issuedBy;
        this.docStatusId = docStatusId;
        this.remarks = remarks;
        this.transDateTime = transDateTime;
        this.requestType = requestType;
        this.referenceNo = referenceNo;
        this.details = details;
    }

    @Id
    @GeneratedValue
    @Column
    private int id;
    @Column
    private int transId;
    @Column
    private java.sql.Date transDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "deptId")
    private Department department;
    @Column
    @NotEmpty
    private String purpose;
    @Column
    private String description;
    @Column
    private int invLocId;
    @Column
    private int invCatId;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private User user;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "approvedBy")
    private User approvedBy;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "receivedBy")
    private User receivedBy;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "requisitioned")
    private User requisitioned;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "preparedBy")
    private User preparedBy;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "notedBy")
    private User notedBy;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "issuedBy")
    private User issuedBy;
    @Column
    private int docStatusId;
    @Column
    private String remarks;
    @Column
    private java.sql.Date transDateTime;
    @Enumerated(EnumType.ORDINAL)
    private RequestType requestType;
    @Column
    private String referenceNo;
    @OneToMany(mappedBy = "stockWithdrawal")
    private List<StockWithdrawalDetailTmp> details;

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

    public int getInvLocId() {
        return invLocId;
    }

    public void setInvLocId(int invLocId) {
        this.invLocId = invLocId;
    }

    public int getInvCatId() {
        return invCatId;
    }

    public void setInvCatId(int invCatId) {
        this.invCatId = invCatId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(User approvedBy) {
        this.approvedBy = approvedBy;
    }

    public User getReceivedBy() {
        return receivedBy;
    }

    public void setReceivedBy(User receivedBy) {
        this.receivedBy = receivedBy;
    }

    public User getRequisitioned() {
        return requisitioned;
    }

    public void setRequisitioned(User requisitioned) {
        this.requisitioned = requisitioned;
    }

    public User getPreparedBy() {
        return preparedBy;
    }

    public void setPreparedBy(User preparedBy) {
        this.preparedBy = preparedBy;
    }

    public User getNotedBy() {
        return notedBy;
    }

    public void setNotedBy(User notedBy) {
        this.notedBy = notedBy;
    }

    public User getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(User issuedBy) {
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

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
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
}

