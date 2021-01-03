package com.capg.object;

public class Employee {
 String name;
 int age;
public Employee(String name, int intAge) {
	super();
	this.name = name;
	this.age = age;
}
 


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + age;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (age != other.age)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}



//public boolean equals(Employee e) {
//	if(this.age == e.age) {
//		if(this.name == e.name) {
//			return true;
//		}
//		else
//		{
//			return false;
//		}}
//		else {
//			return false;
//		}
//	}
}

