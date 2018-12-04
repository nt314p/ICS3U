package com.bayviewglen.daythree;

public class SortingSearchingAlgorithms {

	public static void main(String[] args) {
		int[] x = createArray(10);
		display(x);
		selectionSort(x);
		display(x);
		
		System.out.println();
		x = createArray(10);
		display(x);
		insertionSort(x);
		display(x);
		
		x = createArray(100000);

		insertionSort(x);
		System.out.println("\nArray sorted.");

		
		// display(x);
		System.out.println("666 at index: " + binarySearch(x, 666));
	}

	public static void selectionSort(int[] arr) {
		// selection sort of worse than insertion sort
		// backwards array selection sort is faster than insertion sort

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j])
					minIndex = j;
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	public static void insertionSort(int[] arr) {
		
		// insertion sort can be faster than merge sort when it the array is ALMOST sorted
		
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j;
			
			for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
				arr[j + 1] = arr[j];
			}
			
			arr[j+1] = temp;
		}
	}

	public static int binarySearch(int[] arr, int value) {
		
		int leftIndex = 0; // left bound index
		int rightIndex = arr.length-1; // right bound index
		
		while (leftIndex <= rightIndex) { // no left right bound overlapping
			int midIndex = leftIndex + (rightIndex-leftIndex)/2;
			
			if (arr[midIndex] == value)
				return midIndex;
			
			if (arr[midIndex] < value) {
				leftIndex = midIndex + 1;
			} else {
				rightIndex = midIndex -1;
			}
		}
		
		return -1;
	}

	public static int[] createArray(int size) {
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100000);
		}

		return arr;
	}

	public static void display(int[] arr) {
		for (int a : arr) {
			System.out.printf("%2d ", a);
		}
		System.out.println();
	}

}
