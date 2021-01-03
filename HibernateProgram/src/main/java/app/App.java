package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ApplicationContextConfig;
import dao.AddressDAO;
import dao.EmpDAO;
import model.Address;
import model.Emp;

public class App {
	public static void main(String[] args) {
		
	
	AnnotationConfigApplicationContext ct = new
			AnnotationConfigApplicationContext(ApplicationContextConfig.class);
	EmpDAO edao = ct.getBean(EmpDAO.class);
	Emp e = new Emp();
	e.setId(1);
	e.setName("ram");
	edao.saveEmp(e);
	
	AddressDAO adao = ct.getBean(AddressDAO.class);
	Address a = new Address();
	a.setAddress("jpn");
	a.setCity("bng");
	a.setCountry("india");
	a.setEmp(e);
	Address a1 = new Address();
	a1.setAddress("btm");
	a1.setCity("mys");
	a1.setCountry("india");
	a1.setEmp(e);
	adao.saveAddress(a1);
	adao.saveAddress(a);
}
}
