package com.testyantra.sorting.list;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestJ {
	 
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(12);
		pq.add(24);
		pq.add(30);
		pq.add(35);
		pq.add(30);
		
		System.out.println("************using iterator**************");
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(pq.poll());
			
		}
	System.out.println("after poll "+pq);
	}
}
