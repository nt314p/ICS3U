package com.bayviewglen.daytwo;

public class ExampleSix {

	public static void main(String[] args) {

		String[] words = { "Apple", "Pear", "Pears", "Almond" };
		String searchString = "Pears";

		int index = sequentialSearch(words, searchString);

		if (index >= 0)
			System.out.println("The value was located at index: " + index);
		else
			System.out.println("The value was not in the array.");

	}

	public static int sequentialSearch(String[] arr, String value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(value))
				return i;
		}
		return -1;

	}

}
