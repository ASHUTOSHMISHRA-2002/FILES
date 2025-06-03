package com.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import com.calc.Calculator;

@RunWith(Parameterized.class)
public class CalculatorTest {
	private int input1;
	private int input2;
	private int expected1;
	private int expected2;

	public CalculatorTest(int input1, int input2, int expected1, int expected2) {
		super();
		this.input1 = input1;
		this.input2 = input2;
		this.expected1 = expected1;
		this.expected2 = expected2;
	}

	static Calculator calculator;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
		calculator = new Calculator();
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
		calculator = null;
	}

//	@Before
//	public void before() {
//		System.out.println("Before");
//	}
//	
//	@After
//	public void after() {
//		System.out.println("After");
//	}

	@Test // It allows the JUnit framework to identify and execute the method as part of
			// the test suite.
	public void testGetAddition() {
		System.out.println("Test Addition");
//		calculator = new Calculator();
		int actual = calculator.getAddition(input1, input2);
//		expected = input1 + input2;
		assertEquals(expected1, actual);
	}

//	@Ignore //It will ignore the operation
	@Test
	public void testGetSubtraction() {

		System.out.println("Test Subtraction");
//		calculator = new Calculator();
		int actual = calculator.getSubtraction(input1, input2);
//		expected = input1 - input2;
		assertEquals(expected2, actual);
	}

	@Parameters
	public static Collection calculatorNumbers() {
		return Arrays.asList(new Object[][] { { 2, 3, 5, -1 }, { 3, 4, 7, -1 }, { 5, 4, 9, 1 }, { 10, 4, 14, 6 },
				{ 15, 4, 19, 11 } });
	}
}
