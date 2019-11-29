package com.testyantra.colectionframework.list;

import java.util.ArrayList;

public class TestE {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add("soumya");
		
		Object o = a1.get(0);
		String s = (String)o;
		System.out.println(s.toUpperCase());
		

	}

}
