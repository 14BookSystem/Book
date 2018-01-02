package com.common.model;

import java.util.Date;

public class Message {
	private int id;
	private String name;
	private Date uptime;
	private int userid;
	private String uptimestr;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getUptime() {
		return uptime;
	}

	public void setUptime(Date uptime) {
		this.uptime = uptime;
	}

	public String getUptimestr() {
		return uptimestr;
	}

	public void setUptimestr(String uptimestr) {
		this.uptimestr = uptimestr;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}


}
