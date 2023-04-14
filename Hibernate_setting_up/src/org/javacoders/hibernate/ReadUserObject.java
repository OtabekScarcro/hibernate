package org.javacoders.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javacoders.hibernate.entity.Users;

public class ReadUserObject {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Users.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			
			// Create object of entity class type
			Users user = new Users();
			
			// Start transaction
			session.beginTransaction();
			
			// Reading User object from Database
			user = session.get(Users.class, 2);
			
			// updating username
			user.setUsername("ScarcroJohnBryan");
			
			// Commit the transaction
			session.getTransaction().commit();
			System.out.println(user);
		} finally {
			session.close();
			factory.close();
		}
	}

}
