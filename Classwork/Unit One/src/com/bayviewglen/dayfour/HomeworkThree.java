package com.bayviewglen.dayfour;

import java.util.Scanner;

public class HomeworkThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter a five digit number:");
		int num = reader.nextInt();
		int digit4 = num / 10 % 10;
		int digit2 = num / 1000 % 10;

		System.out.println("The product of the 2nd and 4th digit is: " + digit2 * digit4);
		
		reader.close();
	}

}
