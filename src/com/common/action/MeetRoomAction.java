package com.common.action;

import java.util.ArrayList;
import java.util.List;


import com.common.model.MeetRoom;
import com.common.service.MeetRoomService;

public class MeetRoomAction extends BaseAction {
	private MeetRoomService meetroomservice;
	private MeetRoom meetroom;
	private String jsonString;
	private int userid;
	private int id;
	private String keyword;
	private List<MeetRoom> list = new ArrayList<MeetRoom>();

	public String save() {
		boolean flag = meetroomservice.save(meetroom);
		if (flag) {
			jsonString = "1";
		} else {
			jsonString = "0";
		}

		return SUCCESS;
	}
	public String save_() {
		boolean flag = meetroomservice.save(meetroom);
		if (flag) {
			jsonString = "1";
		} else {
			jsonString = "0";
		}
		
		return SUCCESS;
	}
	public String guashi() {
		boolean flag = meetroomservice.guashi(meetroom);
		if (flag) {
			jsonString = "1";
		} else {
			jsonString = "0";
		}
		
		return SUCCESS;
	}
	public String guihuan() {
		boolean flag = meetroomservice.guihuan(meetroom);
		if (flag) {
			jsonString = "1";
		} else {
			jsonString = "0";
		}
		
		return SUCCESS;
	}
	public String guihuan2() {
		boolean flag = meetroomservice.guihuan(meetroom);
		if (flag) {
			jsonString = "1";
		} else {
			jsonString = "0";
		}
		
		return SUCCESS;
	}
	public String guihuan2_() {
		boolean flag = meetroomservice.guihuan(meetroom);
		if (flag) {
			jsonString = "1";
		} else {
			jsonString = "0";
		}
		
		return SUCCESS;
	}

	public String detailjson() {
		jsonString = meetroomservice.detailjson(id);
		
		return SUCCESS;
	}
	public String add() {
		return SUCCESS;
	}
	public String edit() {
		meetroom =meetroomservice.load(meetroom.getId());
		return SUCCESS;
	}
	public String listjson() {
		list = meetroomservice.list(null);
		return SUCCESS;
	}
	public String list() {
		list = meetroomservice.list(null);
		return SUCCESS;
	}

	public String delete() {
		meetroomservice.del(meetroom);
		return SUCCESS;
	}
	public String delete_() {
		boolean flag=meetroomservice.del(meetroom);
		if (flag) {
			jsonString = "1";
		} else {
			jsonString = "0";
		}
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



	public List<MeetRoom> getList() {
		return list;
	}

	public void setList(List<MeetRoom> list) {
		this.list = list;
	}

	public MeetRoomService getMeetroomservice() {
		return meetroomservice;
	}

	public void setMeetroomservice(MeetRoomService meetroomservice) {
		this.meetroomservice = meetroomservice;
	}

	public MeetRoom getMeetroom() {
		return meetroom;
	}

	public void setMeetroom(MeetRoom meetroom) {
		this.meetroom = meetroom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

}
