package com.bayviewglen.dayfour;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		exampleOne();
		exampleTwo();
		exampleThree(2, 8);
		exampleFour();
		exampleFive();
	}

	public static void exampleFive() {
		int[][] arr2D = new int[4][];

		for (int i = 0; i < arr2D.length; i++) {
			arr2D[i] = new int[] { 1, 2, 6, 9 }; // :|
			// arr2D[i] = { 1, 2, 6, 9 }; // :(
		}

		display(arr2D);

		int sum = sum2DArray(arr2D);

		System.out.println("The sum of the elements in the 2D Array is " + sum);
		System.out.println();

	}

	public static void exampleFour() {
		int[][] arr2D = { { 0, 2, 3, 4 }, { 4, 3, 12, 56, 21 }, { 0, 0, 2, 3, 4, 5, 6, 7, 7, 6 } };

		display(arr2D);

		int sum = sum2DArray(arr2D);

		System.out.println("The sum of the elements in the 2D Array is " + sum);
		System.out.println();
	}

	public static void exampleThree(int numRows, int numCols) {
		int[][] arr2D = new int[numRows][numCols];

		populate(arr2D);

		display(arr2D);

		int sum = sum2DArray(arr2D);

		System.out.println("The sum of the elements in the 2D Array is " + sum);
		System.out.println();
	}

	public static void exampleTwo() {

		int[][] arr2D = new int[4][];

		for (int i = 0; i < arr2D.length; i++) {
			arr2D[i] = new int[i + 1];
		}

		display(arr2D);
		arr2D[2] = new int[10];
		display(arr2D);

		int sum = sum2DArray(arr2D);

		System.out.println("The sum of the elements in the 2D Array is " + sum);
		System.out.println();
	}

	public static void exampleOne() {
		int[][] arr2D = new int[4][6]; // new int[rows][cols] = 4 rows and 6 columns

		populate(arr2D);

		display(arr2D);

		int sum = sum2DArray(arr2D);

		System.out.println("The sum of the elements in the 2D Array is " + sum);
		System.out.println();
	}

	public static int sum2DArray(int[][] arr2D) {
		int sum = 0;
		for (int i = 0; i < arr2D.length; i++) { // rows
			for (int j = 0; j < arr2D[i].length; j++) { // # of columns in row i
				sum += arr2D[i][j];
			}
		}
		return sum;
	}

	public static void populate(int[][] arr2D) {
		for (int i = 0; i < arr2D.length; i++) { // rows
			for (int j = 0; j < arr2D[i].length; j++) { // # of columns in row i
				arr2D[i][j] = i * arr2D[i].length + j;
			}
		}
	}

	public static void display(int[][] arr2D) {
		for (int i = 0; i < arr2D.length; i++) { // rows
			for (int j = 0; j < arr2D[i].length; j++) { // # of columns in row i
				System.out.printf("%4d", arr2D[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

}
