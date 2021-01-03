package com.capgemini.designpattern.service;

import java.util.List;

import com.capgemini.designpattern.dto.EmployeeInfoBeans;

public interface EmployeeService {
	
	public EmployeeInfoBeans getEmployeeDetailByName(String name);

	public boolean deleteEmployeeInfo(int id);

	public boolean updateEmployeeInfo(EmployeeInfoBeans bean);

	public boolean createEmployeeInfo(EmployeeInfoBeans bean);

	public List<EmployeeInfoBeans> getAllEmployeeDetail();
}
