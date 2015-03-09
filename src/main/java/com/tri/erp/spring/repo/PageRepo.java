package com.tri.erp.spring.repo;

import com.tri.erp.spring.model.Page;
import com.tri.erp.spring.model.PageComponent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by TSI Admin on 10/9/2014.
 */
public interface PageRepo extends JpaRepository<Page, Integer> {
}
