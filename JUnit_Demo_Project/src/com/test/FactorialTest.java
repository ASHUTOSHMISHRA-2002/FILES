package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.calc.Factorial;

public class FactorialTest {

	@Test
	public void testGetFactorial() {
//		fail("Not yet implemented");
		Factorial fatorial = new Factorial();
		int actual = fatorial.getFactorial(5);
		int expected = 120;
		assertEquals(expected, actual);
	}

}
