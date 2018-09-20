package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		double n = reader.nextDouble();
		
		System.out.println("The square of " + n + " is " + n*n);
		
		reader.close();
	}

}
