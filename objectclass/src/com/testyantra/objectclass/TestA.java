package com.testyantra.objectclass;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pendrive p = new Pendrive();
		USBPort.connect(p);
		Mouse m = new Mouse();
		USBPort.connect(m);

	}

}
