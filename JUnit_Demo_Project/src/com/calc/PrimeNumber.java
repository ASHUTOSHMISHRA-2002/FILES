package com.calc;

public class PrimeNumber {
	public String primeCheck(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
		return "Prime";
}
		return "Not Prime";
}
}
