package com.tri.erp.spring.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by Ryan D. Repe on 10/5/2014.
 */
@Entity
@Table(name = "unit_measure")
public class UnitMeasure {

    @Id
    @GeneratedValue
    @Column(name = "unit_id")
    private int id;

    @Column(name = "unit_desc")
    @NotEmpty
    @Size(min = 2, max = 45)
    private String description;

    @Column
    @NotEmpty
    @Size(min = 1, max = 15)
    private String code;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
