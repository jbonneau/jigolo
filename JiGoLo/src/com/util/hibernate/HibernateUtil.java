/**
 * Créée le 05 septembre 08
 */
package com.util.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author LhaaG
 *
 */
public class HibernateUtil {

	public static final SessionFactory sessionFactory;

	static {
		try {
			// Création de la SessionFactory à partir de hibernate.cfg.xml
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static final ThreadLocal session = new ThreadLocal();

	public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}// class HibernateUtil