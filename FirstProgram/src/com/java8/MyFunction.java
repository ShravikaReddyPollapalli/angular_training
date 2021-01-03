package com.java8;
//functional interface

@FunctionalInterface
public interface MyFunction<T> {
    public T myOnlyMethod(T t);
}
//only one abstract method