package com.learn.mockito.mockito_example;

import static org.junit.Assert.*;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class Mathtest {
	
	Math mathObj;

	@Before
	public void createAbc() throws Exception 
	{
		
		mathObj = mock(Math.class);
		when(mathObj.add(2, 1)).thenReturn(3);
		
	}
    
	

	@Test
	public void test() {
		assertSame(3, mathObj.add(2,1));
	}

}
