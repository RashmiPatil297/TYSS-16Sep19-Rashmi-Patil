package com.testyantra.typecasting.primitive;

public class PrimitiveCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10;
		int b = a;
		System.out.println("b is "+b);
		int p = 20;
		double q = p;
		System.out.println("q is "+q);
		System.out.println("=================================");
		
		double x = 20.67;
		int y = (int) x;
		System.out.println("y is "+y);
		byte  z = (byte) x;
		System.out.println("z is "+z);
		int c = a;
		char r = (char) c;
		System.out.println("r is "+r);

	}

}
