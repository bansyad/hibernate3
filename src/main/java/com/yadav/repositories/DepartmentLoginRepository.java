package com.yadav.repositories;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.yadav.entities.DepartmentLoginEntity;

public class DepartmentLoginRepository {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(DepartmentLoginEntity departmentLoginEntity) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(departmentLoginEntity);
		session.getTransaction().commit();
		session.close();

	}

	/*
	 * public DepartmentLoginEntity getByUsername(String userid) {
	 * 
	 * Session session = sessionFactory.openSession(); session.beginTransaction();
	 * Query q = (Query)
	 * session.createQuery("From DepartmentLoginEntity cl where cl.username = :name"
	 * ); q.setParameter("name", userid);
	 * 
	 * DepartmentLoginEntity loginEntity = (DepartmentLoginEntity)
	 * ((org.hibernate.Query) q).uniqueResult(); session.getTransaction().commit();
	 * session.close();
	 * 
	 * return loginEntity; }
	 */
}
