package com.bayviewglen.daythree;

import java.util.Scanner;

public class ExampleTwo {

	/*
	 * Asks for numbers as long as the input is even and adds them to a sum Stops if
	 * input is odd
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while loop: useful for when you don't know the # of times to repeat
		Scanner reader = new Scanner(System.in);

		boolean isDone = false;
		int sum = 0;

//		while (!isDone) {
//			System.out.print("Enter a number:");
//			int tmp = reader.nextInt();
//			if (tmp % 2 == 0) {
//				sum += tmp;
//			} else {
//				isDone = true;
//			}
//		}

		// dumb for loop
		for (;isDone;) {
			System.out.print("Enter a number:");
			int tmp = reader.nextInt();
			if (tmp % 2 == 0) {
				sum += tmp;
			} else {
				isDone = true;
			}
		}

		System.out.println("\nThe sum is:" + sum);

		reader.close();
	}

}
