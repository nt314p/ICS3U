package com.bayviewglen.dayone;

public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String is a sequence of characters
		// (think a string of beads or sequence of beads on a String)

		// the variable str is just a reference
		String str = "This is a String";

		System.out.println("Length: " + str.length());

		// getting his (to index from index)
		System.out.println("Substring: " + str.substring(1, 4));
		
		// getting String (from index to end)
		System.out.println("Substring: " + str.substring(10));

		// returns -1 of the string isn't there
		System.out.println("Index of bat: " + str.indexOf("bat")); // looks for first occurrence
		
		// using compare
		System.out.println("hi".compareTo("hello"));
		System.out.println("hello".compareTo("hi"));

		// all letters have a number value assigned to it
		System.out.println('i'-'e');
		
		String a = new String("apple");
		String b = new String("apple");
		
		System.out.println(a == b); // the addresses are not the same BAD
		System.out.println(a.equals(b)); // checking the actual string value GOOD
		
		String c = "bear";
		String d = "bear";
		System.out.println(c == d); // true because the string literals have the same addresses
		
		c = "bears";
		System.out.println(c == d); // not equal since c changed
	}

}
