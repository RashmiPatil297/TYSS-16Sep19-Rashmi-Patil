package com.testyantra.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestE {

	public static void main(String[] args) {
		
		ArrayList<Marker> al = new ArrayList<Marker>();
		al.add(new Marker("blue",10));
		al.add(new Marker("red",50));
		al.add(new Marker("green",20));
		al.add(new Marker("pink",40));
		
		System.out.println("Before sorting------------>");
		display(al);
		
		SortByPrice sb = new SortByPrice();
		//Collections.sort(al,sb);
		
		SortByColor sc = new SortByColor();
		Collections.sort(al,sc);
		
		
		System.out.println("After sorting------------------>");
		display(al);

	}
	
	static void display(ArrayList<Marker> a) {
		Iterator<Marker> it = a.iterator();
		while(it.hasNext()) {
			Marker m = it.next();
			System.out.println("price is "+m.price);
			System.out.println("color is "+m.color);
		}
	}

}
