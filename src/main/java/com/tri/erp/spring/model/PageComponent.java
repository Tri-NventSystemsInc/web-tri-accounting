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
public class PageComponent implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer id;

    @Column
    private String pageName;

    @Column
    private String html;

    @Column
    private String clazz;

    @Column
    private String domId;

    public PageComponent(String pageName, String html, String clazz, String domId) {
        this.setPageName(pageName);
        this.setHtml(html);
        this.setClazz(clazz);
        this.setDomId(domId);
    }

    public PageComponent() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getDomId() {
        return domId;
    }

    public void setDomId(String domId) {
        this.domId = domId;
    }

    @Override
    public String toString() {
        return this.getHtml();
    }
}
