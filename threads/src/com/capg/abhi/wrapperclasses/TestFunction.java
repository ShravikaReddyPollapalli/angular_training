package com.capg.abhi.wrapperclasses;

import java.util.function.Function;

public class TestFunction {
public static void main(String[] args) {
	Function<Integer, Integer> f1 = a -> {
		return a * 100;
	};
	System.out.println(f1.apply(23));
	System.out.println(f1.apply(50));
}
}
