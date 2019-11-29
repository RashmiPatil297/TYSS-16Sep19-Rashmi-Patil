package com.testyantra.colectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(45.6);
		a1.add("basu");
		a1.add(true);
		
		ListIterator li = a1.listIterator();
		System.out.println("------------------>Forward");
		while(li.hasNext()) {
			Object o1 = li.next();
			System.out.println(o1);
		}
		System.out.println("backward<-------------------");
		while(li.hasPrevious()) {
			Object o = li.previous();
			System.out.println(o);
		}
	}
}
