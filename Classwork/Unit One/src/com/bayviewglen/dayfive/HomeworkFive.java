package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("How many wins?");
		double wins = reader.nextInt();
		
		System.out.println("\nHow many losses?");
		int losses = reader.nextInt();
		
		double winRatio = (wins/(wins+losses));
		
		System.out.printf("\nThe win percentage is %5.3f%%", winRatio*100);
		
		reader.close();
	}

}
