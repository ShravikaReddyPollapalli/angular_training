package com.capgemini.designpatternwithhibernate;

import com.capgemini.designpatternwithhibernate.service.EmployeeService;
import com.capgemini.designpatternwithhibernate.service.EmployeeServiceHibernate;


public class App {
	private static boolean List;
	public static void main( String[] args ) {
		EmployeeService service = new EmployeeServiceHibernate();

		// 	   service.getEmployeeDetailByName("shravika");
		// 	   service.updateEmployeeInfo( );
		// 	   service .deleteEmployeeInfo(1);
		//     service.getAllEmployeeDetail();   

		service.createEmployee();
		// 	 service.getEmployeeDetailById(101);
		// 	   service.updateEmployeeInfo(101);
		// 	service .deleteEmployeeInfo(101);

	}
}
