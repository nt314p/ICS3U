package com.bayviewglen.daythree;

public class ExampleThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ints x, y; // no type of ints
		
		//int x = 7;
		//int y = x/0; // runtime error: division by 0
		
		int radius = 3;
		double areaOfCircle = Math.PI * 2 * radius; // logic error (should be PI*r^2)
		
		System.out.println("LOGICAL ERROR: area of circle is not actually " + areaOfCircle);
		
	}
	

}
