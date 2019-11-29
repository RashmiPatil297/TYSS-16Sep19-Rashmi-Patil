package com.testyantra.thread;

public class TestMyRunnable {
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		}
		
		System.out.println("main ended");
		
	}
}
