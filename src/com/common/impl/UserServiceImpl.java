package com.common.impl;

import java.util.List;

import com.common.dao.UserDAO;
import com.common.model.User;
import com.common.service.UserService;



public class UserServiceImpl implements UserService {
	private UserDAO userdao;
	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		User user = userdao.login(username, password);
		if(user == null){
			return null;
		}else{
			return user;
		}
	}
	@Override
	public boolean reg(User user) {
		// TODO Auto-generated method stub
		return userdao.reg(user);
	}
	public UserDAO getUserdao() {
		return userdao;
	}
	public void setUserdao(UserDAO userdao) {
		this.userdao = userdao;
	}
	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return userdao.list();
	}
	@Override
	public void del(User user) {
		userdao.del(user);
		
	}
	
	
	
	
	
}
