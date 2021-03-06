package com.testyantra.thread.properties;

public class MyIdThread extends Thread {
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		System.out.println(Thread.currentThread().getId());
		
		MyIdThread mi = new MyIdThread();
		System.out.println("myid thread "+mi.getId());
		
		System.out.println("priority "+Thread.currentThread().getPriority());
		
		//Thread.currentThread().setPriority(16);  Illegal argument exception
		
		//we cannot set id becoz it is unique mi.setId();
		
		System.out.println("main ended");
	}

}
