package com.tri.erp.spring.model;

import javax.persistence.*;

/**
 * Created by TSI Admin on 10/6/2014.
 */
@Entity
public class UnitMeasure {
    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String code;

    @Column
    private String description;

    public UnitMeasure(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public UnitMeasure() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
