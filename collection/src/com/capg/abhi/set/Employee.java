package com.capg.abhi.set;

public class Employee implements Comparable<Employee> {
String empName;
Integer empAge;
public Employee(String empName, Integer empAge) {
	super();
	this.empName = empName;
	this.empAge = empAge;
}
@Override
public String toString() {
	return "Employee [empName=" + empName + ", empAge=" + empAge + "]";
}
//@Override
//public int compareTo(Employee o) {
//	return this.empName.compareTo(o.empName);
//}
@Override
public int compareTo(Employee o) {
	// TODO Auto-generated method stub
	return this.empAge.compareTo(o.empAge);
}


}
