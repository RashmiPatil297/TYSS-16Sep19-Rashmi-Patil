package com.testyantra.maps;

import java.util.HashMap;

public class HashMapTestA {
	
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("kuku",89999);
		hm.put("mala",78900);
		hm.put("sheela",89900);
		hm.put(null, 7890);
		hm.put(null, 9000);
		
		System.out.println("Data "+hm);
		
		hm.put("mala", 789899);
		System.out.println("after modify "+hm);

		hm.put("dimple",89999);
		System.out.println("after dimple "+hm);
		
		System.out.println("after null "+hm);
		System.out.println("====================================");
		System.out.println("after adding duplicates null");
		System.out.println(hm);
		Object phno = hm.get("leela");
		System.out.println("value "+phno);
		
		System.out.println("===================================");
		
		Object value = hm.remove("kuku");
		System.out.println("Value "+value);
		
		System.out.println("after remove "+hm);
		
	}

}
