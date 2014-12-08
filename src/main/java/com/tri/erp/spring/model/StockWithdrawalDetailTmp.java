package com.tri.erp.spring.model;

import com.tri.erp.spring.model.enums.InventoryCategory;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Ryan D. Repe on 10/5/2014.
 */
@Entity
@Table
public class StockWithdrawalDetailTmp {
    public StockWithdrawalDetailTmp() {
    }

    public StockWithdrawalDetailTmp(int stockWithdrawalId, int itemId, int unitId, BigDecimal quantity, int invCatId) {
        this.stockWithdrawalId = stockWithdrawalId;
        this.itemId = itemId;
        this.unitId = unitId;
        this.quantity = quantity;
        this.invCatId = invCatId;
    }

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private int stockWithdrawalId;

    @Column
    private int itemId;

    @Column
    private int unitId;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "stockWithdrawalId")
//    private StockWithdrawalTmp stockWithdrawal;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "itemId")
//    private Item item;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "unitId")
//    private UnitMeasure unit;

    @Column
    private BigDecimal quantity;

    @Column
    private int invCatId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public StockWithdrawalTmp getStockWithdrawal() {
//        return stockWithdrawal;
//    }
//
//    public void setStockWithdrawal(StockWithdrawalTmp stockWithdrawal) {
//        this.stockWithdrawal = stockWithdrawal;
//    }

//    public Item getItem() {
//        return item;
//    }
//
//    public void setItem(Item item) {
//        this.item = item;
//    }
//
//    public UnitMeasure getUnit() {
//        return unit;
//    }
//
//    public void setUnit(UnitMeasure unit) {
//        this.unit = unit;
//    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    private InventoryCategory category() {
        return InventoryCategory.parse(this.invCatId);
    }

    private void setCategory(InventoryCategory category) {
        this.invCatId = category.getId();
    }
}
