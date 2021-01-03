package com.capg.object;

public class Student  implements Cloneable{
	public String studName;
	public int studentAge;

	public Student(String studName, int studentAge) {
		super();
		this.studName = studName;
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student [studName=" + studName + ", studentAge=" + studentAge + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
