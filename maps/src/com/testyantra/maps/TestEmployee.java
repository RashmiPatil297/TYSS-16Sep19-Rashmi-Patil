package com.testyantra.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee s1 = new Employee(2,"divya", 67.89);
		Employee s2 = new Employee(5,"ambika", 56.89);
		Employee s3 = new Employee(12,"kiran", 45.89);
		Employee s4 = new Employee(34,"dinesh", 78.89);
	    Employee s5 = new Employee(1,"chinnu", 35.67);
	    Employee s6 = new Employee(8,"giri", 67.8);
	    Employee s7 = new Employee(4,"sonu", 45.78);
	    Employee s8 = new Employee(7,"sweety", 89.9);
	    Employee s9 = new Employee(45,"dimple", 33.2);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Employee> al1 = new ArrayList<Employee>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
		ArrayList<Employee> al2 = new ArrayList<Employee>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		HashMap<String, ArrayList<Employee>> hm = new HashMap<>();
		hm.put("first", al);
		hm.put("second", al1);
		hm.put("third", al2);
		
		ArrayList<Employee> second = hm.get("second");
		
		Iterator<Employee> it = second.iterator();
		while(it.hasNext()) {
			Employee s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Salary is "+s.salary);
		}
		

	}

}
