package com.testyantra.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortByCustomerName sb = new SortByCustomerName();
		
		TreeSet<Customer> ts = new TreeSet<Customer>(sb);
		Customer c1 = new Customer(1,"Raksha",15000);
		Customer c2 = new Customer(2,"daksha",25000);
		Customer c3 = new Customer(3,"laksha",45000);
		Customer c4 = new Customer(4,"naksha",35000);
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		
		System.out.println("**************using iterator***************");
		Iterator<Customer> it = ts.iterator();
		while(it.hasNext()) {
			Customer b = it.next();
			System.out.println("Id is "+b.id);
			System.out.println("Name is "+b.name);
			
			System.out.println("Salary is "+b.salary);
			System.out.println("===========================");
		}
		
		
		

	}

}
