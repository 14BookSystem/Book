package com.common.action;

import java.util.ArrayList;
import java.util.List;


import com.common.model.Employee;
import com.common.model.MeetRoom;
import com.common.service.EmployeeService;
import com.common.service.MeetRoomService;

public class EmployeeAction extends BaseAction {
	private EmployeeService employeeservice;
	private Employee employee;
	private String jsonString;
	private int userid;
	private List<Employee> list = new ArrayList<Employee>();

	public String save() {
		boolean flag = employeeservice.save(employee);
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
	public String edit() {
		employee =employeeservice.load(employee.getId());
		return SUCCESS;
	}

	public String listjson() {
		jsonString = employeeservice.listjson();
		return SUCCESS;
	}
	public String list() {
		list = employeeservice.list();
		return SUCCESS;
	}

	public String delete() {
		employeeservice.del(employee);
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


	public EmployeeService getEmployeeservice() {
		return employeeservice;
	}

	public void setEmployeeservice(EmployeeService employeeservice) {
		this.employeeservice = employeeservice;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Employee getHealth() {
		return employee;
	}

	public void setHealth(Employee employee) {
		this.employee = employee;
	}

	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}


}
