package com.tri.erp.spring.repo;

import com.tri.erp.spring.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by TSI Admin on 11/11/2014.
 */
public interface SupplierRepo extends JpaRepository<Supplier, Integer> {
}
