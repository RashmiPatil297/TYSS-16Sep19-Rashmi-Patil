package com.testyantra.beanobject.bean;

import java.util.Scanner;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Scanner class");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter age");
		int age = s.nextInt();
		System.out.println("Age is "+age);
		
		System.out.println("Enter name");
		String s1 = s.nextLine();
		System.out.println("Name is "+s1);
		
		System.out.println("Enter phone no");
		long pno = s.nextLong();
		System.out.println("Phone no is "+pno);
		
		System.out.println("Enter PI value");
		double PI = s.nextDouble();
		System.out.println("PI value is "+PI);
		
		System.out.println("Enter value");
		byte value = s.nextByte();
		System.out.println("entered value is "+value);
		
		System.out.println("Enter float value");
		float floatValue = s.nextFloat();
		System.out.println("Float value is "+floatValue);
		
		System.out.println("Enter short value");
		short shortvalue = s.nextShort();
		System.out.println("Short value is "+shortvalue);
		
		System.out.println("Enter boolean");
		boolean booleanValue = s.nextBoolean();
		System.out.println("Boolean value is "+booleanValue);
		

	}

}
