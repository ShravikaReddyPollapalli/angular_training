package com.capgemini.designpattern.dao;

import java.util.List;

import com.capgemini.designpattern.dto.EmployeeInfoBeans;

public class EmployeeSPRINGJDBC implements EmployeeDAO {

	@Override
	public EmployeeInfoBeans getEmployeeDetailByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBeans bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBeans bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<EmployeeInfoBeans> getAllEmployeeDetail() {
		// TODO Auto-generated method stub
		return null;
	}

}
