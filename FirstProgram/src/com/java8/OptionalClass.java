package com.java8;

import java.util.Optional;

public class OptionalClass {
public static void main(String[] args) {
	String str[] = new String[5];
	
	str[1] = "hello";
	str[0] = "stackroute";
	
	System.out.println(str[1].toUpperCase());
	Optional<String> c = Optional.ofNullable(str[2]);
	if(c.isPresent())
		System.out.println(str[2].toUpperCase());
}
}
