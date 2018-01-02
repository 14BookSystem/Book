package com.common.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.common.dao.MeetRoomDAO;
import com.common.dao.UserDAO;
import com.common.model.MeetRoom;
import com.common.model.Message;
import com.common.model.User;
import com.common.service.MeetRoomService;

public class MeetRoomServiceImpl implements MeetRoomService {
	private MeetRoomDAO meetroomdao;

	@Override
	public boolean save(MeetRoom meetRoom) {
		// TODO Auto-generated method stub
	/*	event.setUptime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
				.format(new Date()));*/
		return meetroomdao.save(meetRoom);
	}

	@Override
	public boolean del(MeetRoom meetRoom) {
		// TODO Auto-generated method stub
		return meetroomdao.del(meetRoom);
	}


	@Override
	public String listjson(String name) {
		// TODO Auto-generated method stub
		List<MeetRoom> list = meetroomdao.list(name);

		JSONArray js = JSONArray.fromObject(list);

		return js.toString();
	}

	public MeetRoomDAO getMeetroomdao() {
		return meetroomdao;
	}

	public void setMeetroomdao(MeetRoomDAO meetroomdao) {
		this.meetroomdao = meetroomdao;
	}

	@Override
	public List<MeetRoom> list(String name) {
		// TODO Auto-generated method stub
		return meetroomdao.list(null);
	}

	@Override
	public MeetRoom load(int id) {
		// TODO Auto-generated method stub
		return meetroomdao.load(id);
	}

	@Override
	public String detailjson(int id) {
		// TODO Auto-generated method stub
		
		MeetRoom room = meetroomdao.load(id);
		JSONObject jb = JSONObject.fromObject(room);
		return jb.toString();
	}
	
	@Override
	public boolean yuyue(MeetRoom meetRoom) {
		// TODO Auto-generated method stub
		meetroomdao.upatestatus(1, meetRoom.getId());
		return true;
	}

	@Override
	public boolean guashi(MeetRoom meetRoom) {
		// TODO Auto-generated method stub
		meetroomdao.upatestatus(2, meetRoom.getId());
		return true;
	}

	@Override
	public boolean guihuan(MeetRoom meetRoom) {
		// TODO Auto-generated method stub
		meetroomdao.upatestatus(0, meetRoom.getId());
		return true;
	}


}
