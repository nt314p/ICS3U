package com.bayviewglen.dayfour;

import java.util.Scanner;

public class HomeworkFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter inital velocity:");
		double vi = reader.nextDouble();
		System.out.println("Enter acceleration:");
		double a = reader.nextDouble();
		System.out.println("Enter time elapsed:");
		double t = reader.nextDouble();

		double vf = vi + a * t;

		System.out.println("The final velocity is: " + vf);

		reader.close();
	}

}
