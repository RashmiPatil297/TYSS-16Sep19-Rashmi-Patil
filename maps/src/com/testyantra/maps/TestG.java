package com.testyantra.maps;

import java.util.Hashtable;

public class TestG {
	
	public static void main(String[] args) {
		
	Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
	ht.put(101, "ajay");
	ht.put(102, "vijay");
	ht.put(100, "sonu");
	ht.put(50, "rashu");
	ht.put(300,"pinku");
	ht.put(99, "monu");
	ht.put(101, "sriram");
	//ht.put(null,"john"); NullPointerException
	//ht.put(108,null);	NullPointerException
	
	System.out.println("Data "+ht);
	}
	
	
	
}
