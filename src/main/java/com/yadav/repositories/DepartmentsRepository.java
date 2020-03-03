  package com.yadav.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.yadav.entities.DepartmentsEntity;

@Repository
public class DepartmentsRepository {

	private SessionFactory sessionFactory;

	public void save(DepartmentsEntity departmentsEntity) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(departmentsEntity);
		session.getTransaction().commit();
		session.close();
	
	


	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
