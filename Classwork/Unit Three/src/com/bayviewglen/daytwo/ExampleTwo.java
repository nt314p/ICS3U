package com.bayviewglen.daytwo;

public class ExampleTwo {

	public static void main(String[] args) {

		String[] arr = { "Apple", "Pear", "Grape", "Almond" };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}

		System.out.println();

		arr = new String[3];

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}

	}

}
