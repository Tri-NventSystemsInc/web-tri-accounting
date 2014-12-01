package com.tri.erp.spring.service.interfaces;


import com.tri.erp.spring.model.Menu;
import com.tri.erp.spring.model.User;
import com.tri.erp.spring.reponse.CreateResponse;
import com.tri.erp.spring.reponse.MenuDto;
import org.springframework.context.MessageSource;
import org.springframework.validation.BindingResult;

import java.util.List;

/**
 * Created by TSI Admin on 10/9/2014.
 */
public interface MenuService {
    public List<MenuDto> findAll();
}
