package com.bayviewglen.dayone;

public class ExampleFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[][][][] arr = new int[1000][1000][100][100];
		int arr[] = { 3, 5, 6, 10, -2, 11 };

		int sum = getSum(arr);
		
		System.out.println("Sum is: " + sum);
	}

	public static int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
