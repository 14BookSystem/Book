package com.common.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONArray;

import com.common.dao.MeetBookDAO;
import com.common.dao.MeetRoomDAO;
import com.common.dao.UserDAO;
import com.common.model.MeetBook;
import com.common.model.MeetBorrow;
import com.common.model.MeetRoom;
import com.common.model.User;
import com.common.service.MeetBookService;

public class MeetBookServiceImpl implements MeetBookService {
	private MeetBookDAO meetbookdao;
	private UserDAO userdao;
	private MeetRoomDAO meetroomdao;

	@Override
	public boolean save(MeetBook meetBook) {
		// TODO Auto-generated method stub
		return meetbookdao.save(meetBook);
	}

	@Override
	public boolean del(MeetBook meetBook) {
		// TODO Auto-generated method stub
		return meetbookdao.del(meetBook);
	}


	@Override
	public String listjson(int id) {
		// TODO Auto-generated method stub
		List<MeetBook> list = meetbookdao.list(id);
		List<MeetBook> list2 = new ArrayList<MeetBook>();
		
		for(MeetBook book : list){
			book.setStarttimestr(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(book.getStarttime()));
			book.setEndtimestr(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(book.getEndtime()));
			User user = userdao.load(book.getUserid());
			book.setUsername(user.getUsername());
			list2.add(book);
		}
		

		JSONArray js = JSONArray.fromObject(list2);

		return js.toString();
	}

	public MeetBookDAO getMeetbookdao() {
		return meetbookdao;
	}

	public void setMeetbookdao(MeetBookDAO meetbookdao) {
		this.meetbookdao = meetbookdao;
	}

	@Override
	public List<MeetBook> list(int id) {
		// TODO Auto-generated method stub
		return meetbookdao.list( id);
	}

	@Override
	public MeetBook load(int id) {
		// TODO Auto-generated method stub
		return meetbookdao.load(id);
	}

	public UserDAO getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDAO userdao) {
		this.userdao = userdao;
	}

	@Override
	public String listbyuser(int userid) {
		// TODO Auto-generated method stub
		List<MeetBook> list = meetbookdao.listbyuser(userid);
		List<MeetBook> list2 = new ArrayList<MeetBook>();
		
		for(MeetBook book : list){
			book.setStarttimestr(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(book.getStarttime()));
			book.setEndtimestr(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(book.getEndtime()));
			MeetRoom room = meetroomdao.load(book.getRoomid());
			book.setRoomname(room.getName());
			book.setTeacher(room.getDescription());
			book.setKeshi(room.getDevice());
			list2.add(book);
		}
		

		JSONArray js = JSONArray.fromObject(list2);

		return js.toString();
	}

	public MeetRoomDAO getMeetroomdao() {
		return meetroomdao;
	}

	public void setMeetroomdao(MeetRoomDAO meetroomdao) {
		this.meetroomdao = meetroomdao;
	}

	@Override
	public boolean checkbook(Date startdate, Date enddate ,int roomid) {
		// TODO Auto-generated method stub
		return meetbookdao.checkbook(startdate, enddate,roomid);
	}

	@Override
	public boolean updatestatus(MeetBook meetBook) {
		// TODO Auto-generated method stub
		return meetbookdao.updatestatus(meetBook);
	}
	
	@Override
	public boolean updatestatus(MeetBorrow meetBorrow) {
		// TODO Auto-generated method stub
		return meetbookdao.updatestatus(meetBorrow);
	}

	@Override
	public List<MeetBook> listall() {
		List<MeetBook> list = meetbookdao.listall();
		List<MeetBook> list2 = new ArrayList<MeetBook>();
		
		for(MeetBook book : list){
			book.setStarttimestr(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(book.getStarttime()));
			book.setEndtimestr(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(book.getEndtime()));
			MeetRoom room = meetroomdao.load(book.getRoomid());
			User user = userdao.load(book.getUserid());
			if(user!=null) {
				book.setUsername(user.getUsername());
			}
			if(room!=null) {
				book.setRoomname(room.getName());
				book.setTeacher(room.getDescription());
				book.setKeshi(room.getDevice());
			}
			list2.add(book);
		}
		return list2;
	}
	
	public List<MeetBook> listall(User user){
		List<MeetBook> list = meetbookdao.listall(user);
		for(MeetBook book : list){
			book.setStarttimestr(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(book.getStarttime()));
			book.setEndtimestr(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(book.getEndtime()));
			MeetRoom room = meetroomdao.load(book.getRoomid());
			book.setUsername(user.getUsername());
			if(room!=null) {
				book.setRoomname(room.getName());
				book.setTeacher(room.getDescription());
				book.setKeshi(room.getDevice());
			}
		}
		return list;
	}

	@Override
	public boolean save(MeetBorrow meetborrow) {
		// TODO Auto-generated method stub
		meetroomdao.upatestatus(1, meetborrow.getRoomid());
		return meetbookdao.save(meetborrow);
	}

	@Override
	public boolean del(MeetBorrow meetborrow) {
		// TODO Auto-generated method stub
		return meetbookdao.del(meetborrow);
	}

	@Override
	public List<MeetBorrow> listborrow(int id) {
		// TODO Auto-generated method stub
		return meetbookdao.listborrow(id);
	}

	@Override
	public List<MeetBorrow> listborrowall() {
		List<MeetBorrow> list = meetbookdao.listallborrow();
		List<MeetBorrow> list2 = new ArrayList<MeetBorrow>();
		
		for(MeetBorrow book : list){
			book.setStarttimestr(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(book.getStarttime()));
			book.setEndtimestr(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(book.getEndtime()));
			MeetRoom room = meetroomdao.load(book.getRoomid());
			User user = userdao.load(book.getUserid());
			book.setUsername(user.getUsername());
			if(room!=null) {
				book.setRoomname(room.getName());
				book.setTeacher(room.getDescription());
				book.setKeshi(room.getDevice());
			}
			list2.add(book);
		}
		


		return list2;
	}

	@Override
	public String listborrowjson(int id) {
		List<MeetBorrow> list = meetbookdao.listborrow(id);
		List<MeetBorrow> list2 = new ArrayList<MeetBorrow>();
		
		for(MeetBorrow book : list){
			book.setStarttimestr(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(book.getStarttime()));
			book.setEndtimestr(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(book.getEndtime()));
			User user = userdao.load(book.getUserid());
			book.setUsername(user.getUsername());
			list2.add(book);
		}
		

		JSONArray js = JSONArray.fromObject(list2);

		return js.toString();
	}

	@Override
	public MeetBorrow loadborrow(int id) {
		// TODO Auto-generated method stub
		return meetbookdao.loadborrow(id);
	}

	@Override
	public List<MeetBorrow> listborrowbyuser(int userid) {
		// TODO Auto-generated method stub
		List<MeetBorrow> list = meetbookdao.listborrowbyuser(userid);
		
		for(MeetBorrow book : list){
			book.setStarttimestr(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(book.getStarttime()));
			book.setEndtimestr(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(book.getEndtime()));
			MeetRoom room = meetroomdao.load(book.getRoomid());
			book.setRoomname(room.getName());
			book.setTeacher(room.getDescription());
			book.setKeshi(room.getDevice());
		}
		return list;
	}

	@Override
	public String listalljson() {
		List<MeetBook> list = meetbookdao.listall();
		List<MeetBook> list2 = new ArrayList<MeetBook>();
		
		for(MeetBook book : list){
			book.setStarttimestr(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(book.getStarttime()));
			book.setEndtimestr(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(book.getEndtime()));
			MeetRoom room = meetroomdao.load(book.getRoomid());
			book.setRoomname(room.getName());
			book.setTeacher(room.getDescription());
			book.setKeshi(room.getDevice());
			list2.add(book);
		}
		

		JSONArray js = JSONArray.fromObject(list2);

		return js.toString();
	}

	@Override
	public String listborrowalljson() {
		List<MeetBorrow> list = meetbookdao.listallborrow();
		List<MeetBorrow> list2 = new ArrayList<MeetBorrow>();
		
		for(MeetBorrow book : list){
			book.setStarttimestr(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(book.getStarttime()));
			book.setEndtimestr(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(book.getEndtime()));
			MeetRoom room = meetroomdao.load(book.getRoomid());
			book.setRoomname(room.getName());
			book.setTeacher(room.getDescription());
			book.setKeshi(room.getDevice());
			User user = userdao.load(book.getUserid());
			book.setUsername(user.getUsername());
			list2.add(book);
		}
		

		JSONArray js = JSONArray.fromObject(list2);

		return js.toString();
	}


}
