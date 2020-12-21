package org.com.dao;

import java.util.Optional;

import org.com.domain.User;

public interface UserDao {
	public boolean insert(User user);
	public boolean validate(User user);
	public Optional<User> getUserByUserName(String userName);
}
