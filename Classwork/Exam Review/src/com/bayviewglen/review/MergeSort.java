package com.bayviewglen.review;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArr = { 2, 5, 12, 3, 8, 9, 4, 7, 10 };
		mergeSort(myArr);

		for (int n : myArr) {
			System.out.println(n);
		}
	}

	public static int[] mergeSort(int[] arr) {
		if (arr.length == 1)
			return arr;
		int middle = arr.length / 2;
		int[] a = new int[middle];
		int[] b = new int[arr.length - middle];
		int ai = 0;
		int bi = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i < middle)
				a[ai++] = arr[i];
			else
				b[bi++] = arr[i];
		}
		int[] aSort = mergeSort(a);
		int[] bSort = mergeSort(b);
		ai = 0;
		bi = 0;
		for (int i = 0; i < arr.length; i++) {
			if (ai >= aSort.length && bi < bSort.length)
				arr[i] = bSort[bi++];
			else if (bi >= bSort.length && ai < aSort.length)
				arr[i] = aSort[ai++];
			else if (aSort[ai] < bSort[bi])
				arr[i] = aSort[ai++];
			else if (bi < bSort.length)
				arr[i] = bSort[bi++];

		}
		return arr;
	}

}
