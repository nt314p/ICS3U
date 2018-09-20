package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("What is the mass of the object (kg)?");
		double m = reader.nextDouble();
		
		System.out.println("What is the velocity of the object (m/s)?");
		double v = reader.nextDouble();
		
		double momentum = m * v;
		
		System.out.println("An object with a mass of " 
				+ m + "kg and a velocity of " + v + "m/s has a momentum of " + momentum + "kg*m/s");
		
		reader.close();
	}

}
