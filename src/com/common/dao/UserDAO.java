package com.common.dao;



import java.util.List;

import com.common.model.Admin;
import com.common.model.User;




public interface UserDAO {

	public User login(String username,String password);
	public User load(int id);
	public boolean reg(User user);
	public boolean del(User user);
	public List<User> list();
}
