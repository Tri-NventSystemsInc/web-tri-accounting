package com.tri.erp.spring.service.implementations;

import com.tri.erp.spring.commons.helpers.MessageFormatter;
import com.tri.erp.spring.model.User;
import com.tri.erp.spring.repo.UserRepo;
import com.tri.erp.spring.reponse.CreateAccountResponse;
import com.tri.erp.spring.reponse.CreateResponse;
import com.tri.erp.spring.reponse.CreateUserResponse;
import com.tri.erp.spring.service.interfaces.UserService;
import com.tri.erp.spring.validator.AccountValidator;
import com.tri.erp.spring.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

import java.util.List;

/**
 * Created by TSI Admin on 10/9/2014.
 */


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public User create(User user) {
        return userRepo.save(user);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    @Transactional
    public CreateResponse processCreate(User user, BindingResult bindingResult, MessageSource messageSource) {
        CreateResponse response = new CreateUserResponse();
        MessageFormatter messageFormatter = new MessageFormatter(bindingResult, messageSource, response);

        UserValidator validator = new UserValidator();
        validator.setService(this);
        validator.validate(user, bindingResult);

        if (bindingResult.hasErrors()) {
            messageFormatter.buildErrorMessages();
            response = messageFormatter.getResponse();
            response.setSuccess(false);
        } else {
            user.setSalt("EvelynSalt");
            User newUser = create(user);
            response.setModelId(newUser.getId());
            response.setSuccessMessage("User successfully saved!");
            response.setSuccess(true);
        }

        return response;
    }
}
