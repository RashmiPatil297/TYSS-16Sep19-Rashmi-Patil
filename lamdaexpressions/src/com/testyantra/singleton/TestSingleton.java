package com.testyantra.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		MySingleton i = MySingleton.getDBConnection();
		i.s = "hello";
		System.out.println("hashcode of i "+i.hashCode());
		
		MySingleton mx = MySingleton.getDBConnection();
		mx.s = "hiii";
		System.out.println("hashcode of mx "+mx.hashCode());
		
		System.out.println(i.s);
		System.out.println(mx.s);
		

	}

}
