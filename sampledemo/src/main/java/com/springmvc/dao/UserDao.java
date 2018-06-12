package com.springmvc.dao;

import javax.annotation.PreDestroy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.springmvc.bean.Address;
import com.springmvc.bean.User;

@Repository
public class UserDao implements UserDaoInterface {

	private static SessionFactory factory = new Configuration()
											.configure()
											.addAnnotatedClass(User.class)
											.addAnnotatedClass(Address.class)
											.buildSessionFactory();

	@Override
	public Object createUser(User user) {

		Session session = null;
		Transaction txn = null;
		Object returnedId = null;
		try {
			session = factory.openSession();
			txn = session.beginTransaction();
			returnedId = session.save(user);
			txn.commit();
		} catch (Exception exc) {
			exc.printStackTrace();
			// TO DO handle hibernate exceptions
		} finally {
			session.close();
		}
		return returnedId;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User readUser(String name, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@PreDestroy
	public void closeFactory() {
		if (null != factory) {
			factory.close();
		}
	}
}
