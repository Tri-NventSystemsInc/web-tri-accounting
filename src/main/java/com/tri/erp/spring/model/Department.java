package com.tri.erp.spring.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by Ryan D. Repe on 10/6/2014.
 */
@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue
    @Column(name = "dept_id")
    private int id;

    @Column(name = "dept_name")
    @NotEmpty
    @Size(min = 3, max = 100)
    private String name;

    @Column(name = "dept_abbreviation")
    @NotEmpty
    @Size(min = 3, max = 25)
    private String abbreviation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
