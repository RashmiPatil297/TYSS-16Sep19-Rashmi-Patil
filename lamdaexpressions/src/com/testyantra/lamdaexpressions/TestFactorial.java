package com.testyantra.lamdaexpressions;

public class TestFactorial {

	public static void main(String[] args) {
		FactorialInterface f = (n)-> {
			
			int fact = 1;
			for (int i = 2; i <= n; i++) {
				
				fact = fact * i;
				
			}
			return fact;
		};
		System.out.println(f.factorial(5));

	}

}
