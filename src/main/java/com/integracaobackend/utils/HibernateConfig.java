package com.integracaobackend.utils;

import org.springframework.context.annotation.Configuration;

import javax.persistence.*;

@Configuration
public class HibernateUtil {

    private static HibernateUtil _instance;
    @PersistenceUnit(unitName = "persistence")
    private static EntityManagerFactory entityManagerFactory;
    @PersistenceContext(unitName = "peristence", properties = {
            @PersistenceProperty(name = "org.hibernate.flushMode", value = "MANUAL")
    })
    private static EntityManager entityManager;

    public HibernateUtil(){}

    static {
        try {
            _instance = new HibernateUtil();
            entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
            entityManager = entityManagerFactory.createEntityManager();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static HibernateUtil instance() {
        return _instance;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

}