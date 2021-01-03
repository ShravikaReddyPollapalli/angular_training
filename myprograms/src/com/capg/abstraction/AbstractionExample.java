package com.capg.abstraction;


public class AbstractionExample{
	   public static void main(String args[]) {
	      Person person1 = new Student();
	      person1.dsplay();
	      Person person2 = new Lecturer();
	      person2.dsplay();
	   }
}