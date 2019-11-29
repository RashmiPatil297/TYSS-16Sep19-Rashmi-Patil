package com.testyantra.sorting.list;

public class Laptop implements Comparable<Laptop>{

	double price;
	int ram;
	String name;
	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}
	
	/*
	 * @Override public int compareTo(Laptop l) { Integer i = this.ram; Integer i1 =
	 * l.ram; return i.compareTo(i1); }
	 */
	
	/*
	 * @Override public int compareTo(Laptop l) { Double i = this.price; Double i1 =
	 * l.price; return i.compareTo(i1); }
	 */
	
	@Override public int compareTo(Laptop l)
	{ 
		String s1 = this.name.toLowerCase();
		String s2 = l.name.toLowerCase();
		return s1.compareTo(s2);
		}


}
