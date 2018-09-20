package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Number of items sold?");
		int items = reader.nextInt();
		
		System.out.printf("The pay due is: $%5.2f", items * 0.27);
	
		reader.close();
	}

}
