package com.capg.abhi.set;

public class Student  {
 String studName;
 Integer studAge;
public Student(String studName, Integer studAge) {
	super();
	this.studName = studName;
	this.studAge = studAge;
}
@Override
public String toString() {
	return "Student [studName=" + studName + ", studAge=" + studAge + "]";
}
 
}
