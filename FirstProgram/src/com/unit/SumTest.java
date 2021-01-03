package com.unit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SumTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}
	@Before
	public void setUp() throws Exception {
		System.out.println("Before method");
	}
	
	
	@Test
	public void test1() {
		Assert.assertEquals(300, Sum.sum(200, 100));
	}
	@Test
	public void test2() {
		Assert.assertEquals(20000, Sum.multi(200, 100));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(200, Sum.sum(100, 100));
	}
	
	
	@Test(expected= ArithmeticException.class)
	public void test8() {
		Sum obj = new Sum();
		obj.calcDivide();
	}
	
	@Test
	public void test4() {
		Assert.assertEquals(24, Sum.findArray(new int[] {1,24,-2,5}));
	}

}
