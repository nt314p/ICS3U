package com.bayviewglen.daysix;

public class ExampleOne {
	
	// looking at random numbers

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = Math.random(); // gives value of [0, 1)
		
		
		System.out.println(x);
		
		/*
		// [0, 10) 0 - 9 inclusive

		final int NUMS = 10;
		
		int[] frequency = new int[NUMS];
		
		for (int i = 0; i < 1000000; i++) {
			int y = (int) (Math.random()*NUMS); // remember parenthesis to multiply then add
			frequency[y]++;
		}
		
		for (int n : frequency) {
			System.out.println(n);
		}
		*/
		
		final int LOWER_BOUND = -10;
		final int UNIQUE_NUMS = 21;
		
		for (int i = 0; i < 500; i++) {
			int y = (int)(Math.random() * UNIQUE_NUMS) + LOWER_BOUND;
			
			System.out.println(y);
		}
		
	}

}
