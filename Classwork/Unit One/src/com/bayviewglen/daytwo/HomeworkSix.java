package com.bayviewglen.daytwo;

public class HomeworkSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 2, b = 17, c = 4;
		
		double discriminant = b*b - 4*a*c;
		double first = (-b/(2*a));
		double last = Math.sqrt(discriminant)/(2*a);

		System.out.println(first + "\u00B1" + last);
		System.out.println("Root One: " + (first + last));
		System.out.println("Root Two: " + (first - last));
	}

}
