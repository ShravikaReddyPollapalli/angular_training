package com.capgemini.bean;

import java.io.Serializable;
import java.util.Date;


//@SuppressWarnings("serial")
//@Data
public class EmployeeBean implements Serializable {
  private int empId ;
  private String empName;
  private String empEmail;
  private String password;
  private Date birthday;
  
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpEmail() {
	return empEmail;
}
public void setEmpEmail(String empEmail) {
	this.empEmail = empEmail;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
  
}
