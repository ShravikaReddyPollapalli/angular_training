package com.capg.abhi.queue;

public class Student implements Comparable<Student> {
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
@Override
public int compareTo(Student o) {
	
//	if(this.studAge > o.studAge) {
//		return 1;
//	} else if(this.studAge < o.studAge) {
//		return -1;
//	} else {
//		return 0;
//	}
	return this.studAge.compareTo(o.studAge);
}
//we cannot compare string values  //compares based on askii values
//public int compareTo(Student o) {
//	return this.studName.compareTo(o.studName);
//}
}
