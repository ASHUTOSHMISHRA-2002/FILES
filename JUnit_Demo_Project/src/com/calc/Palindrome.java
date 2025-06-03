package com.calc;

public class Palindrome {
	public String checkPalindrome(int a) {
		int c = a;
		int reverse = 0;
		while(c>0) {
			int num = c % 10;
			reverse = reverse*10 + num;
			c /= 10;
		}
		if(a == reverse) {
			return "Palindrome";
		}
		return "Not Palindrome";
	}
}
