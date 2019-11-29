package com.testyantra.objectclass;

public class TestH {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Person p1 = new Person(1,"Vishwa");
		System.out.println("p1 id "+p1.id);
		System.out.println("p1 name "+p1.name);
		
		Object o = p1.clone();
		Person p2 = (Person)o;
		p2.id = 20;
		p2.name = "Arun";
		System.out.println("p2 id is "+p2.id);
		System.out.println("p2 name is "+p2.name);
	}

}
