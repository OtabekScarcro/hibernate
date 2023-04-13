package org.javacoders.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javacoders.hibernate.entity.Users;

public class Insert {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Users.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			// Create object of entity class type
			Users user = new Users("nawazakib", "45rew4", "akib", "nawaz");
			// Start transaction
			session.beginTransaction();
			// Perform operation
			session.save(user);
			// Commit the transaction
			session.getTransaction().commit();
			System.out.println("Row added!");

		} finally {
			session.close();
			factory.close();
		}

	}
}
