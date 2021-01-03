package com.capgemini.designpattern;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.designpattern.dao.EmployeeDAO;
import com.capgemini.designpattern.dao.EmployeeJDBCImple;
import com.capgemini.designpattern.dto.EmployeeInfoBeans;
import com.capgemini.designpattern.service.EmployeeService;
import com.capgemini.designpattern.service.EmployeeServiceJDBC;

public class App {
public static void main(String[] args) {

	
//	EmployeeDAO dao = new EmployeeJDBCImple();
//  EmployeeDAO dao = new EmployeeHibernateImple();
//  EmployeeDAO dao = new EmployeeSPRINGJDBC();
	
	EmployeeService service = new EmployeeServiceJDBC();
	
	System.out.println("details of record by name");
	EmployeeInfoBeans record = service.getEmployeeDetailByName("vishal");
	System.out.println("id--->" + record.getId());
	System.out.println("name--->" + record.getName());
	System.out.println("phoneNumber--->" + record.getPhoneNumber());
	
	
//	System.out.println("---delete info---");
//	boolean deleted = service.deleteEmployeeInfo(418);
//	System.out.println(deleted);
	
//	System.out.println("---update info---");
	EmployeeInfoBeans bean = new EmployeeInfoBeans();
//    bean.setName("vikas");
//	bean.setId(424);
//	boolean updated = service.updateEmployeeInfo(bean);
//	System.out.println(updated);

	
//	System.out.println("---create a record---");
//	bean.setId(413);
//	bean.setName("shravik");
//	bean.setPhoneNumber(9010614556L);
	boolean created = service.createEmployeeInfo(bean);
//	System.out.println(created);
	
//	
//	System.out.println("--- get all info ---");
//	
//	List<EmployeeInfoBeans> employees = new ArrayList<EmployeeInfoBeans>();
//			employees = service.getAllEmployeeDetail();
//     for(EmployeeInfoBeans bean1 : employees) {
//		System.out.println(bean1.getId()+"  "+ bean1.getName()+"  " + bean1.getPhoneNumber());
//	}

	}
}
