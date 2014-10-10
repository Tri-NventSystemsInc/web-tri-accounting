package com.tri.erp.spring.model;

import javax.persistence.*;

/**
 * Created by TSI Admin on 10/6/2014.
 */
@Entity
@Table(name = "unit_measure")
public class UnitMeasure {
    @Id
    @GeneratedValue
    @Column(name = "unit_id")
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name = "unit_desc")
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
