package com.Practise;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFromCollection {

	public static void main(String[] args) {
		List<Integer> Tenprimes = new ArrayList<Integer>();
		Tenprimes.add(12);
		Tenprimes.add(6);
		Tenprimes.add(21);
		Tenprimes.add(24);
		Tenprimes.add(16);
		
		List<Integer> Firstfiveprimes=new ArrayList<>(Tenprimes);
		Firstfiveprimes.add(24);
		Firstfiveprimes.add(27);
		Firstfiveprimes.add(14);
		Firstfiveprimes.add(23);
		Firstfiveprimes.add(25);
		
		Firstfiveprimes.addAll(Tenprimes);
		System.out.println(Firstfiveprimes);
	}

}
