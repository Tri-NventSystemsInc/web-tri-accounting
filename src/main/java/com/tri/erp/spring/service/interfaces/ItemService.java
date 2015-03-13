package com.tri.erp.spring.service.interfaces;

import com.tri.erp.spring.model.Item;
import com.tri.erp.spring.model.SlEntity;
import com.tri.erp.spring.reponse.CreateResponse;
import org.springframework.context.MessageSource;
import org.springframework.validation.BindingResult;

import java.util.List;

public interface ItemService {
    public List<Item> findAll();
    public Item findById(Integer id);
    public Item findByDescription(String desc);
    public CreateResponse processUpdate(Item item, BindingResult bindingResult, MessageSource messageSource);
    public CreateResponse processCreate(Item item, BindingResult bindingResult, MessageSource messageSource);
}
