package com.kgisl.springsecurity.service;

import com.kgisl.springsecurity.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}