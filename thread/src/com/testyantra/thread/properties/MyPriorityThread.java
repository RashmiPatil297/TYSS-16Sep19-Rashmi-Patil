package com.testyantra.thread.properties;

public class MyPriorityThread extends Thread {
	
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		int p = Thread.currentThread().getPriority();
		System.out.println("main thread priority "+p);
		                           
		Thread.currentThread().setPriority(7);
		System.out.println("main thread priority "+Thread.currentThread().getPriority());
		
		MyPriorityThread t = new MyPriorityThread();
		int q = t.getPriority();
		System.out.println("mypriority thread priority "+q);//JVM provides default priority as 5
		
		t.setPriority(6);
		System.out.println("mypriority thread priority "+t.getPriority());
		
		System.out.println("Main Ended");
	}

}
