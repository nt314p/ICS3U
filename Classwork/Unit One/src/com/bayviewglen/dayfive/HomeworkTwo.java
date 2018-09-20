package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("What is the length of the rectange?");
		double l = reader.nextDouble();
		
		System.out.println("\nWhat is the width of the rectangle?");
		double w = reader.nextDouble();
		
		System.out.printf("\nThe area is: %4.2f", (l*w));
		System.out.printf("\nThe perimeter is: %4.2f", (2*(l+w)));
		
		reader.close();
	}

}
