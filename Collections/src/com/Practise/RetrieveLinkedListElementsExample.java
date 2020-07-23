package com.Practise;

import java.util.LinkedList;

public class RetrieveLinkedListElementsExample {

	public static void main(String[] args) {
LinkedList<String> emp=new LinkedList<>();
emp.add("sahithi");
emp.add("Sindhu");
emp.add("Sravanth");
emp.add("Naidu");

System.out.println(emp);

String firstelement=emp.getFirst();
System.out.println("First Element:" +firstelement);

String lastelement=emp.getLast();
System.out.println("Lastelement:" +lastelement);

String employee=emp.get(0);
System.out.println("0 index:" +employee);
	}

}
