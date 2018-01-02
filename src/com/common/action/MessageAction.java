package com.common.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.common.model.Employee;
import com.common.model.MeetRoom;
import com.common.model.Message;
import com.common.service.EmployeeService;
import com.common.service.MeetRoomService;
import com.common.service.MessageService;

public class MessageAction extends BaseAction {
	private MessageService messageservice;
	private Message message;
	private String jsonString;
	private int userid;
	private List<Message> list = new ArrayList<Message>();

	public String save() {
		
		try {
			Date date = new SimpleDateFormat("yyyy-MM-dd#HH:mm").parse(message.getUptimestr());
			message.setUptime(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean flag = messageservice.save(message);
		if (flag) {
			jsonString = "1";
		} else {
			jsonString = "0";
		}

		return SUCCESS;
	}

	public String add() {
		return SUCCESS;
	}

	public String listjson() {
		jsonString = messageservice.listjson(userid);
		return SUCCESS;
	}

	public String delete() {
		messageservice.del(message);
		return SUCCESS;
	}

	public String getJsonString() {
		return jsonString;
	}

	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}



	public List<Message> getList() {
		return list;
	}

	public void setList(List<Message> list) {
		this.list = list;
	}

	public MessageService getMessageservice() {
		return messageservice;
	}

	public void setMessageservice(MessageService messageservice) {
		this.messageservice = messageservice;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}


}
