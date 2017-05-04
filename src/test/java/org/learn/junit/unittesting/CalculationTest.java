package org.learn.junit.unittesting;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AdditionTest {
	
	static Addition add;
	
	@BeforeClass
	public static void setUp()
	{
		add = new Addition();
	}
	
	@Test
	public void addPositiveNumbers()
	{
		int result = add.calcSum(2, 3);
		assertEquals(5, result);
	}
	
	@Test
	public void addNegativeNumbers()
	{
		int result = add.calcSum(-2, -5);
		assertEquals(-7, result);
	}
}
