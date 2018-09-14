package com.bayviewglen.dayfour;

public class ExampleFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 7;
		System.out.println(x);
		/*
		System.out.println(x);
		x++;
		System.out.println(x);
		++x;
		System.out.println(x);
		*/

		/* adds one to x after the code runs
		System.out.println(x);
		System.out.println(x++);
		System.out.println(x);
		*/
		
		/* adds one to x before the code runs
		System.out.println(x);
		System.out.println(++x);
		System.out.println(x);
		*/
		
		/* prints 17
		int y = x++ + 10;
		System.out.println(y);
		*/
		
		/* prints 18
		int y = ++x + 10;
		System.out.println(y);
		*/
		
		x = x + 1; // equivalent
		x++; // equivalent
		x += 1; // equivalent
		
		x = x + 27;
		
		x += 27;
		x -= 27;
		x *= 27;
		x /= 27;
		x %= 27;
	}

}
