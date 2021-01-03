package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Dealer {
String name;
int age;
public Dealer(String name, int age) {
this.name = name;
this.age = age;
}
}
public class CollectorsProgram {
public static void main(String[] args) {
	List<Dealer> obj = new ArrayList<Dealer>();
	obj.add(new Dealer("sai",20));
	obj.add(new Dealer("qwer",34));
	obj.add(new Dealer("asdf",35));
	obj.add(new Dealer("zxcv",78));
	obj.add(new Dealer("mnmbv",23));
	List<Integer> values = obj.stream()
			.map(v -> v.age)
			.collect(Collectors.toList());
	System.out.println(values);
	
	Integer total = obj.stream().collect(Collectors.summingInt(v -> v.age));
	System.out.println(total);
	Double t1 = obj.stream().collect(Collectors.averagingInt(v -> v.age));
	System.out.println(t1);
	Long count = obj.stream().collect(Collectors.counting());
	System.out.println(count);
	List<String> dept = Arrays.asList("cs","mc","cv","cs","el","ec","el","ec","el","IT");
	
	Map<String,Long> result = dept.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(result);
}
}
