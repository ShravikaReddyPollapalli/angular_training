package com.java8;

import java.util.ArrayList;
import java.util.List;

public class App {
public static void main(String[] args) {
	
	        MyFunction<Integer>  multiply = (s) ->  s * s;

	        MyFunction<String>  greet = (s) -> {
	            return "Hello " + s;
	        };

	        Integer total =  multiply.myOnlyMethod(4);

	        System.out.println(greet.myOnlyMethod("Joe"));

	        List myList = new ArrayList();

	        myList.add(1);
	        myList.add(2);
	        myList.add(3);
	        myList.add(4);



	        myList.stream()

	                .map(a -> {
	                    int b = (int) a;

	                    return  b + b;
	                })

	                .forEach(a -> {
	                    System.out.println(a);
	                });

	    }

}

