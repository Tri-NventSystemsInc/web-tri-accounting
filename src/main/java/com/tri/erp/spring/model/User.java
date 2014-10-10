package com.tri.erp.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

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
    @Length(min = 3, max = 512, message = "Invalid length for fullname (max=512, min=3)")
    @Column
    private String fullName;

    @NotNull
    @Length(min = 3, max = 64, message = "Invalid length for username (max=64, min=3)")
    @Column(unique = true)
    private String username;

    @Column
    private String salt;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="FK_createdByUserId", nullable = true)
    private User createBy;

    @Transient
    @Column
    private Date createdAt;

    @Transient
    @Column
    private Date updatedAt;

    public User(String fullName, String username, String salt, User createBy, Date createdAt, Date updatedAt) {
        this.fullName = fullName;
        this.username = username;
        this.salt = salt;
        this.createBy = createBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

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

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public User getCreateBy() {
        return createBy;
    }

    public void setCreateBy(User createBy) {
        this.createBy = createBy;
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
}
