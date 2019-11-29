package com.testyantra.colectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestK {

	public static void main(String[] args) {
		
		ArrayList<Double> a1 = new ArrayList<Double>();
		a1.add(34.5);
		a1.add(24.5);
		a1.add(14.5);
		a1.add(4.5);
		a1.add(null);
		a1.add(null);
		
		System.out.println(a1);
		a1.add(2,54.5);
		System.out.println("after add in 2nd index "+a1);
		a1.remove(0);
		System.out.println("after removing 0th index "+a1);
		a1.remove(null);
		System.out.println("After removing null "+a1);
		Double val = a1.get(4);
		System.out.println("Object at 4th index "+val);
		a1.set(2, 77.6);
		System.out.println("after replacing 2nd value "+a1);
		a1.clear();
		System.out.println("after clear method "+a1);
		a1.contains(54.6); 
		
		System.out.println("using list");
		List<Double> a2 = new ArrayList<Double>();
		a2.add(12.3);
		a2.add(23.4);
		a2.add(34.5);
		
		a1.addAll(a2);
		System.out.println("after add all "+a1);
		
		boolean contain = a1.containsAll(a2);
		System.out.println("contains all "+contain);
		
		boolean res = a1.removeAll(a2);
		System.out.println("Removed all of a2 "+res);
		
	}

}
