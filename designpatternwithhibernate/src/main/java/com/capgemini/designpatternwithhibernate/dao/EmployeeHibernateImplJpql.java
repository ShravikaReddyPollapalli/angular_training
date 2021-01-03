/*package com.capgemini.designpatternwithhibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.designpatternwithhibernate.dto.EmployeeInfoBean;

public class EmployeeHibernateImplJpql implements EmployeeDAO{

	public boolean getEmployeeDetailByName(String name) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
	       EntityManager manager=entityManagerFactory.createEntityManager();
	       
	      String jpql="select e from EmployeeInfoBean e where e.name=:ename ";
	      Query query=manager.createQuery(jpql);
	      query.setParameter("ename", name);
	   
	      List<EmployeeInfoBean> records= query.getResultList();
	      
	      for(EmployeeInfoBean record:records) {
	    	  
	      System.out.println(record.getId());
	      System.out.println(record.getName());
	      System.out.println(record.getMailid());
	      System.out.println(record.getPassword());
	     
	      
	      }
		return true;
				           
	}

	public boolean deleteEmployeeInfo(int id) {
		EntityManagerFactory entityManagerFactory=null;  
		EntityManager manager=null;
		EntityTransaction transaction=null;
		
		try {
			entityManagerFactory= Persistence.createEntityManagerFactory("TestPersistence");
			 manager = entityManagerFactory.createEntityManager();
			 transaction	 = manager.getTransaction();
			transaction.begin();
			
			String jpql="delete EmployeeInfoBean e  where e.id=:eid";
			Query query=manager.createQuery(jpql);
			query.setParameter("eid", id);
			int i=query.executeUpdate();
		
			System.out.println("Deleted data succefulley"+i);
			transaction.commit();
			
		
		}
		catch(Exception e){
			e.printStackTrace();
			transaction.rollback();
		}
		manager.close();
		entityManagerFactory.close();

		return true;
  }
			

	public boolean updateEmployeeInfo() {

		EntityManagerFactory entityManagerFactory=null;  
		EntityManager manager=null;
		EntityTransaction transaction=null;
		
		try {
			entityManagerFactory= Persistence.createEntityManagerFactory("TestPersistence");
			 manager = entityManagerFactory.createEntityManager();
			 transaction	 = manager.getTransaction();
			transaction.begin();
			
			String jpql="update EmployeeInfoBean e set e.name='Spurthi' where e.id=:eid";
			Query query=manager.createQuery(jpql);
			query.setParameter("eid", 1);
			int i=query.executeUpdate();
		
			System.out.println("updated data succefully"+i);
			transaction.commit();
			
		
		}
		catch(Exception e){
			e.printStackTrace();
			transaction.rollback();
		}
		manager.close();
		entityManagerFactory.close();
		return false;

	}

		public boolean getAllEmployeeDetail() {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
	       EntityManager manager=entityManagerFactory.createEntityManager();
	       
	      String jpql="select e from EmployeeInfoBean e ";
	      Query query=manager.createQuery(jpql);
	   
	      List<EmployeeInfoBean> records= query.getResultList();
	      for(EmployeeInfoBean record:records) {
	    	  
	      System.out.println(record.getId());
	      System.out.println(record.getName());
	      System.out.println(record.getMailid());
		
	}
		return true;
	}

		@Override
		public boolean createEmployee() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean getEmployeeDetailById(int id) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean updateEmployeeInfo(int id) {
			// TODO Auto-generated method stub
			return false;
		}

		

}
*/
