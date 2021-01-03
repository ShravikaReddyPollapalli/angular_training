package com.capgemini.designpatternwithhibernate.dao;

public interface EmployeeDAO {
	
    public boolean createEmployee();
	
	public boolean getEmployeeDetailById(int id);
	
	public boolean deleteEmployeeInfo(int id);
	
	public boolean updateEmployeeInfo(int id);
	
//	public boolean getAllEmployeeDetail();
}
