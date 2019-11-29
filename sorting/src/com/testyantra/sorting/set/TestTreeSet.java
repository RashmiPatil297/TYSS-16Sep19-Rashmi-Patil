package com.testyantra.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		
		ts.add(34);
		ts.add(54);
		ts.add(89);
		ts.add(34);
		ts.add(98);
	
	
		
		System.out.println("************************using for each****************");
		for (Object d : ts) {
			System.out.println(d);
			
		}
		System.out.println("***************************using iterator*****************");
		Iterator<Double> it = ts.iterator();
		while(it.hasNext()) {
			Object d1 = it.next();
			System.out.println(d1);
		}

	}


	}


