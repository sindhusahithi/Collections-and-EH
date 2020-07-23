package com.Practise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateOverHashMap {

	public static void main(String[] args) {

		Map<String,Integer> map=new HashMap<String,Integer>();

		map.put("sahi", 24);
		map.put("sindhu", 25);
		map.put("vinni", 23);
		map.put("kandy", 26);
		
		
		System.out.println(map);
		
		//Iterating over the HashMap's entrySet using simple for-each loop ==="//
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+"=>"+entry.getValue());
			
			
			//using lamda expr//
			map.entrySet().forEach(entries->{
				System.out.println(entries.getKey()+"=>"+entries.getValue());
			}
			);
		}
	}

}
