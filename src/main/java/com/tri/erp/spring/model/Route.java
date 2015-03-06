package com.tri.erp.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by TSI Admin on 2/26/2015.
 */

@Entity
public class Route implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer id;

    @Column
    private String name;

    @Column
    private String type;

    @Column
    private Boolean restricted;

    @Column
    private String description;

    public Route() {}

    public Route(String name, String type, Boolean restricted, String description) {
        this.name = name;
        this.type = type;
        this.restricted = restricted;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getRestricted() {
        return restricted;
    }

    public void setRestricted(Boolean restricted) {
        this.restricted = restricted;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
