package com.tri.erp.spring.repo;

import com.tri.erp.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by TSI Admin on 10/9/2014.
 */
public interface UserRepo extends JpaRepository<User, Integer> {

}
