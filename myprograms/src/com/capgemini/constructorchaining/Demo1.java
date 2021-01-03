
package com.capgemini.constructorchaining;

public class Demo1 extends Demo {
	public int z;

	public Demo1(int x,int y,int z) {
		super(x,y);
		this.z = z;
	}
	public void m1() {
		System.out.println(x+y+z);
	}

}
