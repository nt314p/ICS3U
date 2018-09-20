package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		final int MINS_IN_HOUR = 60;
		final int HOURS_IN_DAY = 24;
		final int DAYS_IN_YEAR = 365;
		
		int minsInAYear = MINS_IN_HOUR * HOURS_IN_DAY * DAYS_IN_YEAR;
		
		System.out.println("Finding minutes in how many years?");
		int years = reader.nextInt();
		
		System.out.println("The number of minutes in " + years + " years is: " + minsInAYear*years);
		
		reader.close();
	}

}
