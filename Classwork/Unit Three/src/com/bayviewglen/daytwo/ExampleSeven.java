package com.bayviewglen.daytwo;

public class ExampleSeven {

	public static void main(String[] args) {

		int[] arr = { 3, 5, 6, 10, -2, 11 };

		for (int i : arr) {
			System.out.println(i);
		}

		System.out.println();

		for (int i : arr) {
			i++; // local variable modified, not actual variable
		}

		for (int i : arr) {
			System.out.println(i);
		}

	}
}
