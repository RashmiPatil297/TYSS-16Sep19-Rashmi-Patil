package com.testyantra.colectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {

	public static void main(String[] args) {

		LinkedList li = new LinkedList();
		li.add(12);
		li.add(12.44);
		li.add("more");
		li.add(true);
		li.add(null);

		System.out.println("==========using for loop======");
		for (int i = 0; i < li.size(); i++) {

			System.out.println(li.get(i));

		}

		System.out.println("===============using fo-each loop================");
		for (Object object : li) {
			System.out.println(object);

		}

		System.out.println("===============using list-iterator==============");
		Iterator  it1 = li.iterator();
		while(it1.hasNext()) {
			Object ot1 = it1.next();
			System.out.println(ot1);
		}

		System.out.println("===============using list-iterator==============");
		ListIterator  it = li.listIterator();
		while(it.hasNext()) {
			Object ot = it.next();
			System.out.println(ot);
		}
		
		System.out.println("============list iterator backward===========");
		while(it.hasPrevious()) {
			Object ot3 = it.previous();
			System.out.println(ot3);
			}

	}

}
