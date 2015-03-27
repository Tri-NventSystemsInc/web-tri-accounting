package com.tri.erp.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Personal on 03/20/2014.
 */

@Entity
public class RequisitionVoucher implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer rvId;

    @Column
    private String rvNumber;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date rvDate;

    @Column
    private String purpose;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date deliveryDate;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="preparedBy", nullable = true, columnDefinition = "0")
    private User preparedBy;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="recAppBy", nullable = true, columnDefinition = "0")
    private User recAppBy;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="checkedBy", nullable = true, columnDefinition = "0")
    private User checkedBy;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="auditedBy", nullable = true, columnDefinition = "0")
    private User auditedBy;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="canvassedBy", nullable = true, columnDefinition = "0")
    private User canvassedBy;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="approvedBy", nullable = true, columnDefinition = "0")
    private User approvedBy;

    @Column
    private Integer docStatusId;

    @Column
    private Integer rvType;

    public RequisitionVoucher() {}

    public RequisitionVoucher(String rvNumber, Date rvDate, String purpose, Date deliveryDate, User preparedBy, User recAppBy,
                              User checkedBy, User auditedBy, User canvassedBy, User approvedBy, Integer docStatusId, Integer rvType) {
        this.rvNumber = rvNumber;
        this.rvDate = rvDate;
        this.purpose = purpose;
        this.deliveryDate = deliveryDate;
        this.preparedBy = preparedBy;
        this.recAppBy = recAppBy;
        this.checkedBy = checkedBy;
        this.auditedBy = auditedBy;
        this.canvassedBy = canvassedBy;
        this.approvedBy = approvedBy;
        this.docStatusId = docStatusId;
        this.rvType = rvType;
    }

    public Integer getRvId() {
        return rvId;
    }

    public void setRvId(Integer rvId) {
        this.rvId = rvId;
    }

    public String getRvNumber() {
        return rvNumber;
    }

    public void setRvNumber(String rvNumber) {
        this.rvNumber = rvNumber;
    }

    public Date getRvDate() {
        return rvDate;
    }

    public void setRvDate(Date rvDate) {
        this.rvDate = rvDate;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public User getPreparedBy() {
        return preparedBy;
    }

    public void setPreparedBy(User preparedBy) {
        this.preparedBy = preparedBy;
    }

    public User getRecAppBy() {
        return recAppBy;
    }

    public void setRecAppBy(User recAppBy) {
        this.recAppBy = recAppBy;
    }

    public User getCheckedBy() {
        return checkedBy;
    }

    public void setCheckedBy(User checkedBy) {
        this.checkedBy = checkedBy;
    }

    public User getAuditedBy() {
        return auditedBy;
    }

    public void setAuditedBy(User auditedBy) {
        this.auditedBy = auditedBy;
    }

    public User getCanvassedBy() {
        return canvassedBy;
    }

    public void setCanvassedBy(User canvassedBy) {
        this.canvassedBy = canvassedBy;
    }

    public User getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(User approvedBy) {
        this.approvedBy = approvedBy;
    }

    public Integer getDocStatusId() {
        return docStatusId;
    }

    public void setDocStatusId(Integer docStatusId) {
        this.docStatusId = docStatusId;
    }

    public Integer getRvType() {
        return rvType;
    }

    public void setRvType(Integer rvType) {
        this.rvType = rvType;
    }
}
