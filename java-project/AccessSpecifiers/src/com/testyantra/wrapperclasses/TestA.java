package com.testyantra.wrapperclasses;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		System.out.println("a is "+a);
		Integer i = a;				//boxing or Auto Boxing
		System.out.println("i is "+i);
		
		Integer x = 10;
		Integer z = new Integer(20);
		System.out.println("x is "+x);
		int y = x;                   //unboxing or auto un boxing
		System.out.println("y is "+y);
		
		int value = Integer.parseInt("123");
		System.out.println("Value is "+value);
		
		boolean result = Boolean.parseBoolean("true");
		System.out.println("Result is "+result);

	}

}
