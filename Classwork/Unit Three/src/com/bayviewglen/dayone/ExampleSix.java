package com.bayviewglen.dayone;

public class ExampleSix {

	public static void main(String[] args) {

		int arr[] = { 3, 5, 6, 10, -2, 11 };

		int max = maxValue(arr);

		System.out.println("Max value of array is: " + max);
	}

	public static int maxValue(int[] arr) {
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

}
