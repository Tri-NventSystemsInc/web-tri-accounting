package com.tri.erp.spring.repo;

import com.tri.erp.spring.model.PageActionRoute;
import com.tri.erp.spring.model.PageComponent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by TSI Admin on 10/9/2014.
 */
public interface PageActionRouteRepo extends JpaRepository<PageActionRoute, Integer> {

    @Query(value = "SELECT " +
            "m.* " +
            "from PageActionRoute m " +
            "JOIN RolePageActionRoute ON m.id = RolePageActionRoute.FK_pageActionRouteId " +
            "JOIN UserRole ON RolePageActionRoute.FK_roleId = UserRole.FK_roleId " +
            "WHERE UserRole.FK_userId = :userId AND m.name = :route", nativeQuery = true)
    public PageActionRoute find(@Param("userId") Integer userId, @Param("route")String route);
}
