package com.common.impl;

import java.util.List;

import net.sf.json.JSONArray;

import com.common.dao.EmployeeDAO;
import com.common.model.Employee;
import com.common.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO employeedao;

	@Override
	public boolean save(Employee employee) {
		// TODO Auto-generated method stub
		return employeedao.save(employee);
	}

	@Override
	public boolean del(Employee employee) {
		// TODO Auto-generated method stub
		return employeedao.del(employee);
	}


	@Override
	public String listjson() {
		// TODO Auto-generated method stub
		List<Employee> list = employeedao.list();

		JSONArray js = JSONArray.fromObject(list);

		return js.toString();
	}


	public EmployeeDAO getEmployeedao() {
		return employeedao;
	}

	public void setEmployeedao(EmployeeDAO employeedao) {
		this.employeedao = employeedao;
	}

	@Override
	public List<Employee> list() {
		// TODO Auto-generated method stub
		return employeedao.list();
	}

	@Override
	public Employee load(int id) {
		// TODO Auto-generated method stub
		return employeedao.load(id);
	}



}
