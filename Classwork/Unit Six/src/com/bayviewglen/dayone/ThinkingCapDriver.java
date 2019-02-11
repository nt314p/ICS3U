package com.bayviewglen.dayone;

public class ThinkingCapDriver {

	public static void main(String[] args) {
		// ThinkingCap cap1 = new ThinkingCap(); // No longer work
		// ThinkingCap cap2 = new ThinkingCap(); // because the class
		// has its own constructor
		ThinkingCap cap1 = new ThinkingCap("red is cool", "green is vegimite");
		ThinkingCap cap2 = new ThinkingCap("red is not cool", "green is not vegimite", "blue is cool");
		ThinkingCap cap3 = new ThinkingCap();

		// cap1.insertGreen("I like green");
		// cap1.insertRed("I like red");
		// cap1.insertBlue("I like blue");

		// cap2.insertGreen("I don't like green");
		// cap2.insertRed("I don't like red");
		// cap2.insertBlue("I don't like blue");

		System.out.println(cap1.pushGreen());
		System.out.println(cap2.pushGreen());
		System.out.println(cap3.pushGreen());

		System.out.println(cap1.pushRed());
		System.out.println(cap2.pushRed());
		System.out.println(cap3.pushRed());

		System.out.println(cap1.pushBlue());
		System.out.println(cap2.pushBlue());
		System.out.println(cap3.pushBlue());
	}

}