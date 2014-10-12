package com.tri.erp.spring.controller;

import com.tri.erp.spring.model.User;
import com.tri.erp.spring.reponse.CreateResponse;
import com.tri.erp.spring.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by TSI Admin on 10/9/2014.
 */

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    MessageSource messageSource;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/list")
    @ResponseBody
    public List<User> getUsers() {
        return userService.findAll();
    }

    // create user
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CreateResponse createUser(@Valid @RequestBody User user, BindingResult bindingResult) {
        return userService.processCreate(user, bindingResult, messageSource);
    }
}
