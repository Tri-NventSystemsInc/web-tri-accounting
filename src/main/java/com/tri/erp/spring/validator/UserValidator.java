package com.tri.erp.spring.validator;

import com.tri.erp.spring.commons.helpers.Checker;
import com.tri.erp.spring.model.User;
import com.tri.erp.spring.repo.UserRepo;
import com.tri.erp.spring.service.implementations.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.Validator;

import java.util.List;

/**
 * Created by TSI Admin on 9/11/2014.
 */

@Component
public class UserValidator implements Validator {

    private UserServiceImpl service;

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;

        if (!(Checker.isStringNullAndEmpty(user.getRetypePassword()) && Checker.isStringNullAndEmpty(user.getPassword()))) {
            if (!(user.getRetypePassword().equals(user.getPassword()))) {
                errors.rejectValue("password", "user.password.mismatch");
            }
        }

        User u = this.service.findByEmail(user.getEmail());
        if (u != null) {
            errors.rejectValue("email", "user.email.taken");
        }
    }

    public void setService(UserServiceImpl service) {
        this.service = service;
    }
}
