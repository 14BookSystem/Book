package com.common.model;

public class MeetRoom {
	private int id;
	private String name;
	private String description;
	private String device;
	private String capability;
	private int status;//0正常，1 借出，2挂失
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	public String getCapability() {
		return capability;
	}
	public void setCapability(String capability) {
		this.capability = capability;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}


}
