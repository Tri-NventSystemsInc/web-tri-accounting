package com.tri.erp.spring.service.implementations;

import com.tri.erp.spring.model.User;
import com.tri.erp.spring.repo.UserRepo;
import com.tri.erp.spring.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by TSI Admin on 10/9/2014.
 */


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }
}
