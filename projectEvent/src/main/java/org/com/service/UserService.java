package org.com.service;

import java.util.List;

import org.com.entities.User;


public interface UserService {
	public void insert(User user);
	public boolean validate(User user);
	public User getName(String username);

}
