package org.com.service;

import java.util.Optional;

import org.com.domain.User;

public interface UserService {
	public boolean insert(User user);
	public boolean validate(User user);
	Optional<User> getUserByUserName(String userName);
}
