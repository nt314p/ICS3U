package com.bayviewglen.daythree;

public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for (initialization of counter; condition; increment) {
		 *   code to run
		 * }
		 * 
		 * 1. int i = 0; initializing the counter
		 * 2. i < 10; condition, continue while it evaluates to true
		 * 3. i++; how we are going to increment our counter
		 * 4. System.out.println(i); body code
		 * 
		 * Execution order
		 * 1 initialize
		 * 2 condition
		 * 4 body
		 * 3 increment
		 * 2 condition
		 * 4 body
		 * 3 increment
		 */
		
		// prints 0 - 9
		for (int i = 0; i < 10; i++) {
			System.out.print(i + ", ");
		}
		
		System.out.println("\n");
		
		// prints even numbers from 0 - 9
		for (int i = 0; i < 10; i+=2) {
			System.out.print(i + ", ");
		}
		
		System.out.println("\n");
		
		// prints odd numbers from 0 - 9
		for (int i = 1; i < 10; i+=2) {
			System.out.print(i + ", ");
		}
		
		System.out.println("\n");
		
		/*
		 * while (condition) {
		 * 
		 * }
		 */
		
		int i = 0;
		while (i < 10) {
			System.out.print(i + ", ");
			i++;
		}
	}

}
