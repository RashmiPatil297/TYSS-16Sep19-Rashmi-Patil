package com.testyantra.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {

	public static void main(String[] args) {

		LinkedHashSet<Double> ls = new LinkedHashSet<Double>();
		ls.add(34.4);
		ls.add(54.4);
		ls.add(89.9);
		ls.add(34.8);
		ls.add(98.7);
		ls.add(null);
		ls.add(null);
		
		System.out.println("************************using for each****************");
		for (Double d : ls) {
			System.out.println(d);
			
		}
		System.out.println("***************************using iterator*****************");
		Iterator<Double> it = ls.iterator();
		while(it.hasNext()) {
			Double d1 = it.next();
			System.out.println(d1);
		}

	}

}
