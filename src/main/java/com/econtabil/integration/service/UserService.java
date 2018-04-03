package com.econtabil.integration.service;

import javax.servlet.http.HttpServletRequest;

import com.econtabil.integration.domain.User;



public interface UserService {
	public User findUserByEmail(String email);
	public User findUserById(Integer id);
	public void saveUser(User user);
	boolean isValidPass(User user, String rawPass);
	User loginUser(User user, HttpServletRequest request);
}
