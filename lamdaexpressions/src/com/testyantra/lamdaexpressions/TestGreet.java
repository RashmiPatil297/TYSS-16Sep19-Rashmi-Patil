package com.testyantra.lamdaexpressions;

public class TestGreet {

	public static void main(String[] args) {
		
		GreetInterface gr = (msg)-> {
			System.out.println("hello");	
			System.out.println(msg);
	
		};
		gr.greet("hii");

	

	}

}
