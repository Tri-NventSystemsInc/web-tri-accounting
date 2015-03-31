package com.tri.erp.spring.model;

import com.tri.erp.spring.model.enums.InventoryCategory;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Ryan D. Repe on 10/5/2014.
 */
@Entity
@Table(name = "stock_withdrawal_detail_tmp")
public class StockWithdrawalDetailTmp {

    @Id
    @GeneratedValue
    @Column(name = "stock_withdrawal_detail_id")
    private int id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="stock_withdrawal_id")
    private StockWithdrawalTmp stockWithdrawal;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "unit_id")
    private UnitMeasure unit;

    @Column
    private BigDecimal quantity;

    @Column(name = "inv_cat_id")
    private int categoryId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StockWithdrawalTmp getStockWithdrawal() {
        return stockWithdrawal;
    }

    public void setStockWithdrawal(StockWithdrawalTmp stockWithdrawal) {
        this.stockWithdrawal = stockWithdrawal;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public UnitMeasure getUnit() {
        return unit;
    }

    public void setUnit(UnitMeasure unit) {
        this.unit = unit;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    private InventoryCategory category(){
        return InventoryCategory.parse(this.categoryId);
    }
    private void setCategory(InventoryCategory category){
        this.categoryId = category.getId();
    }
}
