package com.capgemini.practicejpawithhibernate;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.practicejpawithhibernate.dto.Employee;



public class UpdateData implements Serializable {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;  
		EntityManager manager=null;
		EntityTransaction transaction=null;
		
		try {
			entityManagerFactory= Persistence.createEntityManagerFactory("TestPersistence");
			 manager = entityManagerFactory.createEntityManager();
			 transaction = manager.getTransaction();
			transaction.begin();
			Employee emp=manager.find(Employee.class, 2);
			emp.setName("kalyani");
			
			System.out.println("Data Updated");
			transaction.commit();
			
			} catch(Exception e){
			e.printStackTrace();
			transaction.rollback();
		}
		manager.close();
		entityManagerFactory.close();
}
}