package com.bayviewglen.dayfour;

import java.util.Arrays;

public class ArrayTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] x = new int[4][6];

		MultiDimensionalArray.populate(x);
		display(x);

		System.out.println();
		display(getColumn(x, 2));
	}

	public static int[] getColumn(int[][] arr2D, int c) {
		int[] col = new int[arr2D.length];

		for (int i = 0; i < col.length; i++) {
			col[i] = arr2D[i][c];
		}
		return col;
	}

	public static boolean isLatin(int[][] square) {
		if (!containsDuplicates(square[0])) {
			for (int i = 1; i < square.length; i++) {
				if (!hasAllValues(square[0], square[i]))
					return false;
			}
			for (int j = 0; j < square[0].length; j++) {
				if (!hasAllValues(square[0], getColumn(square, j)))
					return false;
			}
			return true;
		}
		return false;
	}

	public static boolean containsDuplicates(int[] row) {
		int[] r = Arrays.copyOf(row, row.length);
		Arrays.sort(r);
		for (int i = 0; i < r.length - 1; i++) {
			if (r[i] == r[i + 1])
				return true;
		}
		return false;
	}

	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		int[] a1 = Arrays.copyOf(arr1, arr1.length);
		int[] a2 = Arrays.copyOf(arr2, arr2.length);
		Arrays.sort(a1);
		Arrays.sort(a2);
		for (int i = 0; i < a1.length; i++) {
			if (!(a1[i] == a2[i])) {
				return false;
			}
		}
		return true;
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

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) { // rows
			System.out.printf("%4d", arr[i]);
		}
		System.out.println();
	}
}
