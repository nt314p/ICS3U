package com.bayviewglen.daythree;

import java.util.ArrayList;

public class SortingSearchingAlgorithms {

	public static void main(String[] args) {
		int[] x = createArray(15);//{170, 45, 75, 90, 02, 802, 2, 66};
		System.out.println("Created!");
		radixSort(x, 10);
		System.out.println("Sorted!");
		display(x);
				/*
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
		System.out.println("666 at index: " + binarySearch(x, 666));*/
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

		// insertion sort can be faster than merge sort when it the array is ALMOST
		// sorted

		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j;

			for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
				arr[j + 1] = arr[j];
			}

			arr[j + 1] = temp;
		}
	}

	public static void radixSort(int[] arr, int base) {
		int maxValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}

		int exponent = (int) Math.ceil(Math.log(maxValue) / Math.log(base));

		ArrayList<Integer>[] queue = new ArrayList[base];

		for (int exp = 0; exp < exponent; exp++) { // 
			
			for (int i = 0; i < queue.length; i++) {
				queue[i] = new ArrayList<Integer>();
			}
			
			for (int i = 0; i < arr.length; i++) { // which digit are we sorting, ex: base=2, digits are 0 and 1
				int digit = (int) (arr[i] / (Math.pow(base, exp)) % base);
				queue[digit].add(arr[i]);
			}

			int j = 0;
			for (int k = 0; k < queue.length; k++) {
				for (int l = 0; l < queue[k].size(); l++) {
					arr[j] = queue[k].get(l);
					j++;
				}
			}
			System.out.println("\nExponent: " + exp + ", Multiple: " + Math.pow(base, exp));
			display(queue);
			display(arr);
		}
	}

	public static void display(ArrayList<Integer>[] arr) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(j+": ");
			for (int i : arr[j]) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static int binarySearch(int[] arr, int value) {

		int leftIndex = 0; // left bound index
		int rightIndex = arr.length - 1; // right bound index

		while (leftIndex <= rightIndex) { // no left right bound overlapping
			int midIndex = leftIndex + (rightIndex - leftIndex) / 2;

			if (arr[midIndex] == value)
				return midIndex;

			if (arr[midIndex] < value) {
				leftIndex = midIndex + 1;
			} else {
				rightIndex = midIndex - 1;
			}
		}

		return -1;
	}

	public static int[] createArray(int size) {
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10000);
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
