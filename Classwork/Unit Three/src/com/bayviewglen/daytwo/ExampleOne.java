package com.bayviewglen.daytwo;

public class ExampleOne {

	public static void main(String[] args) {

		String[] arr = new String[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}

		System.out.println();

		arr[0] = "Apple";
		arr[1] = "Apple";
		arr[2] = "Grapes";
		// we ignore arr[3] so its value is null
		arr[4] = new String("Apple");

		System.out.println(arr[0] == arr[1]); // true
		System.out.println(arr[0] == arr[4]); // false
		System.out.println(arr[0].equals(arr[4])); // true

		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}
	}

}
