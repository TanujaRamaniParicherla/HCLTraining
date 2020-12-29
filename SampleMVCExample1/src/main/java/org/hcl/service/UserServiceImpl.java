package org.hcl.service;

import java.util.Optional;

import org.hcl.dao.UserDao;
import org.hcl.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
	UserDao dao;
	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public UserServiceImpl(UserDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public boolean insert(User user) {
		boolean b=false;
		if(user!=null)
		{
			b=dao.insert(user);
		}
		return b;
	}

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
	public Optional<User> getUserByUserName(String userName) {
		return dao.getUserByUserName(userName);
	}

}
