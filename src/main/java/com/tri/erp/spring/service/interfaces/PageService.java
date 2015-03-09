package com.tri.erp.spring.service.interfaces;


import com.tri.erp.spring.model.Page;
import com.tri.erp.spring.reponse.MenuDto;
import com.tri.erp.spring.reponse.PageComponentDto;

import java.util.List;

/**
 * Created by TSI Admin on 10/9/2014.
 */
public interface PageService {
    public List<Page> findAll();
    public List<PageComponentDto> getPageComponents(Integer pageId);
}
