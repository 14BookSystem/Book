package com.common.service;


import java.util.Date;
import java.util.List;

import com.common.model.MeetBook;
import com.common.model.MeetBorrow;
import com.common.model.User;





public interface MeetBookService {
	
	public boolean save(MeetBook meetBook);
	public boolean checkbook(Date startdate,Date enddate,int roomid);
	public boolean del(MeetBook meetBook);
	public List<MeetBook> list(int id);
	public List<MeetBook> listall();
	public String listjson(int id);
	public MeetBook load(int id);
	public String listbyuser(int userid);
	public String listalljson();
	public boolean updatestatus(MeetBook meetBook);

	public boolean updatestatus(MeetBorrow meetBorrow);
	public boolean save(MeetBorrow meetborrow);
	public boolean del(MeetBorrow meetborrow);
	public List<MeetBorrow> listborrow(int id);
	public List<MeetBorrow> listborrowall();
	public String listborrowjson(int id);
	public MeetBorrow loadborrow(int id);
	public List<MeetBorrow> listborrowbyuser(int userid);
	public String listborrowalljson();
	
	public List<MeetBook> listall(User user);

}
