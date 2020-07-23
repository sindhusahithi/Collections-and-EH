package com.Practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(24, "Sahithi", 20000, 123));
		emp.add(new Employee(25, "Sindhu", 3000, 214));
		emp.add(new Employee(18, "Sravanth", 25000, 324));
		emp.add(new Employee(23, "Vinni", 50000, 234));
		emp.add(new Employee(26, "Phani", 45000, 354));

		System.out.println("emps list" + emp);

		// Sort by Age//

		emp.sort((Employee e1, Employee e2) -> e1.getAge() - e2.getAge());
		System.out.println("Sorting by Age:" + emp);
		//sorting by name//

		emp.sort((Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName()));
		System.out.println("Sorting by Name:" + emp);
		
		// Sort by Id//
		
		emp.sort((Employee e1,Employee e2)->e1.getId()-e2.getId());
        System.out.println("Sorting by Id:" +emp);
        
        //Sorting by Salary//
        
        emp.sort((Employee e1,Employee e2)->e1.getSalary()-e2.getSalary());
        System.out.println("Sorting by salary:" +emp);
	}

}
