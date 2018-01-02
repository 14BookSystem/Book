package com.common.service;

import java.util.List;

import com.common.model.Employee;
import com.common.model.MeetRoom;
import com.common.model.Message;





public interface MeetRoomService {
	
	public boolean save(MeetRoom meetRoom);
	public boolean yuyue(MeetRoom meetRoom);
	public boolean guashi(MeetRoom meetRoom);
	public boolean guihuan(MeetRoom meetRoom);
	public boolean del(MeetRoom meetRoom);
	public List<MeetRoom> list(String name);
	public String listjson(String name);
	public String detailjson(int id);
	public MeetRoom load(int id);

}
