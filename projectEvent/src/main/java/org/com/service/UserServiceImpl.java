package org.com.service;

import java.util.List;

import org.com.dao.UserDao;
import org.com.entities.Halls;
import org.com.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class UserServiceImpl implements UserService {
	private UserDao dao;
	@Autowired
	public UserServiceImpl(UserDao dao) {
		super();
		this.dao = dao;
	}
	@Transactional
	@Override
	public void insert(User user) {
		dao.insert(user);

	}
	@Transactional
	@Override
	public boolean validate(User user) {
		boolean b=false;
		if(user!=null)
		{
			b=dao.validate(user);
		}
		return b;
	}
	@Override
	public User getName(String username) {
		return dao.getName(username);
	}
	

}
