package com.testyantra.google;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser b = new Browser();
		Google g = new Gmail();
		b.open(g);
		Google g1 = new GoogleDrive();
		b.open(g1);

	}

}
