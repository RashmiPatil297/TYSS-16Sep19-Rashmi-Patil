package com.testyantra.singleton;

public class MySingleton {
	
	private final static MySingleton instance = new MySingleton();
	String s;
	private MySingleton() {
	
	}
	
	public static MySingleton getDBConnection() {
		
			return instance;
			
		
		
	}

}
