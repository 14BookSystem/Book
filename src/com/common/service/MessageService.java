package com.common.service;


import com.common.model.Message;





public interface MessageService {
	
	public boolean save(Message message);
	public boolean del(Message message);
//	public List<Event> list();
	public String listjson(int userid);
	

}
