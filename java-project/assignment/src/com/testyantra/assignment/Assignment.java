package com.testyantra.assignment;

public class Assignment {

	public static void main(String[] args) {
		
		String s1 = "rashmi";
		String s2 = "patil";
		char s3 = s1.charAt(2);
		System.out.println("char At 2 "+s3);
		String s4 = s1.concat(s2); 
		System.out.println("after concating 2 strings "+s4);
		String s5 = s1.replace('m', 'h');
		System.out.println("replacing "+s5);
		String s6 = s4.substring(7);
	    System.out.println("substring from 7 "+s6);
	    boolean s7 = s4.contains(s2);
	    System.out.println("string contains patil "+s7);
	    String s8 = s1.valueOf(0);
	    System.out.println(s8);
	    		
		
		
	}

}
