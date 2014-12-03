package com.tri.erp.spring.validator;

import com.tri.erp.spring.model.Item;
import com.tri.erp.spring.model.Role;
import com.tri.erp.spring.service.implementations.ItemServiceImpl;
import com.tri.erp.spring.service.implementations.RoleServiceImpl;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by TSI Admin on 9/11/2014.
 */

@Component
public class ItemValidator implements Validator {

    private ItemServiceImpl service;

    @Override
    public boolean supports(Class<?> aClass) {
        return Item.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Item role = (Item) o;

//        Role r = this.service.findByName(role.getName());
//        // insert mode
//        if (role.getId() == null || role.getId() == 0) {
//            if (r != null) {
//                errors.rejectValue("name", "role.name.taken");
//            }
//        } else {
//            // update role
//            if (r != null && r.getId() != role.getId()) { // diff role
//                errors.rejectValue("name", "role.name.taken");
//            }
//        }
    }

    public void setService(ItemServiceImpl service) {
        this.service = service;
    }
}
