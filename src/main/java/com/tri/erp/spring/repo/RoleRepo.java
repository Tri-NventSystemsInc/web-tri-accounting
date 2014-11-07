package com.tri.erp.spring.repo;

import com.tri.erp.spring.model.Menu;
import com.tri.erp.spring.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by TSI Admin on 10/9/2014.
 */
public interface RoleRepo extends JpaRepository<Role, Integer> {
}
