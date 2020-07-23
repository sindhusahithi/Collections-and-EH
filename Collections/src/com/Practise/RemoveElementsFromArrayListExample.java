package com.Practise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveElementsFromArrayListExample {

	public static void main(String[] args) {
		List<String> companies = new ArrayList<String>();
		companies.add("Google");
		companies.add("Wipro");
		companies.add("TechM");
		companies.add("xpress global");
		
		System.out.println("Initial List" +companies);
		
		/*
		 * companies.remove(2); System.out.println("After Remove:" +companies);
		 */
		/*
		 * List<String> excesscomp = new ArrayList<String>(); excesscomp.add("Tcs");
		 * excesscomp.add("Microsoft"); excesscomp.add("Dell");
		 * 
		 * companies.removeAll(excesscomp); System.out.println("After remove all"
		 * +excesscomp);
		 */

        // Remove if the element matches a given predicate

		 companies.removeIf(new Predicate<String>() {
	            @Override
	            public boolean test(String s) {
	                return s.startsWith("D");
	            }
	        });

	        /*
	            The above removeIf() call can also be written using lambda expression like this -
	            programmingLanguages.removeIf(s -> s.startsWith("C"))
	        */

	        System.out.println("After Removing all elements that start with \"D\": " + companies);
	
		

	}
}
