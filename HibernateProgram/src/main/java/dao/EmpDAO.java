package dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Emp;

@Repository
public class EmpDAO {
private SessionFactory factory;
@Autowired
public EmpDAO(SessionFactory factory) {
	this.factory = factory;
}
@Transactional
 public void saveEmp(Emp e) {
	 Session s = factory.getCurrentSession();
	 s.saveOrUpdate(e);
 }
}
