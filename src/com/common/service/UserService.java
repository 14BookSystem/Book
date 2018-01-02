package com.common.service;

import java.util.List;

import com.common.model.User;



public interface UserService {
	public User login(String username,String password);
	public boolean reg(User user);
	public List<User> list();
	public void del(User user); 
	
}
