package com.tri.erp.spring.controller;

import com.tri.erp.spring.model.User;
import com.tri.erp.spring.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by TSI Admin on 10/9/2014.
 */

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/list")
    @ResponseBody
    public List<User> getUsers() {
        return userService.findAll();
    }
}
