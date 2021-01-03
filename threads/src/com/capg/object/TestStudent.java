package com.capg.object;

public class TestStudent {
public static void main(String[] args) {
	Student s1 = new Student("shra", 34);
	System.out.println(s1.toString());


//getClass
Class c1 = s1.getClass();
System.out.println(c1.getName());
System.out.println("=================");
Student s2 = null;

}
}
