package com.tri.erp.spring.service.interfaces;


import com.tri.erp.spring.model.User;
import com.tri.erp.spring.reponse.CreateResponse;
import com.tri.erp.spring.reponse.UserDto;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.List;

/**
 * Created by TSI Admin on 10/9/2014.
 */
public interface UserService {
    public User create(User user);
    public User findByEmail(String email);
    public User findByUsername(String username);
    public User findById(Integer id);
    public CreateResponse processUpdate(User user, BindingResult bindingResult, MessageSource messageSource);
    public List<User> findAll();
    public CreateResponse processCreate(User user, BindingResult bindingResult, MessageSource messageSource);
}
