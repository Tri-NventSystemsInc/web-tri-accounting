package com.tri.erp.spring.repo;

import com.tri.erp.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by TSI Admin on 10/9/2014.
 */
public interface UserRepo extends JpaRepository<User, Integer> {

    public User findOneByUsername(String username);
    public List<User> findByEmail(String email);
}
