package com.tri.erp.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tri.erp.spring.model.enums.InventoryCategory;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Ryan D. Repe on 10/5/2014.
 */
@Entity
public class StockWithdrawalDetailTmp implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private BigDecimal quantity;
    @JsonIgnoreProperties(ignoreUnknown = true)
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="FK_itemId")
    private Item item;

//    @JsonIgnoreProperties(ignoreUnknown = true)
//    @NotFound(action = NotFoundAction.IGNORE)
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="FK_stockWithdrawalId")
@ManyToOne(optional = false)
@JoinColumn(name = "FK_stockWithdrawalId", referencedColumnName = "id")
    private StockWithdrawalTmp stockWithdrawal;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="FK_unitId")
    private UnitMeasure unit;

    public StockWithdrawalDetailTmp() {
    }

    public StockWithdrawalDetailTmp(BigDecimal quantity, Item item, StockWithdrawalTmp stockWithdrawal, UnitMeasure unit, int FK_inventoryCategoryId) {
        this.quantity = quantity;
        this.item = item;
        this.stockWithdrawal = stockWithdrawal;
        this.unit = unit;
        this.FK_inventoryCategoryId = FK_inventoryCategoryId;
    }

    // GETTERS & SETTERS

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // NAVIGATION PROPERTIES (GETTERS & SETTERS)

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public StockWithdrawalTmp getStockWithdrawal() {
        return stockWithdrawal;
    }

    public void setStockWithdrawal(StockWithdrawalTmp stockWithdrawal) {
        this.stockWithdrawal = stockWithdrawal;
    }

    public UnitMeasure getUnit() {
        return unit;
    }

    public void setUnit(UnitMeasure unit) {
        this.unit = unit;
    }

    // ENUMS


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
