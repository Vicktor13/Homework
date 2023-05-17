package com.vick.HW5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SessionFactoryUtils {
    private static SessionFactory factory;

    public static void init() {
        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
    }

    public Session getSession() {
        return factory.getCurrentSession();
    }

    public static void shutdown() {
        if (factory != null) {
            factory.close();
        }
    }
}
