package com.tri.erp.spring.service.interfaces;


import com.tri.erp.spring.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by TSI Admin on 10/9/2014.
 */
public interface UserService {
    public List<User> findAll();
}
