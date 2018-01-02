package com.common.dao;


import java.util.List;

import com.common.model.Employee;
import com.common.model.MeetRoom;
import com.common.model.Message;




public interface EmployeeDAO {

	public boolean save(Employee employee);
	public boolean del(Employee employee);
	public Employee load(int id);
	public List<Employee> list();
}
