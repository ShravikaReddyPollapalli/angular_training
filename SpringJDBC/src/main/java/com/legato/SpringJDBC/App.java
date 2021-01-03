package com.legato.SpringJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ct = new ClassPathXmlApplicationContext("spring.xml");
        Customer c = new Customer(2,"shravika","hyd");
        CustomerDAO d = ct.getBean("cdao",CustomerDAO.class);
        System.out.println(d.addCustomer(c));
        List<Customer> l = d.getCustomerDetails();
        for(Customer cs: l) {
        	System.out.println(cs.getId() + "," + cs.getName() + "," + cs.getAddress());
        }
    }
}
