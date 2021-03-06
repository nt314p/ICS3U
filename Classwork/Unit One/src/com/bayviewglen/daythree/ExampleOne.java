package com.bayviewglen.daythree;

public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// integer division
		int x = 100; // = assignment operator
		int y = 3;

		System.out.println(x / y); // outputs 2 because int/int is an int
		System.out.println(x % y); // outputs 1 because remainder of 7/3 is 1

		if (x % 2 == 0) { // don't need to know if statements
			System.out.println(x + " is EVEN"); // tells us if the number is even or odd
		} else {
			System.out.println(x + " is ODD");
		}
		
		if (x % 4 == 0) {
			System.out.println(x + " is divisible by 4");
		} else {
			System.out.println(x + " is not divisible by 4");
		}
		
		int counter = 1;
		
		while(counter <= 1000) {
			counter++;
			if (counter % 25 == 0) {
				System.out.println(counter + ": This only happens every 25 iterations");
			}
		}

	}

}
