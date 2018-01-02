package com.common.dao;



import com.common.model.Admin;



public interface AdminDAO {

	public Admin load(String username,String password);
}
