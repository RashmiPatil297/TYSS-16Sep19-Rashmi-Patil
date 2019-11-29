package com.testyantra.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {
	
	public static void main(String[] args) {
		
		TreeMap<String, Integer> lh = new TreeMap<String, Integer>();
		lh.put("bangalore", 560068);
		lh.put("Hariyana", 134203);
		lh.put("patna", 88000);
	//	lh.put(null, 89000); NullPointerException
		
		for(Map.Entry<String, Integer> m : lh.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("key is "+key);
			System.out.println("value is "+value);
			System.out.println("============================");
		}
		
	}
}
