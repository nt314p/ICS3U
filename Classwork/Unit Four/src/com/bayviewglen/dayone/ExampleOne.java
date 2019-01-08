package com.bayviewglen.dayone;

public class ExampleOne {

	static int n = 40;
	static long[] solutions = new long[n + 1];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(factorial(7));
		System.out.println(fibonacci(n));
	}

	private static long fibonacci(int n) {
		// 1, 1, 2, 3, 5, 8, 13, 21
		// 1, 2, 3, 4, 5, 6, 7, 8

		if (n == 1 || n == 2) {
			return 1;
		} else if (solutions[n] != 0) {
			return solutions[n];
		} else {
			solutions[n] = fibonacci(n - 1) + fibonacci(n - 2);
			return solutions[n];
		}
	}

	private static int factorial(int n) {
		// 7! = 7*6*5*4*3*2*1
		// n! = n*(n-1)*(n-2)*...*3*2*1

		// 7! = 7 * 6!
		// n! = n * (n-1)!

		if (n == 1)
			return 1;

		return factorial(n - 1) * n;
	}

}
