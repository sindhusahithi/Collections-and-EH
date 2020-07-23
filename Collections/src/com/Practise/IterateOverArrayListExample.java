package com.Practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateOverArrayListExample {

	public static void main(String[] args) {
		List<String> companies = new ArrayList<String>();
		companies.add("Google");
		companies.add("Wipro");
		companies.add("TechM");
		companies.add("xpress global");

		// Iterate using Java 8 forEach and lambda//
		companies.forEach(company -> {
			System.out.println(companies);
		});

		// Iterate using an iterator()//
		Iterator<String> itr = companies.iterator();
		while (itr.hasNext()) {
			String company = itr.next();
			System.out.println(company);
		}
		
		//ForEach loop//
		for(String c:companies) {
			System.out.println(c);
		}
	}

}
