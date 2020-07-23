package com.Practise;

import java.util.ArrayList;
import java.util.List;

public class SearchElementsInArrayListExample {
	public static void main(String[] args) {
		List<String> companies = new ArrayList<String>();
		companies.add("Google");
		companies.add("Wipro");
		companies.add("TechM");
		companies.add("xpress global");

		// Check if an ArrayList contains a given element//
		System.out.println("if contains:" + companies.contains("Google"));
		
		// Find the index of the first occurrence of an element in an ArrayList//
		System.out.println(companies.indexOf("Wipro"));
		System.out.println(companies.indexOf("Stigentech"));

	}

}
