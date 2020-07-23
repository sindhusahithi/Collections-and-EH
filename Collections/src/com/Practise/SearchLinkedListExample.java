package com.Practise;

import java.util.LinkedList;

public class SearchLinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> emp=new LinkedList<>();
		emp.add("sahithi");
		emp.add("Sindhu");
		emp.add("Sravanth");
		emp.add("Naidu");
		
		System.out.println(emp);
		
		System.out.println("Result" +emp.contains("Sravanth"));
		
		System.out.println("First Occuurence:" +emp.indexOf("Sindhu"));
	}

}
