package com.bayviewglen.daythree;

public class ExampleFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfSides = 6; 
		
		final int NUMBER_OF_SIDES = 6;
		
		System.out.println("NUMBER_OF_SIDES is: " + NUMBER_OF_SIDES +". You cannot change this.");
		System.out.println("numOfSides is: " + numOfSides + ". You can change the value.");
		
		// NUMBER_OF_SIDES = 23; // you cannot assign another value to a final
		
		// you have 25 studentsand you want to get the average of their test scores.
		
		final int NUM_OF_STUDENTS = 25;
		int sumOfTestScores = 1978;
		
		double avgTestScores = sumOfTestScores / 24; // <- bad hardcoding (magic numbers)
		avgTestScores = sumOfTestScores / NUM_OF_STUDENTS; // <- good variable use
		System.out.println("Average test scores: " + avgTestScores);
	}

}
