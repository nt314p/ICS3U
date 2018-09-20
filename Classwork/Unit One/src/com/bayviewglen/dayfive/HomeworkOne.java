package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("What is the price of the computer?");
		double price = reader.nextDouble();
		System.out.printf("The total price of the computer is $%5.2f", (price*1.055));
		
		reader.close();
	}

}
