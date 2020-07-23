package com.Practise;

import java.util.HashSet;
import java.util.Set;

public class HashSetSimpleOperationsExample {

	public static void main(String[] args) {
		
		Set<String> set=new HashSet<String>();
		set.add("sahithi");
		set.add("Sindhu");
		set.add("Sravanth");
		set.add("Naidu");
		//Is Empty//
		
		System.out.println("Checking Empty r not:" +set.isEmpty());
		
		//Size//
		System.out.println("Checking Size:" +set.size());
		
		//Contains key//
		String name = "Sravanth";
        if(set.contains(name)) {
            System.out.println(name + " Print if exists set.");
        } else {
            System.out.println(name + " Print if not exists");
        }
	}

}
