package com.bayviewglen.dayfour;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the total test mark:");
		int totalMark = reader.nextInt();
		
		System.out.println("\nEnter the student's mark:");
		double studentMark = reader.nextDouble();
		
		double percentage = 100*studentMark/totalMark;
		percentage = Math.round(10*percentage)/10;
		
		System.out.println("The student's percentage is: " + percentage + "%");
		
		reader.close();
	}

}
