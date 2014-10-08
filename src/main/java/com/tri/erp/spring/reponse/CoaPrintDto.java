package com.tri.erp.spring.reponse;

import java.io.Serializable;

/**
 * Created by TSI Admin on 10/7/2014.
 */
public class CoaPrintDto implements Serializable {
    private String title;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
