package com.capg.encapsulation;

public class Main {
	
	    public static void main(String args[])
	    {
	        StudentBean1 sb = new StudentBean1();
	        
	        //Setting values
	        sb.setStudentId(99);
	        sb.setStudentName("JIP");
	        
	        //Retrieving the values
	        System.out.println("Student Id : "+sb.getStudentId());
	        System.out.println("Student Name : "+sb.getStudentName());
	    }
	}

