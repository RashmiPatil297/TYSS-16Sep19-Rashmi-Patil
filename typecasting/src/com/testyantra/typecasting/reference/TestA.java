package com.testyantra.typecasting.reference;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p = new Marker();
		System.out.println(p.cost);
		p.write();
		//System.out.println(p.size);
		Marker m = (Marker)p;
		System.out.println(m.cost);
		System.out.println(m.size);
		m.write();
		m.color();
		

	}

}
