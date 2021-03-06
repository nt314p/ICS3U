package com.bayviewglen.daythree;

public class ExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 21932;

		// get sum of individual digits

		int digit1 = num / 10000;
		int digit5 = num % 10;
		int digit2 = num / 1000 % 10; // 21932 / 1000 = 21, 21%10 = 1
		int digit3 = num / 100 % 10; // 21932 / 100 = 219, 219 % 10 = 9
		// OR
		// int digit3 = num % 1000 / 100 //21932 % 1000 = 958, 958 / 100 = 9

		int digit4 = num / 10 % 10; // 21932 / 10 = 2193, 2193 % 10 = 3

		int sum = digit1 + digit2 + digit3 + digit4 + digit5;
		System.out.println("The sum of the digits in " + num + " is " + sum);
	}

}
