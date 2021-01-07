package org.com.dao;

import java.util.List;
import java.util.Optional;

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
public class UserDaoImpl implements UserDao {
	private SessionFactory sessionFactory;

	@Autowired
	public UserDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	@Override
	public void insert(User user) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(user);
		//currentSession.close();	
	}
	@Transactional
	@Override
	public boolean validate(User user) {
		boolean b=false;
		Session session=sessionFactory.getCurrentSession();
		String hql="from org.com.entities.User where username=?0 and password=?1";
		Query query=session.createQuery(hql);
		query.setParameter(0, user.getUsername());
		query.setParameter(1, user.getPassword());
		List<User> i=query.list();
		if (i.size() > 0)
			b = true;
		return b;
}
	@Transactional
	@Override
	public User getName(String username) {
		Session session=sessionFactory.getCurrentSession();
		String hql="select u from org.com.entities.User as u where u.username=?0 ";
		Query query=session.createQuery(hql);
		query.setParameter(0, username);
		List<User> users=query.list();
		User user=users.get(0);
		System.out.println(user.getUsername()+"\t"+user.getDesignation());
		return user;
			
		
	}

	
	



	
	

}
