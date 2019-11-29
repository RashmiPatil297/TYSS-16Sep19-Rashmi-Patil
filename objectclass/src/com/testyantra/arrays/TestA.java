package com.testyantra.arrays;

public class TestA {

	public static void main(String[] args) {
	
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		for (int i = 0; i < nums.length; i++) {
			int j = nums[i];
			System.out.println(j);
			
		}
		System.out.println("**************************");
		
		int[] numbers = {10,20,30,40,50,60};
		for (int i : numbers) { //for-each method
			
			System.out.println(i);
			
		}
		
		System.out.println("*************************");
		char[] c = {'a','b','c','d','e'};
		for (int i = 0; i < c.length; i++) {
			char d = c[i];
			System.out.println(d);
			
		}
		
		System.out.println("*************************");
		for (char d : c) {
			System.out.println(d);
			
		}
		System.out.println("*************************");
		double[] darray = {12.4,5.4,7.8,9.0,2.8};
		for (int i = 0; i < darray.length; i++) {
			double d = darray[i];
			System.out.println(d);
			
		}
		System.out.println("**************************");
		for (double d : darray) {
			System.out.println(d);
		}
		System.out.println("**************************");
		boolean[] b = {true,false,true,false};
		for (int i = 0; i < b.length; i++) {
			boolean d = b[i];
			System.out.println(d);
			
		}
		System.out.println("******************************");
		for (boolean d : b) {
			System.out.println(d);
		}
		System.out.println("******************************");
		String[] str = {"Basu","Rashu"};
		for (int i = 0; i < str.length; i++) {
			String string = str[i];
			System.out.println(string);
			
		}
		System.out.println("*****************************");
		for (String string : str) {
			System.out.println(string);
			
		}
	}

}
