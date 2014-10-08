package com.tri.erp.spring.model;

import com.tri.erp.spring.model.enums.InventoryCategory;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by Ryan D. Repe on 10/5/2014.
 */
@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private int id;

    @Column(name = "nrc_no")
    @Size(min = 2, max = 10)
    private String nrcNo;

    @Column(name = "code_no")
    @Size(min = 2, max = 10)
    private String codeNo;

    @Column(name = "item_desc")
    @Size(min = 3, max = 1000)
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "unit_id")
    private UnitMeasure unit;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "seg_acct_id")
    private SegmentAccount account;

    @Column(name = "inv_cat_id")
    private int categoryId;

    private InventoryCategory getCategory(){
        return InventoryCategory.parse(this.categoryId);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNrcNo() {
        return nrcNo;
    }

    public void setNrcNo(String nrcNo) {
        this.nrcNo = nrcNo;
    }

    public String getCodeNo() {
        return codeNo;
    }

    public void setCodeNo(String codeNo) {
        this.codeNo = codeNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UnitMeasure getUnit() {
        return unit;
    }

    public void setUnit(UnitMeasure unit) {
        this.unit = unit;
    }

    public SegmentAccount getAccount() {
        return account;
    }

    public void setAccount(SegmentAccount account) {
        this.account = account;
    }
}
