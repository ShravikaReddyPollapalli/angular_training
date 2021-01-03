package com.capgemini.controller;

import java.util.Scanner;

import com.capgemini.bean.EmployeeBean;
import com.capgemini.services.EmployeeServices;
import com.capgemini.services.EmployeeServicesImpl;

public class EmployeeController {
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   
	   EmployeeServices employeeServices = new EmployeeServicesImpl();
	   EmployeeBean employeeBean = new EmployeeBean();
	System.out.println("enter the employee ID...");
	employeeBean.setEmpId(Integer.parseInt(scanner.nextLine()));
	 
	System.out.println("Enter the Employee Name....");
	employeeBean.setEmpName(scanner.nextLine());
	
	System.out.println("Enter the Employee Email....");
	employeeBean.setEmpEmail(scanner.nextLine());
	
	System.out.println("Enter the Employee Password....");
	employeeBean.setPassword(scanner.nextLine());
	
	employeeServices.registerEmp(employeeBean);
	
	scanner.close();
}
}
