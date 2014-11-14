package com.tri.erp.spring.service.implementations;

import com.tri.erp.spring.commons.Debug;
import com.tri.erp.spring.commons.helpers.Checker;
import com.tri.erp.spring.commons.helpers.MessageFormatter;
import com.tri.erp.spring.model.Item;
import com.tri.erp.spring.model.Menu;
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
import org.hibernate.dialect.Ingres10Dialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

        Role role = roleRepo.findOne(roleId);

        if (role != null) { // get roles
            List<Object[]> rolesObj = roleRepo.findMenusByRoleId(role.getId());
            if (!Checker.collectionIsEmpty(rolesObj)) {

                for (Object[] obj : rolesObj) {

                    Menu menu = new Menu();
                    menu.setId((Integer)obj[0]);
                    menu.setTitle((String)obj[1]);

                    Menu parentMenu = new Menu();
                    parentMenu.setId((Integer)obj[2]);
                    menu.setParentMenu(parentMenu);

                    role.getMenus().add(menu);
                }
            }
        }

        return role;
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

            if (role.getId() != null && role.getId() > 0) { // update mode
                roleRepo.removeMenus(role.getId());
            }

            // insert role menus
            if (!Checker.collectionIsEmpty(role.getMenus())) {
                for (Menu menu : role.getMenus()) {
                    roleRepo.saveMenus(role.getId(), menu.getId());
                }
            }

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