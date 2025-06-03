package com.calc;

public class Calculator {

	public int getAddition(int a, int b) {
//		int sum = a + b;
		return a + b;
	}
	
	@Deprecated //keep the previous code but make it of no use 
	public int getAddition1(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public int getSubtraction(int a, int b) {
//		int sub = a - b;
		return a - b;
	}
}