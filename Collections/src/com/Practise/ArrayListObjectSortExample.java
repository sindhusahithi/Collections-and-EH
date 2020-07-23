package com.Practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListObjectSortExample {

	public static void main(String[] args) {

		List<Employee> person = new ArrayList<Employee>();
		person.add(new Employee(24, "Sahithi", 20000, 123));
		person.add(new Employee(25, "Sindhu", 3000, 214));
		person.add(new Employee(18, "Sravanth",25000,324));
		person.add(new Employee(23, "Vinni",50000,234));
		person.add(new Employee(26, "Phani",45000,354));
		
		System.out.println("Persons List:" +person);
		
		Collections.sort(person,Comparator.comparing(Employee::getAge));
		System.out.println("Sorting by Age:" +person);

	}

}
