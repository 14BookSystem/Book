package com.common.action;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;

import com.common.model.User;
import com.common.service.UserService;


public class UserAction extends BaseAction {
	private UserService userservice;
	private User user;
	private String jsonString;
	private boolean flag;
	private String message;
	private List<User> lst = new ArrayList<User>();

	public String login() {

		user = userservice.login(user.getUsername(), user.getPassword());

		if(user!=null){
			this.getRequest().getSession().setAttribute("user", user);
			message="登录成功！";
			return SUCCESS;
		}else{
			message="用户名或密码错误！";
			return "login";
		}

	}

	public String reg() {
		user.setRole("普通用户");
		flag = userservice.reg(user);

		if(flag){
			message="注册成功！";
		}else{
			message="注册失败！";
		}
		return SUCCESS;
	}
	public String list() {
		
		lst =userservice.list();
		
		return SUCCESS;
		
	}
	public String delete() {
		
		userservice.del(user);
		return SUCCESS;
		
		
	}

	public UserService getUserservice() {
		return userservice;
	}

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getJsonString() {
		return jsonString;
	}

	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<User> getLst() {
		return lst;
	}

	public void setLst(List<User> lst) {
		this.lst = lst;
	}
	

}
