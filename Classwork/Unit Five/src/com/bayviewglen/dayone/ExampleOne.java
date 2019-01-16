package com.bayviewglen.dayone;

import java.util.ArrayList;

public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ints = new ArrayList<Integer>();
		
		System.out.println("Size: " + ints.size()); // prints the size of the array
		
		
		// adds values to the end
		ints.add(7);
		ints.add(10);
		ints.add(-6);
		
		System.out.println(ints);
		
		System.out.println("Size: " + ints.size());  
	}

}
