package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("What is the temp in degrees Fahrenheit?");
		double ftemp = reader.nextDouble();
		
		double ctemp = (ftemp - 32) * 5/9.0;
		
		System.out.printf("The temperature in Celcius is %4.2f degrees", ctemp);
		
		reader.close();
	}

}
