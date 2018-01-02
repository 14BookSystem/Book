package com.common.dao.impl;

import java.util.List;

import com.common.dao.EmployeeDAO;
import com.common.dao.MeetRoomDAO;
import com.common.model.Employee;
import com.common.model.MeetRoom;
import com.common.model.Message;

public class EmployeeDaoImpl extends BaseDAO implements EmployeeDAO {

	@Override
	public boolean save(Employee employee) {
		return saveOrUpdate(employee);
	}

	@Override
	public boolean del(Employee employee) {
		// TODO Auto-generated method stub
		return deleteById(Employee.class, employee.getId());
	}

	@Override
	public List<Employee> list() {
		StringBuffer sb = new StringBuffer();
		sb = new StringBuffer("FROM Employee ");

		List<Employee> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public Employee load(int id) {
		// TODO Auto-generated method stub
		return get(Employee.class, id);
	}


}
