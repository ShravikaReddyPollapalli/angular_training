package com.capgemini.designpatternwithhibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.designpatternwithhibernate.dto.EmployeeInfoBean;

public class EmployeeHibernateImpl implements EmployeeDAO {

	public boolean createEmployee() {
		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean .setId(413);
		bean .setName("shravika");
		bean .setMailid("@gmail.com");
		bean.setPassword("qwerty");
		
		
		EntityManagerFactory entityManagerFactory= null;
		EntityManager entityManager= null;
		EntityTransaction entityTransaction= null;
		try {
		 entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(bean);
		System.out.println("record saved");
		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();
		}
	   catch(Exception e) {
		entityTransaction.rollback();
	}
		return true;
	}
	
	public boolean getEmployeeDetailById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EmployeeInfoBean records =entityManager.find(EmployeeInfoBean.class, id);//return movie type object
		System.out.println("emp id : "+records.getId());
		System.out.println("emp name : "+ records.getName());
		System.out.println("emp mailid : "+records.getMailid());
		System.out.println("emp password : "+ records.getPassword());
		
	
		entityManager.close();
		entityManagerFactory.close();
		return true;
	}

	public boolean deleteEmployeeInfo(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
	  
		EmployeeInfoBean records =entityManager.find(EmployeeInfoBean.class, id);//return movie type object
		entityManager.remove(records);
		System.out.println("deleted succefully");
		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();
		return true;
	}

	public boolean updateEmployeeInfo(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
	    EmployeeInfoBean records =entityManager.find(EmployeeInfoBean.class, 101);//return movie type object
		records.setPassword("asdfg");
		System.out.println("emp id : "+records.getId());
		System.out.println("emp name : "+ records.getName());
		System.out.println("emp mailid : "+records.getMailid());
		System.out.println("emp password : "+ records.getPassword());
		
		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();
		return true;
	}

	

	
}
