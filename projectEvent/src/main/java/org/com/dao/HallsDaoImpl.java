package org.com.dao;

import java.util.List;

import org.com.entities.Halls;
import org.com.entities.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public class HallsDaoImpl implements HallDao {
	private SessionFactory sessionFactory;

	@Autowired
	public HallsDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	public List<Halls> getAll() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("select h from org.com.entities.Halls as h");
		List<Halls> halls=query.list();
		return halls;
	}
	@Transactional
	@Override
	public void delete(int id) {
		Session session=sessionFactory.getCurrentSession();
		Halls user=session.load(Halls.class,id);
		if(user!=null)
		{
			session.delete(user);
		}
				
	}
	@Transactional
	@Override
	public Halls update(Halls h) {
		sessionFactory.getCurrentSession().update(h);
		return h;
	}
	@Transactional
	@Override
	public Halls getHall(int id) {
		Session session=sessionFactory.getCurrentSession();
		Halls user=session.get(Halls.class,id);
		return user;
		
	}
	@Transactional
	@Override
	public void insert(Halls h) {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.save(h);
			//currentSession.close();	
		}
		
	}
	
	
	
	

