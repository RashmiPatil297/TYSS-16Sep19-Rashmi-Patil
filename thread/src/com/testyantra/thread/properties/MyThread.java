package com.testyantra.thread.properties;

public class MyThread extends Thread{
	
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		String tName = Thread.currentThread().getName();
		System.out.println("Current Thread "+tName);
		
		MyThread t1 = new MyThread();
		String mName = t1.getName();
		System.out.println("MyThread name "+mName);
		
		Thread.currentThread().setName("first thread");
		
		//System.out.println(10/0);
		
		System.out.println("Main ended");
		
	}

}
