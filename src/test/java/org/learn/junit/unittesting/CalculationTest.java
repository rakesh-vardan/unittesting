package org.learn.junit.unittesting;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

public class CalculationTest {
	
	static Calculation add;
	
	@Parameter(0)
	public int value1;
	@Parameter(1)
	public int value2;
	@Parameter(2)
	public int result;
	
	@Parameters
	public Collection<Object[]> data()
	{
		Object[][] data = new Object[][]{{1,2,2}, {2,3,6}, {5,3,15}};
		return Arrays.asList(data);
	}
	
	@BeforeClass
	public static void setUp()
	{
		add = new Calculation();
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
	
	@Test
	public void multiplyPositiveNumbers()
	{
		int result = add.multiply(2, 3);
		assertEquals(6, result);
	}
	
	@Test
	public void multiplyNegativeNumbers()
	{
		int result = add.multiply(-2, -3);
		assertEquals(6, result);
	}
	
	@Test
	public void multiplyDifferentNumbers()
	{
		int result = add.multiply(-2, 3);
		assertEquals(-6, result);
	}

	@Test
	public void testMultiplyParam()
	{
		assertEquals("Result:", result, add.multiply(value1, value2));
	}
}
