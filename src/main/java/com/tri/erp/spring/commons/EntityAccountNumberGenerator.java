package com.tri.erp.spring.commons;

import com.tri.erp.spring.commons.facade.AuthenticationFacade;
import com.tri.erp.spring.model.EntityAccountNumber;
import com.tri.erp.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by TSI Admin on 11/12/2014.
 */

@Component
public class EntityAccountNumberGenerator {

    @Autowired
    AuthenticationFacade authenticationFacade;

    @PersistenceContext
    EntityManager entityManager;

    public int get() {
        User user = authenticationFacade.getLoggedIn();

        EntityAccountNumber accountNumber = new EntityAccountNumber(user);

        entityManager.persist(accountNumber);
        entityManager.flush();

        return accountNumber.getId();
    }
}
