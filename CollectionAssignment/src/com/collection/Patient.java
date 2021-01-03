package com.collection;

import java.util.Comparator;

public class Patient {
private int patientId;
private String name;
private int age;
public Patient(int patientId, String name, int age) {
	super();
	this.patientId = patientId;
	this.name = name;
	this.age = age;
}
public int getPatientId() {
	return patientId;
}
public void setPatientId(int patientId) {
	this.patientId = patientId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public static Comparator<Patient> name1 = new Comparator<Patient>() {
    @Override
    public int compare(Patient p1, Patient p2) {
        String name1 = p1.getName();
        String name2 = p2.getName();

        return name1.compareTo(name2);
    }
};

public static Comparator<Patient> age1 = new Comparator<Patient>() {
    @Override
    public int compare(Patient a1, Patient a2) {
        int Age1=a1.getAge();
        int Age2=a2.getAge();
        return  Age1-Age2;
    }
};
@Override
public String toString() {
	return "Patient [patientId=" + patientId + ", name=" + name + ", age=" + age + "]";
}

}
