package com.testyantra.lamdaexpressions;

public class TestSquareInterface {

	public static void main(String[] args) {
		
		SquareInterace t = x->x*x;
		int value = t.square(10);
		System.out.println(value);

	}

}
