package com.tri.erp.spring.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Ryan D. Repe on 10/13/2014.
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private int id;
    @Column(name = "full_name")
    private String fullName;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private int gender;
    @Column(name = "emp_id")
    private int empId;
    @Column(name = "trans_date")
    private Date transDate;

    public User() {
    }

    public User(String fullName, String username, String password, int gender, int empId, Date transDate) {
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.empId = empId;
        this.transDate = transDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }
}
