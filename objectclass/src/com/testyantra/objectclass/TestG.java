package com.testyantra.objectclass;

public class TestG {

	public static void main(String[] args) {

		Employee e1 = new Employee(1,"ganga",10000);
		Employee e2 = new Employee(2,"Gowri",20000);
		Employee e3 = e1;
		boolean isEquals = e1.equals(e3);
		System.out.println(isEquals);
		
		boolean isEqual = e1.equals(e2);
		System.out.println(isEqual);


	}

}
