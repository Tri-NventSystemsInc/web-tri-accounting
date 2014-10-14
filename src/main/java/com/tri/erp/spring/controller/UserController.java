package com.tri.erp.spring.controller;

import com.tri.erp.spring.model.Account;
import com.tri.erp.spring.model.User;
import com.tri.erp.spring.reponse.AccountDto;
import com.tri.erp.spring.reponse.CreateResponse;
import com.tri.erp.spring.reponse.UserDto;
import com.tri.erp.spring.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable Integer id) {
       return userService.findById(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public CreateResponse updateUser(@Valid @RequestBody User user, BindingResult bindingResult) {
        return userService.processUpdate(user, bindingResult, messageSource);
    }
}
