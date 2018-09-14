package com.bayviewglen.dayfour;

import java.util.Scanner;

public class ExampleThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);


		int num = 0;
		
		/*
		if (num < 100 || num > 999) {
			in.close();
			throw new IllegalArgumentException("Number must be 3 digits");
		}*/
		
		while (num < 100 || num > 999) {
			System.out.print("Please enter a three digit number: ");
			num = in.nextInt();
		}
		
		int digit1 = num / 100;
		int digit3 = num % 10;
		int digit2 = num / 10 % 10;

		int sum = digit1 + digit2 + digit3;
		System.out.println("The sum of the digits is: " + sum);
		
		in.close();
	}

}
