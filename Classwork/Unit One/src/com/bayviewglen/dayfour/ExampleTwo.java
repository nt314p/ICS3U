package com.bayviewglen.dayfour;

import java.util.Scanner;

public class ExampleTwo {
	
	// calculating surface area of the box

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		double surfaceArea;
		
		System.out.println("Enter length: ");
		double l = reader.nextDouble();
		
		System.out.println("\nEnter width: ");
		double w = reader.nextDouble();
		
		System.out.println("\nEnter height: ");
		double h = reader.nextDouble();
		
		surfaceArea = (l*h + l*w + w*h)*2;
		System.out.println("\nThe surface area is: " + surfaceArea);

		reader.close();
	}

}
