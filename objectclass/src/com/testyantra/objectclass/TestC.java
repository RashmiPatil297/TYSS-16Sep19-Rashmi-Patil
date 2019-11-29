package com.testyantra.objectclass;

public class TestC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marker m = new Marker();
		int hashValue = m.hashCode();
		String s = m.toString();
		System.out.println("hash value = "+hashValue);
		System.out.println(s);
		
		Marker p = new Marker();
		System.out.println(p);

	}

}
