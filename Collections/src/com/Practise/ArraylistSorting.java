package com.Practise;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSorting {
	public static void main(String[] args) {

		ArrayList<String> companies = new ArrayList<String>();
		companies.add("Google");
		companies.add("Wipro");
		companies.add("TechM");
		companies.add("xpress global");

		System.out.println("Before Sorting");
		
			System.out.println(companies);

			Collections.sort(companies);

			System.out.println("After Sorting");
			for (String c1 : companies) {
				System.out.println(companies);
			}
		}

	
}
