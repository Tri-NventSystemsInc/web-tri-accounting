package com.tri.erp.spring.service.implementations;

import com.tri.erp.spring.commons.helpers.MessageFormatter;
import com.tri.erp.spring.model.Item;
import com.tri.erp.spring.model.SlEntity;
import com.tri.erp.spring.repo.ItemRepo;
import com.tri.erp.spring.repo.SlEntityRepo;
import com.tri.erp.spring.reponse.CreateResponse;
import com.tri.erp.spring.reponse.CreateRoleResponse;
import com.tri.erp.spring.service.interfaces.ItemService;
import com.tri.erp.spring.service.interfaces.SlEntityService;
import com.tri.erp.spring.validator.ItemValidator;
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
public class ItemServiceImpl implements ItemService {
    @Resource
    ItemRepo itemRepo;

    @Override
    @Transactional(readOnly = true)
    public List<Item> findAll() {
        return itemRepo.findAllByOrderByDescriptionAsc();
    }

    @Override
    @Transactional(readOnly = true)
    public Item findById(Integer id) {
        return itemRepo.findOne(id);
    }

    @Override
    public Item findByDescription(String desc) {
        return itemRepo.findOneByDescription(desc);
    }

    @Override
    @Transactional
    public CreateResponse processUpdate(Item item, BindingResult bindingResult, MessageSource messageSource) {
        return this.processCreate(item, bindingResult, messageSource);
    }

    @Override
    @Transactional
    public CreateResponse processCreate(Item item, BindingResult bindingResult, MessageSource messageSource) {
        CreateResponse response = new CreateRoleResponse();
        MessageFormatter messageFormatter = new MessageFormatter(bindingResult, messageSource, response);

        ItemValidator validator = new ItemValidator();
        validator.setService(this);
        validator.validate(item, bindingResult);

        if (bindingResult.hasErrors()) {
            messageFormatter.buildErrorMessages();
            response = messageFormatter.getResponse();
            response.setSuccess(false);
        } else {
            Item newItem = itemRepo.save(item);

            response.setModelId(newItem.getId());
            response.setSuccessMessage("Item successfully saved!");
            response.setSuccess(true);
        }
        return response;
    }
}
