package com.Practise;

import java.util.HashMap;
import java.util.Map;

public class AccessKeysFromHashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("sahi", 24);
		map.put("sindhu", 25);
		map.put("vinni", 23);
		map.put("kandy", 26);
		
		System.out.println(map);

		// Check if Hashmap is empty//
		System.out.println("Result:" + map.isEmpty());
		
		//Size of hash map//
		System.out.println("Size of hashmap: " +map.size());
		
		//check if key exists r not//
		String key="sindhu";
		if(map.containsKey(key)) {
			Integer result=map.get(key);
			System.out.println(key+"Result" +result);
		}else {
			System.out.println("Result not found");
		}
		
		//check value exists r not//
		int value=30;
		if(map.containsValue(value)) {
			Integer results=map.get(value);
			System.out.println(value+"Result" +results);
		}else {
			System.out.println("Not found");
			

	}

	//Modification of values//
	map.put(key,22);
	System.out.println(key+"Modified Result"+map.get(key)+",Final Result:"+map);
	}

}
