package com.testyantra.stringclass;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Rashuu";
		String s2 = "Ranu";
		
		String s3 = new String("Rashuu");
		String s4 = new String("Rashuu");
		String s5 = "Rashuu";
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s5));
		
		String s6 = s1.toLowerCase();
		System.out.println(s6);
		String s7 = s1.toUpperCase();
		System.out.println(s7);
		char c = s1.charAt(0);
		System.out.println(c);
		
		boolean b = s1.equalsIgnoreCase("rASHUU");
		System.out.println(b);

	}

}
