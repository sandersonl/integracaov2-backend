package com.integracaobackend.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

    private static StandardServiceRegistry standardServiceRegistry;

    private static volatile SessionFactory sessionFactory;

    private static HibernateUtil instance;

    private HibernateUtil(){}

    static {
        try {

            instance = new HibernateUtil();

            if(sessionFactory == null) {
                standardServiceRegistry = new StandardServiceRegistryBuilder().configure().build();
                MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);
                Metadata metadata  = metadataSources.getMetadataBuilder().build();
                sessionFactory = metadata.getSessionFactoryBuilder().build();
            }
        } catch (Exception e) {
            e.printStackTrace();
            if(standardServiceRegistry != null) {
                StandardServiceRegistryBuilder.destroy(standardServiceRegistry);
            }
        }
    }

    public static Session getSession() {
        return sessionFactory.openSession();
    }

}