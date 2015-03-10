package com.tri.erp.spring.repo;

import com.tri.erp.spring.model.Menu;
import com.tri.erp.spring.model.PageComponent;
import com.tri.erp.spring.reponse.PageComponentDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by TSI Admin on 10/9/2014.
 */
public interface PageComponentRepo extends JpaRepository<PageComponent, Integer> {

    @Query(value = "SELECT " +
            "m.* " +
            "FROM PageComponent m " +
            "JOIN RolePageComponent ON m.id = FK_pageComponentId " +
            "JOIN UserRole ON RolePageComponent.FK_roleId = UserRole.FK_roleId " +
            "WHERE FK_userId = ?1", nativeQuery = true)
    public List<PageComponent> findAllByUserId(Integer userId);

    public List<PageComponent> findAllByPageId(Integer pageId);

    @Query(value = "SELECT " +
            "m.* " +
            "FROM PageComponent m " +
            "JOIN RolePageComponent ON m.id = FK_pageComponentId " +
            "WHERE FK_roleId = ?1", nativeQuery = true)
    public List<PageComponent> findAllByRoleId(Integer roleId);
}
