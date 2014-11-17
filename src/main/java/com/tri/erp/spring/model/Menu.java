package com.tri.erp.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by TSI Admin on 11/1/2014.
 */

@Entity
public class Menu {
    @Id
    @GeneratedValue
    @Column
    private Integer id;

    @Column
    private String title;

    @Column
    private String url;

    @Column
    private String iconClass;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="FK_parentMenuId", nullable = true, columnDefinition = "0")
    private Menu parentMenu;

    public Menu(String title, String url, String iconClass, Menu parentMenu) {
        this.title = title;
        this.url = url;
        this.iconClass = iconClass;
        this.parentMenu = parentMenu;
    }

    public Menu() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIconClass() {
        return iconClass;
    }

    public void setIconClass(String iconClass) {
        this.iconClass = iconClass;
    }

    public Menu getParentMenu() {
        return parentMenu;
    }

    public void setParentMenu(Menu parentMenu) {
        this.parentMenu = parentMenu;
    }
}
