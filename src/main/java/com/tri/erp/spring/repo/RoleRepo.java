package com.tri.erp.spring.repo;

import com.tri.erp.spring.model.Menu;
import com.tri.erp.spring.model.Role;
import com.tri.erp.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by TSI Admin on 10/9/2014.
 */
public interface RoleRepo extends JpaRepository<Role, Integer> {
    public List<Role> findByName(String name);
}
