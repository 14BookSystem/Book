package com.common.impl;

import com.common.dao.AdminDAO;
import com.common.model.Admin;
import com.common.service.AdminService;



public class AdminServiceImpl implements AdminService {
	private AdminDAO admindao;
	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		Admin admin = admindao.load(username, password);
		if(admin == null){
			return false;
		}else{
			return true;
		}
	}
	public AdminDAO getAdmindao() {
		return admindao;
	}
	public void setAdmindao(AdminDAO admindao) {
		this.admindao = admindao;
	}
	
	
}
