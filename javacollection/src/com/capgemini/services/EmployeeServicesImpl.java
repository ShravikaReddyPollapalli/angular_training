 package com.capgemini.services;

import com.capgemini.bean.EmployeeBean;
import com.capgemini.dao.EmployeeDAO;
import com.capgemini.dao.EmployeeDAOImpl;

public class EmployeeServicesImpl implements EmployeeServices {

	private EmployeeDAO dao = new EmployeeDAOImpl();
	@Override
	public boolean registerEmp(EmployeeBean bean) {
		return dao.registerEmp(bean);
		
	}

}
