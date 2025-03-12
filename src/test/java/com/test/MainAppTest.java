package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.MainApp;

public class MainAppTest {
	
	
	@Test
	public void TestAddition() {
		MainApp map=new MainApp();
		assertEquals(5,map.addition(3,2));
	}

	@Test
	public void TestMultiply() {
		MainApp map = new MainApp();
		assertEquals(6, map.multiply(3, 2));
	}	

}
