package com.Practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEntryKeySetValuesExample {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();

		map.put("sahi", 24);
		map.put("sindhu", 25);
		map.put("vinni", 23);
		map.put("kandy", 26);
		
		//Entry set//
		
		Set<Map.Entry<String,Integer>> entries=map.entrySet();
		System.out.println("Map entries:" +entries);
	}

}
