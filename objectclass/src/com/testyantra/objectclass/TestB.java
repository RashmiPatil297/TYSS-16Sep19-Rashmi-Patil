package com.testyantra.objectclass;

public class TestB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p = new Pen();
		int hashValue1 = p.hashCode();
		System.out.println("hashcode value1 = "+hashValue1);
		
		Pen q = new Pen();
		int hashValue2 = q.hashCode();
		System.out.println("hashcode value2 = "+hashValue2);


	}

}
