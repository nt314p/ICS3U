package com.bayviewglen.dayfour;

public class SortingSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 14, 16, 29, 30 };
		int[] b = { -1, 4, 7, 19, 23, 35, 84 };
		display(a);
		display(b);
		System.out.println("Merged:");
		int[] c = merge(a, b);
		display(c);
		System.out.println();

		int[] d = { 15, 10, 2, 8, 28, 21 };
		int[] e = { 24, 5, 3, 12, 13, 17 };
		

		System.out.println("\nSelection Sort");
		display(d);
		System.out.println("Sorted:");
		selectionSort(d);
		display(d);

		System.out.println("\nInsertion Sort");
		display(e);
		System.out.println("Sorted:");
		selectionSort(e);
		display(e);
		
		System.out.println("Binary Search for 8 at index: " + binarySearch(d, 8));
		System.out.println("Binary Search for 7 at index: " + binarySearch(d, 7));
		
		System.out.println("Sequential Search for 8 at index: " + sequentialSearch(d, 8));
		System.out.println("Sequential Search for 7 at index: " + sequentialSearch(d, 7));

	}

	public static int sequentialSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target)
				return i;
		}
		return -1;
	}

	public static int binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length;
		while (low <= high) {
			int middle = (low + high) / 2;
			if (arr[middle] == target) {
				return middle;
			} 
			if (arr[middle] < target) {
				low = middle + 1;
			} 
			if (arr[middle] > target) {
				high = middle - 1;
			}
		}
		return -1;
	}

	public static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j;
			int temp = arr[i];
			for (j = i - 1; j >= 0 && temp > arr[j]; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
		}
	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int[] ret = new int[arr1.length + arr2.length];
		int j = 0;
		int k = 0;
		for (int i = 0; i < ret.length; i++) {
			if (j >= arr1.length) {
				ret[i] = arr2[k];
				k++;
			} else if(k >= arr2.length) {
				ret[i] = arr1[j];
				j++;
			} else if(arr1[j] <= arr2[k]) {
				ret[i] = arr1[j];
				j++;
			} else if (arr1[j] > arr2[k]) {
				ret[i] = arr2[k];
				k++;
			}
		}
		return ret;
	}

	public static int[] createArray(int size) {
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
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
