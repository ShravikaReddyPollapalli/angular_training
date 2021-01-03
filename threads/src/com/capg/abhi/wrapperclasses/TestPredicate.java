package com.capg.abhi.wrapperclasses;

import java.util.function.Predicate;

public class TestPredicate {
public static void main(String[] args) {
	Predicate <Integer>  p = a -> a%2 == 0;
	System.out.println(p.test(100));
	//lamda expression to implement functional interface
}
}
