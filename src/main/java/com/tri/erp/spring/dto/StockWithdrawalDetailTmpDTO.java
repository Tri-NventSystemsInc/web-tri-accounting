package com.tri.erp.spring.dto;

import com.tri.erp.spring.model.Item;
import com.tri.erp.spring.model.StockWithdrawalTmp;
import com.tri.erp.spring.model.UnitMeasure;
import com.tri.erp.spring.model.enums.InventoryCategory;

import java.math.BigDecimal;

/**
 * Created by Ryan D. Repe on 10/5/2014.
 */
public class StockWithdrawalDetailTmpDTO {

    private int id;
    private StockWithdrawalTmp stockWithdrawal;
    private Item item;
    private UnitMeasure unit;
    private BigDecimal quantity;
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
