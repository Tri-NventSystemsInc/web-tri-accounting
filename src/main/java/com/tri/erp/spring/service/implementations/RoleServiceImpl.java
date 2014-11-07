package com.tri.erp.spring.service.implementations;

import com.tri.erp.spring.commons.helpers.Checker;
import com.tri.erp.spring.commons.helpers.MessageFormatter;
import com.tri.erp.spring.model.Item;
import com.tri.erp.spring.model.Role;
import com.tri.erp.spring.model.User;
import com.tri.erp.spring.repo.ItemRepo;
import com.tri.erp.spring.repo.RoleRepo;
import com.tri.erp.spring.reponse.CreateResponse;
import com.tri.erp.spring.reponse.CreateRoleResponse;
import com.tri.erp.spring.reponse.CreateUserResponse;
import com.tri.erp.spring.service.interfaces.ItemService;
import com.tri.erp.spring.service.interfaces.RoleService;
import com.tri.erp.spring.validator.RoleValidator;
import com.tri.erp.spring.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by TSI Admin on 9/9/2014.
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepo roleRepo;

    @Override
    @Transactional(readOnly = true)
    public List<Role> findAll() {
        return roleRepo.findAll();
    }

    @Override
    public Role findById(Integer roleId) {
        return roleRepo.findOne(roleId);
    }

    @Override
    @Transactional
    public CreateResponse processCreate(Role role, BindingResult bindingResult, MessageSource messageSource) {
        CreateResponse response = new CreateRoleResponse();
        MessageFormatter messageFormatter = new MessageFormatter(bindingResult, messageSource, response);

        RoleValidator validator = new RoleValidator();
        validator.setService(this);
        validator.validate(role, bindingResult);

        if (bindingResult.hasErrors()) {
            messageFormatter.buildErrorMessages();
            response = messageFormatter.getResponse();
            response.setSuccess(false);
        } else {
            Role newRole = roleRepo.save(role);

            response.setModelId(newRole.getId());
            response.setSuccessMessage("Role successfully saved!");
            response.setSuccess(true);
        }
        return response;
    }

    @Override
    public Role findByName(String name) {
        List<Role> roles = roleRepo.findByName(name);
        if (!Checker.collectionIsEmpty(roles)) {
            return roles.get(0);
        } else return null;
    }

    @Override
    @Transactional
    public CreateResponse processUpdate(Role role, BindingResult bindingResult, MessageSource messageSource) {
        return this.processCreate(role, bindingResult, messageSource);
    }
}
