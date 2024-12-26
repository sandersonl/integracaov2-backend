package com.integracaobackend.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    private HibernateUtil(){}

    public static Session getInstance() {
        if (sessionFactory == null) {
            try {
                sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
                sessionFactory.openSession();
            } catch (Throwable ex) {
                System.err.println("Initial SessionFactory creation failed." + ex);
                throw new ExceptionInInitializerError(ex);
            }
        }

        return sessionFactory.getCurrentSession();
    }

}