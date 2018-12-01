package com.bayviewglen.daytwo;

public class ExampleEight {

	public static void main(String[] args) {
		String[] arr = { "Apple", "Pear", "Pears", "Almond" };

		for (String s : arr) {
			System.out.println(s);
		}

		System.out.println();

		for (String s : arr) {
			s = s.substring(0, 2); // local variable modified, not actual variable
		}

		for (String s : arr) {
			System.out.println(s);
		}
	}

}
