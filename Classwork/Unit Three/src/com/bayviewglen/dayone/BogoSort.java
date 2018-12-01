package com.bayviewglen.dayone;

public class BogoSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;

		for (int len = 2; len < 20; len++) {
			int[] arr = new int[len];

			for (int i = 0; i < len; i++) {
				arr[i] = (int) (Math.random() * 2 * Integer.MAX_VALUE + Integer.MIN_VALUE);
			}

			long startTime = System.nanoTime();
			while (!isSorted(arr)) {
				// printArr(arr);
				sortBogo(arr);
				count++;
			}

			long endTime = System.nanoTime();
			long duration = (endTime - startTime); // in nanoseconds

			System.out.println("\nArray of length " + len + " sorted!");
			printArr(arr);
			System.out.println("Took " + count + " swaps.");
			System.out.println("Took " + (duration / 1000000.0) + "ms");
		}
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1) {
				System.out.print(", ");
			} else {
				System.out.println();
			}
		}
	}

	public static void sortBogo(int[] arr) {
		int index1 = (int) (Math.random() * arr.length);
		int index2 = (int) (Math.random() * arr.length);
		int tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}

	public static boolean isSorted(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (!(arr[i - 1] <= arr[i]))
				return false;
		}
		return true;
	}

}
