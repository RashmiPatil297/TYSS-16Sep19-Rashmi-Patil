package com.testyantra.accessmodifiers.pkg2;

public class Run extends Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		/*
		 * System.out.println(d.a); d.add();
		 */
		//Default
		System.out.println(d.b);
		d.sub();
		//Protected
		System.out.println(d.c);
		d.mul();
		//Public
		System.out.println(d.name);
		d.div();
		
	}

}
