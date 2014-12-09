package com.tri.erp.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tri.erp.spring.model.enums.DocumentStatus;
import com.tri.erp.spring.model.enums.InventoryCategory;
import com.tri.erp.spring.model.enums.RequestType;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 * Created by Ryan D. Repe on 10/5/2014.
 */
@Entity
@Table
public class StockWithdrawalTmp implements Serializable {
    public StockWithdrawalTmp() {
    }

    public StockWithdrawalTmp(String description, String purpose, String referenceNumber, String remarks, Date transactionDate, int FK_transactionId, User approvedBy, User department, User issuedBy, User notedBy, User preparedBy, User receivedBy, User requisitioned, User user, User documentStatus, List<StockWithdrawalDetailTmp> details, int requestType, int FK_inventoryCategoryId) {
        this.description = description;
        this.purpose = purpose;
        this.referenceNumber = referenceNumber;
        this.remarks = remarks;
        this.transactionDate = transactionDate;
        this.FK_transactionId = FK_transactionId;
        this.approvedBy = approvedBy;
        this.department = department;
        this.issuedBy = issuedBy;
        this.notedBy = notedBy;
        this.preparedBy = preparedBy;
        this.receivedBy = receivedBy;
        this.requisitioned = requisitioned;
        this.user = user;
        this.documentStatus = documentStatus;
        this.details = details;
        this.requestType = requestType;
        this.FK_inventoryCategoryId = FK_inventoryCategoryId;
    }

    @Id
    @GeneratedValue
    @Column
    private int id;
    @Column
    private String description;
    @Column
    private String purpose;
    @Column
    private String referenceNumber;
    @Column
    private String remarks;
    @Column
    private Date transactionDate;
    @Column
    private int FK_transactionId;
    @JsonIgnoreProperties(ignoreUnknown = true)
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="FK_approvedBy")
    private User approvedBy;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="FK_departmentId")
    private User department;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="FK_issuedBy")
    private User issuedBy;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="FK_notedBy", nullable = true, columnDefinition = "0")
    private User notedBy;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="FK_preparedBy")
    private User preparedBy;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="FK_receivedBy")
    private User receivedBy;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="FK_requisitioned")
    private User requisitioned;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="FK_userId")
    private User user;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="FK_documentStatusId")
    private User documentStatus;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stockWithdrawal")
    private List<StockWithdrawalDetailTmp> details;


    // GETTERS & SETTERS


    public List<StockWithdrawalDetailTmp> getDetails() {
        return details;
    }

    public void setDetails(List<StockWithdrawalDetailTmp> details) {
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public int getFK_transactionId() {
        return FK_transactionId;
    }

    public void setFK_transactionId(int FK_transactionId) {
        this.FK_transactionId = FK_transactionId;
    }


    // NAVIGATION PROPERTIES (GETTERS & SETTERS)

    public User getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(User approvedBy) {
        this.approvedBy = approvedBy;
    }

    public User getDepartment() {
        return department;
    }

    public void setDepartment(User department) {
        this.department = department;
    }

    public User getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(User issuedBy) {
        this.issuedBy = issuedBy;
    }

    public User getNotedBy() {
        return notedBy;
    }

    public void setNotedBy(User notedBy) {
        this.notedBy = notedBy;
    }

    public User getPreparedBy() {
        return preparedBy;
    }

    public void setPreparedBy(User preparedBy) {
        this.preparedBy = preparedBy;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getDocumentStatus() {
        return documentStatus;
    }

    public void setDocumentStatus(User documentStatus) {
        this.documentStatus = documentStatus;
    }


    // ENUMS

    @Column
    private int requestType;

    public RequestType getRequestType() {
        return RequestType.parse(this.requestType);
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType.getId();
    }

    @Column
    private int FK_inventoryCategoryId;

    public InventoryCategory getInventoryCategory() {
        return InventoryCategory.parse(this.FK_inventoryCategoryId);
    }

    public void setInventoryCategory(InventoryCategory category) {
        this.FK_inventoryCategoryId = category.getId();
    }

    // OVERRIDE
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

