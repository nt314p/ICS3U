package com.bayviewglen.dayfive;

public class ExampleOne {

	// public static return type methodName(parameter list) {
	// code to run
	// }

	// methods perform a specific task
	// may or may not return a value
	public static int cube(int x) {
		return x * x * x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// public -> everybody can see it, refers to visibility
		// static -> one version of method, belongs to class
		String s1 = new String("Hello");
		s1.length(); // non-static method -> linked to an instance of a class

		Math.sqrt(10); // static method -> not linked to an instance of a class,
					   // just to the class

		int number = 3;
		int result = cube(number);
		System.out.println(result);
		
		int x = 10;
		System.out.println("1: " + x);
		mystery(x);
		System.out.println("4: " + x);
		
		Integer i = new Integer(10);
		System.out.println("1: " + i);
		mystery3(i);
		System.out.println("4: " + i);

	}

	public static void mystery(int x) {
		System.out.println("2: " + x);
		x++;
		System.out.println("3: " + x);
	}
	
	public static void mystery3(Integer i) {
		System.out.println("2: " + i);
		i++;
		System.out.println("3: " + i);
	}

}
