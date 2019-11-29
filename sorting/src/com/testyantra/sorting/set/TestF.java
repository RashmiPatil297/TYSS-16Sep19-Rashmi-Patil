package com.testyantra.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("roopa");
		ts.add("jaya");
		ts.add("loopa");
		ts.add("soopa");
		ts.add("toopa");
		
		System.out.println("************************using for each****************");
		for (String s : ts) {
			System.out.println(s);
			
		}
		System.out.println("***************************using iterator*****************");
		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			String s1 = it.next();
			System.out.println(s1);
		}


		
	}

}
