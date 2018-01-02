package com.common.dao.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.common.dao.MeetBookDAO;
import com.common.model.MeetBook;
import com.common.model.MeetBorrow;
import com.common.model.User;

public class MeetBookDaoImpl extends BaseDAO implements MeetBookDAO {

	@Override
	public boolean save(MeetBook meetBook) {
		return saveOrUpdate(meetBook);
	}

	@Override
	public boolean del(MeetBook meetBook) {
		// TODO Auto-generated method stub
		return deleteById(MeetBook.class, meetBook.getId());
	}

	@Override
	public List<MeetBook> list(int id) {
		StringBuffer sb = new StringBuffer();
		sb = new StringBuffer("FROM MeetBook where roomid = ").append(id);

		List<MeetBook> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public MeetBook load(int id) {
		StringBuffer sb = new StringBuffer();
		sb = new StringBuffer("FROM MeetBook where id = ").append(id);

		List<MeetBook> lst = findByHQL(sb.toString());
		return lst!=null && lst.size()>0?lst.get(0):null;
	}

	@Override
	public List<MeetBook> listbyuser(int userid) {
		StringBuffer sb = new StringBuffer();
		sb = new StringBuffer("FROM MeetBook where userid = ").append(userid);

		List<MeetBook> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public boolean checkbook(Date startdate, Date enddate,int roomid) {
		String startstr = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(startdate);
		String endstr = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(enddate);
		
		StringBuffer sb = new StringBuffer();
		sb = new StringBuffer("FROM MeetBook where (starttime between '").append(startstr).append("' and '")
		.append(endstr).append("') or (endtime between '").append(startstr).append("' and '")
		.append(endstr).append("') or(starttime > '").append(startstr).append("' and endtime <'").append(endstr).append("') and roomid = ").append(roomid);

		List<MeetBook> lst = findByHQL(sb.toString());
		if(lst.size()>0){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public boolean updatestatus(MeetBook meetBook) {
		StringBuffer sb = new StringBuffer();
		sb = new StringBuffer("update MeetBook set status = 1 where id = ").append(meetBook.getId());
		try {
			this.executeHql(sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
	@Override
	public boolean updatestatus(MeetBorrow meetBorrow) {
		StringBuffer sb = new StringBuffer();
		sb = new StringBuffer("update MeetBorrow set status = 1 where id = ").append(meetBorrow.getId());
		try {
			this.executeHql(sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public List<MeetBook> listall() {
		StringBuffer sb = new StringBuffer();
		sb = new StringBuffer("FROM MeetBook order by id desc");

		List<MeetBook> lst = findByHQL(sb.toString());
		return lst;
	}
	
	@Override
	public List<MeetBook> listall(User user) {
		StringBuffer sb = new StringBuffer();
		sb = new StringBuffer("FROM MeetBook where userid="+user.getId()+" order by id desc");

		List<MeetBook> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public boolean save(MeetBorrow meetborrow) {
		// TODO Auto-generated method stub
		return saveOrUpdate(meetborrow);
	}

	@Override
	public boolean del(MeetBorrow meetborrow) {
		// TODO Auto-generated method stub
		return deleteById(MeetBorrow.class, meetborrow.getId());
	}

	@Override
	public List<MeetBorrow> listborrow(int roomid) {
		StringBuffer sb = new StringBuffer();
		sb = new StringBuffer("FROM MeetBorrow where roomid = ").append(roomid);

		List<MeetBorrow> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public List<MeetBorrow> listallborrow() {
		StringBuffer sb = new StringBuffer();
		sb = new StringBuffer("FROM MeetBorrow order by id desc");

		List<MeetBorrow> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public List<MeetBorrow> listborrowbyuser(int userid) {
		StringBuffer sb = new StringBuffer();
		sb = new StringBuffer("FROM MeetBorrow where userid = ").append(userid);

		List<MeetBorrow> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public MeetBorrow loadborrow(int id) {
		// TODO Auto-generated method stub
		return load(MeetBorrow.class, id);
	}

}
