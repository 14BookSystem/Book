package com.common.dao;


import java.util.List;

import com.common.model.MeetRoom;
import com.common.model.Message;




public interface MessageDAO {

	public boolean save(Message message);
	public boolean del(Message message);
	public List<Message> list(int userid);
}
