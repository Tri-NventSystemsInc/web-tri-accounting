package com.tri.erp.spring.repo;

import com.tri.erp.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by TSI Admin on 10/9/2014.
 */
public interface UserRepo extends JpaRepository<User, Integer> {

    public User findOneByUsername(String username);
    public List<User> findByEmail(String email);

    @Modifying
    @Transactional
    @Query(value = "UPDATE User set " +
            "fullName = :fullName, " +
            "username = :username, " +
            "email = :email, " +
            "enabled = :enabled " +
            "WHERE id = :userId", nativeQuery = true)
    public int saveWoPassword(@Param("userId") Integer userId,
                             @Param("fullName") String fullName,
                             @Param("username") String username,
                             @Param("email") String email,
                             @Param("enabled") Boolean enabled
    );
}
