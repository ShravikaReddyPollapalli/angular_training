package com.legato.SpringCore1;

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
        ApplicationContext a = new ClassPathXmlApplicationContext("spring.xml");
        EmpService s = a.getBean("service",EmpService.class);
        System.out.println(s.getEmpDao());
        s.getUser("ram");
        s = a.getBean("service1",EmpService.class);
        System.out.println(s.getEmpDao());
    }
}
