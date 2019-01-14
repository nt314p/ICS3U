package com.bayviewglen.daytwo;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {2, 3, 5, 10, 14, 17, 20, 24, 122, 421, 4242};
		System.out.println(binarySearch(x, 5));
	}
	
	public static boolean binarySearch(int[] arr, int n) {
		
		int middle = arr.length/2;
		if (arr[middle] < n) {
			int[] tmp = new int[arr.length - (middle+1)];
			int j = 0;
			for (int i = middle + 1; i < arr.length; i++) {
				tmp[j] = arr[i];
				j++;
			}
			return binarySearch(tmp, n);
		}
		if (arr[middle] > n) {
			int[] tmp = new int[middle-1];
			int j = 0;
			for (int i = 0; i < middle-1; i++) {
				tmp[j] = arr[i];
				j++;
			}
			return binarySearch(tmp, n);
		}
		
		if (n == arr[middle]) {
			return true;
		}
		return false;
	}
}
