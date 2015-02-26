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
public class PageActionRoute implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer id;

    @Column
    private String name;

    public PageActionRoute() {}

    public PageActionRoute(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return this.getName();
    }
}
