package com.bayviewglen.daytwo;

public class ExampleFive {

	public static void main(String[] args) {

		String[] words = { "Apple", "Pear", "Pear", "Almond" };

		int maxIndex = getMaxWordIndex(words, true);

		System.out.println("The word the largest value is " + words[maxIndex] + " at index " + maxIndex);
	}

	public static int getMaxWordIndex(String[] words, boolean getFirstOccurance) {
		int maxIndex = 0;

		for (int i = 1; i < words.length; i++) {
			if (getFirstOccurance) {
				if (words[i].compareTo(words[maxIndex]) > 0) {
					maxIndex = i;
				} 
			} else {
				if (words[i].compareTo(words[maxIndex]) >= 0) {
					maxIndex = i;
				}
			}
		}
		return maxIndex;
	}

}
