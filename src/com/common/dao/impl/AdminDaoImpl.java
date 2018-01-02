package com.common.dao.impl;

import java.util.List;

import com.common.dao.AdminDAO;
import com.common.model.Admin;

public class AdminDaoImpl extends BaseDAO implements AdminDAO {

	@Override
	public Admin load(String username, String password) {
		StringBuffer sb = new StringBuffer("FROM Admin WHERE username = '")
		.append(username).append("' and password = '").append(password).append("'");
		
		List<Admin> lst = findByHQL(sb.toString());
		if(lst.size()>0){
			return lst.get(0);
		}else{
			return null;
		}
	}

}
