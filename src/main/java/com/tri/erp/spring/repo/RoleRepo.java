package com.tri.erp.spring.repo;

import com.tri.erp.spring.model.Menu;
import com.tri.erp.spring.model.Role;
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
public interface RoleRepo extends JpaRepository<Role, Integer> {
    public List<Role> findByName(String name);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM RoleMenu WHERE FK_roleId = :roleId", nativeQuery = true)
    public int removeMenus(@Param("roleId") Integer roleId);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO RoleMenu SET " +
            "FK_roleId = :roleId, " +
            "FK_menuId = :menuId", nativeQuery = true)
    public int saveMenus(@Param("roleId") Integer roleId, @Param("menuId") Integer menuId);

    @Transactional(readOnly = true)
    @Query(value = "SELECT " +
            "Menu.id, Menu.title, Menu.FK_parentMenuId " +
            "FROM RoleMenu " +
            "JOIN Menu ON RoleMenu.FK_menuId = Menu.id " +
            "WHERE FK_roleId = :roleId " +
            "ORDER BY Menu.order ASC, Menu.id ASC", nativeQuery = true)
    public List<Object[]> findMenusByRoleId(@Param("roleId") Integer roleId);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM RolePageComponent WHERE FK_roleId = :roleId", nativeQuery = true)
    public int removePageComponents(@Param("roleId") Integer roleId);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM RolePageComponent " +
            "WHERE FK_roleId = :roleId AND FK_pageComponentId = :pageComponentId", nativeQuery = true)
    public int removePageComponents(@Param("roleId") Integer roleId, @Param("pageComponentId") Integer pageComponentId);

    @Modifying
    @Transactional
    @Query(value = "INSERT IGNORE INTO RolePageComponent SET " +
            "FK_roleId = :roleId, " +
            "FK_pageComponentId = :pageComponentId", nativeQuery = true)
    public int savePageComponents(@Param("roleId") Integer roleId, @Param("pageComponentId") Integer pageComponentId);
}
