package com.testyantra.hasarelation.weak;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		System.out.println(p.name);
		p.sleep();
		p.eat();
		System.out.println("*****************");
		System.out.println(p.m.color);
		System.out.println(p.m.size);
		p.m.write();

	}

}
