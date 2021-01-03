package com.capgemini.designpatternwithhibernate.service;

public interface EmployeeService {
	
public boolean createEmployee();
	
	public boolean getEmployeeDetailById(int id);
	
	public boolean deleteEmployeeInfo(int id);
	
	public boolean updateEmployeeInfo(int id);
	
//	public boolean getAllEmployeeDetail();
}
