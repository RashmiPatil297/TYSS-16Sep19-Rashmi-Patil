package com.testyantra.colectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {
	
	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Raksha");
		a1.add("Rashmi");
		a1.add("Rani");
		a1.add("Archana");
		
		System.out.println("Before Sort "+a1);
		Collections.sort(a1);
		System.out.println("after sorting "+a1);
	}

}
