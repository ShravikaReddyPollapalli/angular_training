package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Emp {
	int id;
	String name;
	float salary;
	public Emp(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
}
public class StreamAPIProgram {
	public static void main(String[] args) {
		
	
List<Emp> obj = new ArrayList<>();
obj.add(new Emp(1,"sai",50000));
obj.add(new Emp(2,"sunny",45000));
obj.add(new Emp(3,"abhi",34000));
obj.add(new Emp(4,"qwqer",56000));
obj.add(new Emp(4,"ravi",10000));
obj.add(new Emp(5,"sachin",70000));
obj.add(new Emp(3,"david",80000));
obj.add(new Emp(6,"martin",25000));
List<Float> s = obj.stream()
					.filter(e -> e.salary < 45000)
					.map(e -> e.salary)
					.collect(Collectors.toList());
System.out.println(s);
obj.stream().filter(e -> e.salary > 35000)
.forEach(e -> System.out.println(e.name + "," + e.salary));

float total = obj.stream()
.map(e -> e.salary)
.reduce(0.0f, Float::sum);
System.out.println(total);

Emp obj2 = obj.stream().max((e1,e2) -> 
e1.salary > e2.salary ? 1 : -1).get();
System.out.println(obj2.salary);

long c = obj.stream()
.filter(e -> e.salary < 45000)
.count();
System.out.println(c);
}
}
