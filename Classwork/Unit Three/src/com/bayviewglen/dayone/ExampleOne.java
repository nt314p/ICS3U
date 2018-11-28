package com.bayviewglen.dayone;

public class ExampleOne {

	public static void main(String[] args) {
		// An array stores a series of related values all of the same type

		// first specify type
		int[] arr = new int[5];
		// declared a reference to an integer array
		// constructs a new int array of size 5
		// assigns the variable arr to the new int array

		// to access the individual elements, we use []
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+ ": " + arr[i]);
		}
		
		System.out.println();
		
		arr[0] = 5;
		arr[1] = 2;
		arr[2] = 3;
		arr[4] = 10;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+ ": " + arr[i]);
		}
		
	}

}
