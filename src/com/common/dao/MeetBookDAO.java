package com.common.dao;


import java.util.Date;
import java.util.List;

import com.common.model.MeetBook;
import com.common.model.MeetBorrow;
import com.common.model.User;




public interface MeetBookDAO {

	public boolean save(MeetBook meetBook);
	public boolean del(MeetBook meetBook);
	public boolean updatestatus(MeetBook meetBook);
	public List<MeetBook> list(int roomid);
	public List<MeetBook> listall();
	public List<MeetBook> listall(User user);
	public List<MeetBook> listbyuser(int userid);
	public MeetBook load(int id);
	public boolean checkbook(Date startdate,Date enddate,int roomid);
	
	public boolean updatestatus(MeetBorrow meetBorrow);
	public boolean save(MeetBorrow meetborrow);
	public boolean del(MeetBorrow meetborrow);
	public List<MeetBorrow> listborrow(int roomid);
	public List<MeetBorrow> listallborrow();
	public List<MeetBorrow> listborrowbyuser(int userid);
	public MeetBorrow loadborrow(int id);
}
