package com.bayviewglen.daytwo;

public class ExampleThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int y = 2;
		
		System.out.println(x + y + " are my values!"); // adds x and y
		System.out.println("" + x + y + " are my values!"); // concatenates "" to x
		System.out.println(x + "" + y + " are my values!"); // concatenates x to ""
		System.out.println(x + (y + " are my values!")); // BEDMAS applies
	}

}
