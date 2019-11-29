package com.testyantra.atmmachine;

public class TestAtm {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Machine m = new Machine();
		HDFC h = new HDFC();
		m.slot(h);
		
		ICICI i = new ICICI();
		m.slot(i);
		
		SBI s = new SBI();
		m.slot(s);

	}

}
