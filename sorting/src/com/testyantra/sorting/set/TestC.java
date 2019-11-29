package com.testyantra.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
	public static void main(String[] args) {
		
	LinkedHashSet ls = new LinkedHashSet();
	ls.add(34);
	ls.add("nikitiha");
	ls.add(89.9);
	ls.add(34);
	ls.add("bhavya");
	ls.add(null);
	ls.add(null);
	
	System.out.println("************************using for each****************");
	for (Object o : ls) {
		System.out.println(o);
		
	}
	System.out.println("***************************using iterator*****************");
	Iterator<String> it = ls.iterator();
	while(it.hasNext()) {
		Object p = it.next();
		System.out.println(p);
	}
	}
	
	
	

}
