package org.hcl.service;

import java.util.Optional;

import org.hcl.domain.User;
public interface UserService {
	public boolean insert(User user);
	public boolean validate(User user);
	Optional<User> getUserByUserName(String userName);

}
