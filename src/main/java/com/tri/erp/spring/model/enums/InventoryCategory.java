package com.tri.erp.spring.model.enums;

/**
 * Created by Ryan D. Repe on 10/6/2014.
 */
public enum InventoryCategory {
    Line_Materials(1),
    Office_Supplies(2),
    Line_Tools(3),
    Special_Equipment(4),
    Office_Equipment_Fixtures_and_Furniture(5),
    Meter(6),
    Transportation_Equipment(7),
    Maintainance_Office_and_General_Plant(8),
    Spare_Parts(9),
    Electrical_Materials(10),
    Housewiring_Materials(11),
    Administrative_and_General_Expense(12)
    ;
    private int id;

    InventoryCategory(int id) {
        this.id = id;
    }

    public static InventoryCategory parse(int id) {
        InventoryCategory category = null; // Default
        for (InventoryCategory item : InventoryCategory.values()) {
            if (item.getId()==id) {
                category = item;
                break;
            }
        }
        return category;
    }

    public int getId() {
        return id;
    }
}
