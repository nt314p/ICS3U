package com.bayviewglen.dayfour;

public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 7;
		int y = 3;
		int z = 5;
		
		boolean a = x > 10;
		boolean b = y < 10;
		boolean c = z >= 2;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a&&(b||c));
		System.out.println((a&&b)||(a&&c));
		
		// A(B+C) = AB + AC
		// && is like multiplication
		// || is like addition
		
		
	}

}
