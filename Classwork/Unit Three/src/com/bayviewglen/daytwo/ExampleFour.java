package com.bayviewglen.daytwo;

public class ExampleFour {

	public static void main(String[] args) {

		String[] arr = { "Apple", "Pear", "Grape", "Almond" };

		int totalChars = getTotalCharacters(arr);
		
		System.out.println("The total number of characters in array is: " + totalChars);
	}

	public static int getTotalCharacters(String[] arr) {
		int totalChars = 0;

		for (String s : arr) {
			totalChars += s.length();
		}

		return totalChars;
	}

}
