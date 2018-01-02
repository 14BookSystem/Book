package com.common.dao;


import java.util.Date;
import java.util.List;

import com.common.model.Employee;
import com.common.model.MeetRoom;
import com.common.model.Message;




public interface MeetRoomDAO {

	public boolean save(MeetRoom room);
	public boolean del(MeetRoom room);
	public List<MeetRoom> list(String name);
	public MeetRoom load(int id);
	public void upatestatus(int status,int roomid);
	
	
}
