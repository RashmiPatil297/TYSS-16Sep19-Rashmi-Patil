package com.testyantra.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestF {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee e1 = new Employee(1, "veeru");
		Employee e2 = new Employee(2, "yuvi");
		Employee e3 = new Employee(3, "dhoni");
		
		
		Comparator<Employee> cmp = (e5,e6) ->{
			return e5.name.compareTo(e6.name);
		};
	
		
		List<Employee> l = al.stream().sorted(cmp).collect(Collectors.toList());
		Iterator<Employee> it = l.iterator();
		while(it.hasNext()) {
			Employee i = it.next();
			System.out.println("Id is "+i.id);
			System.out.println("Name is "+i.name);
			System.out.println("=========================");

	}
}
}
