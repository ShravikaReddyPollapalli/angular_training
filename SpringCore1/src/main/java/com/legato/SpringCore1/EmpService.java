package com.legato.SpringCore1;

public class EmpService {
	private EmpDAO empDao; //dependency
	public EmpService() {
		System.out.println("service constructor");
	}
	public EmpService(EmpDAO empDAO) {
		System.out.println("parameterized cosntructor");
		this.empDao = empDAO;
	}
	public EmpDAO getEmpDao() {
		return empDao;
	}
	public void setEmpDao(EmpDAO empDao) {
		this.empDao = empDao;
	}
	public void getUser(String username) {
		empDao.connectDB();
		System.out.println(username);
	}
}
