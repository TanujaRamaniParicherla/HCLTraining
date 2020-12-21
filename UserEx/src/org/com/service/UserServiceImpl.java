package org.com.service;

import java.util.Optional;

import org.com.dao.UserDao;
import org.com.dao.UserDaoImpl;
import org.com.domain.User;

public class UserServiceImpl implements UserService {
	UserDao ud=new UserDaoImpl();
	@Override
	public boolean insert(User user) {
		boolean b=false;
		if(user!=null)
		{
			b=ud.insert(user);
		}
		return b;
	}
	@Override
	public boolean validate(User user) {
		boolean b=false;
		if(user!=null)
		{
			b=ud.validate(user);
		}
		return b;
		
	}
	@Override
	public Optional<User> getUserByUserName(String userName) {
		return ud.getUserByUserName(userName);
	}

}
