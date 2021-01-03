package com.capgemini.designpatternwithhibernate.service;

import com.capgemini.designpatternwithhibernate.dao.EmployeeDAO;
import com.capgemini.designpatternwithhibernate.dao.EmployeeHibernateImpl;

public class EmployeeServiceHibernate implements EmployeeService {

//	EmployeeDAO dao = new EmployeeHibernateImplJpql();
	
	EmployeeDAO dao = new EmployeeHibernateImpl();
	
	public boolean getEmployeeDetailById(int id) {
		
		return dao.getEmployeeDetailById(id);
	}

	public boolean deleteEmployeeInfo(int id) {
		
		return dao.deleteEmployeeInfo(id);
	}

	public boolean updateEmployeeInfo(int id) {
		
		return dao.updateEmployeeInfo(id);
	}

//	public boolean getAllEmployeeDetail() {
//		
//		return dao.getAllEmployeeDetail();
//	}

	public boolean createEmployee() {
		// TODO Auto-generated method stub
		return dao.createEmployee();
	}


}
