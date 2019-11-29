package com.testyantra.maps;

import java.util.HashMap;

public class TestB {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("kuku",89999);
		hm.put("mala",78900);
		hm.put("sheela",89900);
		
		HashMap hm1 = new HashMap();
		hm1.put("deepu",789090);
		hm1.put("riya",678909);
		hm1.put("kriti",467787);
		
		boolean hashKey = hm.containsKey("mala");
		System.out.println("has key "+hashKey);
		
		boolean hashValue = hm.containsValue(78900);
		System.out.println("has value "+hashValue);
		
		hm.putAll(hm1);
		System.out.println("after put all "+hm);
		
		System.out.println("size of hm = "+hm.size());
		
		boolean isEmpty = hm.isEmpty();
		System.out.println("Map is Empty "+isEmpty);
		
		hm.clear();
		System.out.println("after clear "+hm);
	
		
		

	}

}
