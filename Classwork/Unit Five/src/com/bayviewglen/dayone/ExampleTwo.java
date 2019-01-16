package com.bayviewglen.dayone;

import java.util.ArrayList;

public class ExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> words = new ArrayList<String>();
		
		System.out.println("Size: " + words.size());
		
		words.add("Dog");
		words.add("Cat");
		words.add("Bird" + words.get(0));
		
		System.out.println(words);
		
		System.out.println("Size: " + words.size());		
	}

}
