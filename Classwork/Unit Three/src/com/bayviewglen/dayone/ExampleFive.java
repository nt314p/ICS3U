package com.bayviewglen.dayone;

public class ExampleFive {

	public static void main(String[] args) {
		
		int arr[] = { 3, 5, 6, 10, -2, 11 };
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}
		System.out.println();
		
		mystery(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}
	}

	public static void mystery(int[] arr) {
		arr[2] = 29;
	}

}
