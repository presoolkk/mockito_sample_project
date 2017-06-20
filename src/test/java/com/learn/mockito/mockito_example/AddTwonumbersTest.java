package com.learn.mockito.mockito_example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AddTwonumbersTest {
	
	AddTwonumbers add;


	@Before
	public void setUp() throws Exception {
		add = new AddTwonumbers();
		System.out.println("BeforeClass0");
	}
	
	@After
	public void af(){
		System.out.println("After0");
	}
	
	

	@Test
	public void test() {
//		fail("Not yet implemented");
		
		int result = 2 + 3;
		assertEquals(result, add.ab(2,3));
	}
	
	
	@Before
	public void bb() throws Exception {
		System.out.println("BeforeClass1");
	}
	@After
	public void af1(){
		System.out.println("After1");
	}

}
