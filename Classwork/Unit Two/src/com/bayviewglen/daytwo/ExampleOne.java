package com.bayviewglen.daytwo;

public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// printf is life
		int x = 317;

		System.out.println("The number is: " + x);
		System.out.printf("The number is: %d\n", x);

		int num1 = 10;
		int num2 = 19;
		int sum = num1 + num2;

		System.out.println(num1 + " + " + num2 + " = " + sum); // harder with println
		System.out.printf("%d + %d = %d\n", num1, num2, sum); // easier with printf

		int a = 212;
		System.out.printf("%10d\n", a); // gives a width of 10

		int b = -212;
		System.out.printf("%10d\n", b); // still has a width of 10

		int c = 212;
		System.out.printf("%+10d\n", c); // plus symbol shows + or -

		int d = -212;
		System.out.printf("%+10d\n", d); // shows a minus
		
		double i = 1.92597534;
		System.out.printf("%-10.2f\n", i); // width of 10, 2 decimal places (rounds)
		
		System.out.printf("%5s%d%5s\n", "", 6, "");
		
		int minutes = 11;
		double seconds = 34.2;
		System.out.printf("%3d:%.3f\n", minutes, seconds);
		
		String name = "Nicolas";
		System.out.printf("Hi, my name is %s\n", name);

	}

}
