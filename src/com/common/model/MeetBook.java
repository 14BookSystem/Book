package com.common.model;

import java.util.Date;

public class MeetBook {
	private int id;
	private int roomid;
	private Date starttime;
	private String starttimestr;
	private Date endtime;
	private String endtimestr;
	private String roomname;
	private int userid;
	private String username;
	private int status ;
	private String teacher;
	private String keshi;

	public int getId() {
		return id;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getKeshi() {
		return keshi;
	}

	public void setKeshi(String keshi) {
		this.keshi = keshi;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoomid() {
		return roomid;
	}

	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getRoomname() {
		return roomname;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getStarttimestr() {
		return starttimestr;
	}

	public void setStarttimestr(String starttimestr) {
		this.starttimestr = starttimestr;
	}

	public String getEndtimestr() {
		return endtimestr;
	}

	public void setEndtimestr(String endtimestr) {
		this.endtimestr = endtimestr;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}



}
