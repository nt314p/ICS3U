package com.bayviewglen.dayfour;

import java.util.Scanner; // name of class is scanner, but the whole thing in fully qualified name

public class ExampleOne {
	
	/* 
	 * Declaring a scanner to read input from the keyboard.
	 * 
	 * reading integer data
	 * 
	 * prompt the user for three different integers and display the average
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x, y, z;
		
		System.out.print("Please enter three numbers: ");
		x = input.nextInt();
		y = input.nextInt();
		z = input.nextInt();
		
		double average = (x + y + z)/3.0;
		System.out.println("The average of the numbers is: "  + average);
		
		input.close();
	}

}
