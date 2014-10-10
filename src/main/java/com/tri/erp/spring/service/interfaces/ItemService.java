package com.tri.erp.spring.service.interfaces;

import com.tri.erp.spring.model.Item;
import com.tri.erp.spring.model.SlEntity;

import java.util.List;

public interface ItemService {
    public List<Item> findAll();
}
