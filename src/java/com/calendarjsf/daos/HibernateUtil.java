/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calendarjsf.daos;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Joan
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory;
    
    static {
        try {
                //SessionFactory session = null;
            	Configuration cfg = new Configuration().configure("/hibernate.cfg.xml");
                StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
//            	StandardServiceRegistryBuilder sb = new StandardServiceRegistryBuilder();
//            	sb.applySettings(cfg.getProperties());
//            	StandardServiceRegistry standardServiceRegistry = sb.build();           	
            	sessionFactory = cfg.buildSessionFactory(serviceRegistry);
                //sessionFactory = session;
                System.out.println("Hasta aqui...");
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
