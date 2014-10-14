package com.tri.erp.spring.service.implementations;

import com.tri.erp.spring.commons.facade.AuthenticationFacade;
import com.tri.erp.spring.commons.helpers.Checker;
import com.tri.erp.spring.commons.helpers.MessageFormatter;
import com.tri.erp.spring.model.User;
import com.tri.erp.spring.repo.UserRepo;
import com.tri.erp.spring.reponse.CreateResponse;
import com.tri.erp.spring.reponse.CreateUserResponse;
import com.tri.erp.spring.service.interfaces.UserService;
import com.tri.erp.spring.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
    private AuthenticationFacade authenticationFacade;

    @Autowired
    UserRepo userRepo;

    @Override
    public User create(User user) {
        return userRepo.save(user);
    }

    @Override
    public User findByEmail(String email) {
        List<User> users = userRepo.findByEmail(email);
        if (!Checker.collectionIsEmpty(users)) {
            return users.get(0);
        } else return null;
    }

    @Override
    public User findById(Integer id) {
        User user = userRepo.findOne(id);
        return user;
    }

    @Override
    public CreateResponse processUpdate(User user, BindingResult bindingResult, MessageSource messageSource) {
        return processCreate(user, bindingResult, messageSource);
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
            User newUser = user;
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

            Authentication authentication;
            if (user.getId() == null || user.getId() == 0 ) {   // insert mode
                authentication = authenticationFacade.getAuthentication();
                String curUsername = authentication.getName();
                User createdBy = userRepo.findOneByUsername(curUsername);
                user.setCreatedBy(createdBy);

                String hashedPassword = passwordEncoder.encode(user.getPassword());

                user.setPassword(hashedPassword);

                newUser = create(user);
            } else {    // update mode
                if (!Checker.isStringNullAndEmpty(user.getPassword())) { // has new password
                    String hashedPassword = passwordEncoder.encode(user.getPassword());
                    user.setPassword(hashedPassword);
                    newUser = create(user);
                } else {
                    userRepo.saveWoPassword(
                            user.getId(),
                            user.getFullName(),
                            user.getUsername(),
                            user.getEmail()
                    );
                }
            }

            response.setModelId(newUser.getId());
            response.setSuccessMessage("User successfully saved!");
            response.setSuccess(true);
        }

        return response;
    }
}
