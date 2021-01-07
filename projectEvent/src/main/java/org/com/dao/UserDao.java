package org.com.dao;

import java.util.List;
import java.util.Optional;


import org.com.entities.User;


public interface UserDao {
	public void insert(User user);
	public boolean validate(User user);
	public User getName(String username);
	

}
