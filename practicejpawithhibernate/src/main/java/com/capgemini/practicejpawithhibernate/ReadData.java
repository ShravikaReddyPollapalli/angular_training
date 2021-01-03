package com.capgemini.practicejpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.practicejpawithhibernate.dto.Employee;



public class ReadData {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;  
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			entityManagerFactory= Persistence.createEntityManagerFactory("TestPersistence");
			manager = entityManagerFactory.createEntityManager();
			Employee record=manager.find(Employee.class, 1);
			System.out.println(record.getId());
			System.out.println(record.getName());
			System.out.println(record.getMobile());
			System.out.println(record.getEmail());
			System.out.println(record.getDesignation());
			System.out.println(record.getSalary());
			System.out.println(record.getPassword());
			
			 
			
		}
		
		catch(Exception e ) {
			e.printStackTrace();
			transaction.rollback();
		}
		manager.close();
		entityManagerFactory.close();
		}
	}


