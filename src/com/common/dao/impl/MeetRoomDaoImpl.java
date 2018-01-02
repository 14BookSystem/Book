package com.common.dao.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.common.dao.MeetRoomDAO;
import com.common.model.Employee;
import com.common.model.MeetRoom;
import com.common.model.Message;

public class MeetRoomDaoImpl extends BaseDAO implements MeetRoomDAO {

	@Override
	public boolean save(MeetRoom meetRoom) {
		return saveOrUpdate(meetRoom);
	}

	@Override
	public boolean del(MeetRoom meetRoom) {
		// TODO Auto-generated method stub
		return deleteById(MeetRoom.class, meetRoom.getId());
	}

	@Override
	public List<MeetRoom> list(String name) {
		StringBuffer sb = new StringBuffer();
		if(name ==null || name.equals("")){
			sb = new StringBuffer("FROM MeetRoom ");
		}else{
			sb = new StringBuffer("FROM MeetRoom where name like '%").append(name).append("%'");
		}
		
		List<MeetRoom> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public MeetRoom load(int id) {
		// TODO Auto-generated method stub
		return get(MeetRoom.class, id);
	}

	@Override
	public void upatestatus(int status,int roomid) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
			sb = new StringBuffer("update MeetRoom set status = ").append(status).append(" where id =").append(roomid);
			try {
				this.executeHql(sb.toString());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}



}
