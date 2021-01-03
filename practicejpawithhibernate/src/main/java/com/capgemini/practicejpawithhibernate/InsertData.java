package com.capgemini.practicejpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.practicejpawithhibernate.dto.Employee;



public class InsertData {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(2);
		employee.setName("kallu");
		employee.setSalary(20500);
		employee.setEmail("kallu@gmail.com");
		employee.setDesignation("Hr");
		employee.setMobile(9502604377L);
		employee.setPassword("qwerty");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(employee);
		System.out.println("employee record saved");
		transaction.commit();
		manager.close();
		entityManagerFactory.close();
}
}