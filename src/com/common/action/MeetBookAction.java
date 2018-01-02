package com.common.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.common.model.Employee;
import com.common.model.MeetBook;
import com.common.model.MeetBorrow;
import com.common.model.User;
import com.common.service.MeetBookService;

public class MeetBookAction extends BaseAction {
	private MeetBookService meetbookservice;
	private MeetBook meetbook;
	private MeetBorrow meetborrow;
	private String jsonString;
	private int userid;
	private int roomid;
	private List<Employee> list = new ArrayList<Employee>();
	private List<MeetBook> list2 = new ArrayList<MeetBook>();
	private List<MeetBorrow> list3 = new ArrayList<MeetBorrow>();

	public String save() {
		boolean flag2 = false;
		try {
			Date date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(meetbook.getStarttimestr());
			Date date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(meetbook.getEndtimestr());
			meetbook.setStarttime(date1);
			meetbook.setEndtime(date2);
			
			meetbook.setStatus(0);
			flag2 = meetbookservice.checkbook(date1, date2,meetbook.getRoomid());
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		if(flag2){
			boolean flag = meetbookservice.save(meetbook);
			if (flag) {
				jsonString = "1";
			} else {
				jsonString = "0";
			}
		}else{
			jsonString = "2";
		}
		
	

		return SUCCESS;
	}
	
	
	public String meetbook_add() {
		User user=(User)this.getRequest().getSession().getAttribute("user");
		meetbook.setUserid(user.getId());
		boolean flag = meetbookservice.save(meetbook);
		if (flag) {
			jsonString = "1";
		} else {
			jsonString = "0";
		}
		return SUCCESS;
	}
	
	public String saveborrow() {
		try {
			Date date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(meetborrow.getStarttimestr());
			Date date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(meetborrow.getEndtimestr());
			meetborrow.setStarttime(date1);
			meetborrow.setEndtime(date2);
			
			meetborrow.setStatus(0);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			boolean flag = meetbookservice.save(meetborrow);
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
	
	public String meetbook_jsonlist(){
		User user=(User)this.getRequest().getSession().getAttribute("user");
		list2 = meetbookservice.listall(user);
		return SUCCESS;
	}
	public String meetbook_borrow(){
		User user=(User)this.getRequest().getSession().getAttribute("user");
		list2 = meetbookservice.listall(user);
		return SUCCESS;
	}
	public String meetborrow_list(){
		User user=(User)this.getRequest().getSession().getAttribute("user");
		list3 = meetbookservice.listborrowbyuser(user.getId());
		return SUCCESS;
	}
	public String meetborrow_confirm(){
		meetbook=meetbookservice.load(meetbook.getId());
		MeetBorrow meetBorrow=new MeetBorrow();
		meetBorrow.setEndtime(meetbook.getEndtime());
		meetBorrow.setStarttime(meetbook.getStarttime());
		meetBorrow.setRoomid(meetbook.getRoomid());
		meetBorrow.setUserid(meetbook.getUserid());
		meetBorrow.setStatus(0);
		meetbookservice.save(meetBorrow);
		
		meetbook.setStatus(1);
		meetbookservice.updatestatus(meetbook);
		
		User user=(User)this.getRequest().getSession().getAttribute("user");
		list2 = meetbookservice.listall(user);
		return SUCCESS;
	}
	public String meetborrow_listborrow(){
		User user=(User)this.getRequest().getSession().getAttribute("user");
		list3 = meetbookservice.listborrowbyuser(user.getId());
		return SUCCESS;
	}
	public String meetborrow_back(){
		meetbookservice.updatestatus(meetborrow);
		
		User user=(User)this.getRequest().getSession().getAttribute("user");
		list3 = meetbookservice.listborrowbyuser(user.getId());
		return SUCCESS;
	}
	public String list(){
		list2 = meetbookservice.listall();
		return SUCCESS;
	}
	public String listborrow(){
		list3 = meetbookservice.listborrowall();
		return SUCCESS;
	}
	public String confirm(){
		meetbookservice.updatestatus(meetbook);
		return SUCCESS;
	}
	public String confirm_(){
		boolean flag =meetbookservice.updatestatus(meetbook);
		if(flag){
			jsonString="1";
		}else{
			jsonString="0";
		}
		return SUCCESS;
	}

	public String listjson() {
		jsonString = meetbookservice.listjson(roomid);
		return SUCCESS;
	}
	public String listborrowjson() {
		jsonString = meetbookservice.listborrowjson(roomid);
		return SUCCESS;
	}
	public String listbyuserjson() {
		jsonString = meetbookservice.listbyuser(userid);
		return SUCCESS;
	}
	public String listalljson() {
		jsonString = meetbookservice.listalljson();
		return SUCCESS;
	}
	public String listborrowalljson() {
		jsonString = meetbookservice.listborrowalljson();
		return SUCCESS;
	}

	public String delete() {
		boolean flag = meetbookservice.del(meetbook);
		if (flag) {
			jsonString = "1";
		} else {
			jsonString = "0";
		}
		return SUCCESS;
	}
	public String deleteborrow() {
		boolean flag = meetbookservice.del(meetborrow);
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


	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}

	public MeetBookService getMeetbookservice() {
		return meetbookservice;
	}

	public void setMeetbookservice(MeetBookService meetbookservice) {
		this.meetbookservice = meetbookservice;
	}

	public MeetBook getMeetbook() {
		return meetbook;
	}

	public void setMeetbook(MeetBook meetbook) {
		this.meetbook = meetbook;
	}

	public int getRoomid() {
		return roomid;
	}

	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}

	public List<MeetBook> getList2() {
		return list2;
	}

	public void setList2(List<MeetBook> list2) {
		this.list2 = list2;
	}
	public MeetBorrow getMeetborrow() {
		return meetborrow;
	}
	public void setMeetborrow(MeetBorrow meetborrow) {
		this.meetborrow = meetborrow;
	}
	public List<MeetBorrow> getList3() {
		return list3;
	}
	public void setList3(List<MeetBorrow> list3) {
		this.list3 = list3;
	}




}
