package com.bayviewglen.threecardpoker;

import java.util.ArrayList;

public class ThreeCardPoker {
	public static final int NUM_CARDS = 52;

	static ArrayList<Card> deck = new ArrayList<Card>(NUM_CARDS);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		shuffleDeck(deck);
		
		displayDeck(deck);

		Player p = new Player("HEY");
		for (int i = 0; i < 3; i++) {
			p.getHand().drawCard(deck);
			System.out.println("Drew a: " + p.getHand().getCards()[i].getCard());
		}
		
		displayDeck(deck);
		
		/*
		 * Check if wallet is less than min bet then stop the game
		 * 
		 * Set ante
		 * 
		 * Ask for pair plus 
		 * 
		 * Get the pair plus bet if they want it
		 * 
		 * 
		 */

	}
	
	public static void displayDeck(ArrayList<Card> deck) {
		for (int i = 0; i < deck.size(); i++) {
			System.out.println(deck.get(i).getCard());
		}
	}

	public static void shuffleDeck(ArrayList<Card> deck) {
		int[] numDeck = new int[NUM_CARDS]; // new integer array

		for (int i = 0; i < NUM_CARDS; i++) { // filling integer array with numbers from 0-51
			numDeck[i] = i;
		}

		for (int i = 0; i < 100; i++) { // mixing array up
			int index1 = (int) (Math.random() * NUM_CARDS);
			int index2 = (int) (Math.random() * NUM_CARDS);
			int temp = numDeck[index1];
			numDeck[index1] = numDeck[index2];
			numDeck[index2] = temp;
		}

		for (int i = 0; i < NUM_CARDS; i++) { // adding cards to the deck based on the integer array
			deck.add(i, new Card(numDeck[i]));
		}
	}

}
