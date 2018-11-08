package com.bayviewglen.solitaire;

import java.util.ArrayList;

public class Solitaire {

	public static void main(String[] args) {

		final int NUM_CARDS = 52;
		final int NUM_COLS = 7;
		final int MAX_STACK = 19;

		ArrayList<Card> deck = new ArrayList<Card>(NUM_CARDS);
		int[] numDeck = new int[NUM_CARDS];
		Card[][] playingField = new Card[NUM_COLS][MAX_STACK];

		for (int i = 0; i < NUM_CARDS; i++) {
			numDeck[i] = i;
		}

//		for (int i = 0; i < 100; i++) {
//			int index1 = (int)(Math.random()*NUM_CARDS);
//			int index2 = (int)(Math.random()*NUM_CARDS);
//			int temp = numDeck[index1];
//			numDeck[index1] = numDeck[index2];
//			numDeck[index2] = temp;
//		}

		for (int i = 0; i < NUM_CARDS; i++) {
			deck.add(i, new Card(i));
			// System.out.println(numDeck[i]);
			System.out.println(deck.get(i).getCard());
		}

		for (int i = 0; i < NUM_COLS; i++) {
			for (int j = 0; j < i + 1; j++) {
				boolean flip = (j == i - 1);
				playingField[i][j] = deck.get(i);
				playingField[i][j].flip(flip);
			}
		}
		
		
	}

}
