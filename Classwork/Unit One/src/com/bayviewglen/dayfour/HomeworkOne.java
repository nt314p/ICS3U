package com.bayviewglen.dayfour;

import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		double num = reader.nextDouble();
		System.out.println("\nThe number is: " + num);
		System.out.println("The square of the number is: " + (num*num));
		
		reader.close();
	}

}
