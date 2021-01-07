package org.com.dao;

import java.util.List;

import org.com.entities.Halls;
import org.com.entities.RegisterHall;
import org.com.entities.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public class RegisterDaoImpl implements RegisterDao {
	private SessionFactory sessionFactory;

	@Autowired
	public RegisterDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	@Override
	public void insert(RegisterHall hall) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(hall);
		

	}
	@Transactional
	@Override
	public List<RegisterHall> getAll() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("select h from org.com.entities.RegisterHall as h");
		List<RegisterHall> halls=query.list();
		return halls;
	}

}
