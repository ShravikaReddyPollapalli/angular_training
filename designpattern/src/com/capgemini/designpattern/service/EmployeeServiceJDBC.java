package com.capgemini.designpattern.service;

import java.util.List;

import com.capgemini.designpattern.dao.EmployeeDAO;
import com.capgemini.designpattern.dao.EmployeeJDBCImple;
import com.capgemini.designpattern.dto.EmployeeInfoBeans;

public class EmployeeServiceJDBC  implements EmployeeService {
EmployeeDAO dao = new EmployeeJDBCImple();
	@Override
	public EmployeeInfoBeans getEmployeeDetailByName(String name) {
		// TODO Auto-generated method stub
		return dao.getEmployeeDetailByName(name);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmployeeInfo(id);
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBeans bean) {
		// TODO Auto-generated method stub
		return dao.updateEmployeeInfo(bean);
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBeans bean) {
		// TODO Auto-generated method stub
		return dao.createEmployeeInfo(bean);
	}

	@Override
	public List<EmployeeInfoBeans> getAllEmployeeDetail() {
		// TODO Auto-generated method stub
		return dao.getAllEmployeeDetail();
	}

}
