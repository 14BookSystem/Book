package com.common.service;


import java.util.List;

import com.common.model.Employee;
import com.common.model.MeetRoom;





public interface EmployeeService {
	
	public boolean save(Employee employee);
	public boolean del(Employee employee);
	public List<Employee> list();
	public String listjson();
	public Employee load(int id);
	

}
