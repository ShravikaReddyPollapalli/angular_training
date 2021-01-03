package com.capgemini.constructorchaining;

public class Demo {
public int x;
public int y;
public int z;
public Demo(int x, int y) {
	
	this.x = x;
	this.y = y;
}
public Demo(int x,int y,int z) {
	this(x,y);
	this.z=z;
}
public void display() {
	System.out.println(x+y+z);
}
public static void main(String[] args) {
	Demo demo = new Demo(2,3);
	demo.display();
	Demo demo1 = new Demo(1,2,3);
	demo1.display();
}
}
