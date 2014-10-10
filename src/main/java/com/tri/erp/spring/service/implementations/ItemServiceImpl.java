package com.tri.erp.spring.service.implementations;

import com.tri.erp.spring.model.Item;
import com.tri.erp.spring.model.SlEntity;
import com.tri.erp.spring.repo.ItemRepo;
import com.tri.erp.spring.repo.SlEntityRepo;
import com.tri.erp.spring.service.interfaces.ItemService;
import com.tri.erp.spring.service.interfaces.SlEntityService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
