package com.common.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONArray;

import com.common.dao.MeetRoomDAO;
import com.common.dao.MessageDAO;
import com.common.dao.UserDAO;
import com.common.model.MeetRoom;
import com.common.model.Message;
import com.common.model.User;
import com.common.service.MeetRoomService;
import com.common.service.MessageService;

public class MessageServiceImpl implements MessageService {
	private MessageDAO messagedao;

	@Override
	public boolean save(Message message) {
		// TODO Auto-generated method stub
		return messagedao.save(message);
	}

	@Override
	public boolean del(Message message) {
		// TODO Auto-generated method stub
		return messagedao.del(message);
	}

	@Override
	public String listjson(int userid) {
		// TODO Auto-generated method stub
		List<Message> list = messagedao.list(userid);
		
		List<Message> list2 = new ArrayList<Message>();
		
		for(Message m:list){
			m.setUptimestr(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(m.getUptime()));
			list2.add(m);
		}

		JSONArray js = JSONArray.fromObject(list2);

		return js.toString();
	}

	public MessageDAO getMessagedao() {
		return messagedao;
	}

	public void setMessagedao(MessageDAO messagedao) {
		this.messagedao = messagedao;
	}


}
