package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		final double c = 3 * Math.pow(10, 8);
		final int SECS_IN_YEAR = 31536000;
		
		System.out.println("How far light travels in how many years?");
		double years = reader.nextDouble();
		
		double dist = c * SECS_IN_YEAR * years;
		
		System.out.println("Light travels " + dist + " m in " + years + " years!");
		
		reader.close();
		
	}

}
