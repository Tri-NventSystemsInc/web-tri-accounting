package com.tri.erp.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.javafx.beans.annotations.Default;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by TSI Admin on 10/9/2014.
 */

@Entity
public class User {
    @Id
    @GeneratedValue
    @Column
    private Integer id;

    @NotNull
    @Length(min = 3, max = 512, message = "Invalid length for full name (max=512, min=3)")
    @Column
    private String fullName;

    @NotNull
    @Length(min = 3, max = 64, message = "Invalid length for username (max=64, min=3)")
    @Column(unique = true)
    private String username;

    @NotNull
    @Length(min = 10, max = 128, message = "Email length is invalid")
    @Column(unique = true)
    private String email;

    @Transient
    @Column
    private String password;

    @Transient
    @Column
    private String retypePassword;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="FK_createdByUserId", nullable = true, columnDefinition = "0")
    private User createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP")
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP")
    private Date updatedAt;

    @Column(nullable = false)
    private Boolean enabled = false;

    @Transient
    @JsonIgnoreProperties(ignoreUnknown = true)
    @NotFound(action = NotFoundAction.IGNORE)
    private Set<Role> roles = new HashSet<>();

    public User(String fullName, String username, String email, String password, String retypePassword, User createdBy, Date createdAt, Date updatedAt, Boolean enabled, Set<Role> roles) {
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.retypePassword = retypePassword;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.enabled = enabled;
        this.roles = roles;
    }

    public User() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createBy) {
        this.createdBy = createBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getRetypePassword() {
        return retypePassword;
    }

    public void setRetypePassword(String retypePassword) {
        this.retypePassword = retypePassword;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
