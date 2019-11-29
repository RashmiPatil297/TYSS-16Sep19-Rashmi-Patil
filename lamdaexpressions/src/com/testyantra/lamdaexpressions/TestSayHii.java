package com.testyantra.lamdaexpressions;

public class TestSayHii {

	public static void main(String[] args) {
		
		SayHiInterface i = ()->System.out.println("hiii");
		i.sayhii();

	}

}
