package com.bayviewglen.threecardpoker;

import java.util.ArrayList;

public class Hand {
	private int size = 0;
	private Card[] cards;
	
	public Hand (int size) {
		this.size = size;
		cards = new Card[this.size];
	}
	
	public Card[] getCards () {
		return cards;
	}
	
	public void drawCard (ArrayList<Card> deck) {
		if (deck.size()==0) {
			System.out.println("ERROR");
		} else {
			for (int i = 0; i < size; i++) {
				if (cards[i] == null) {
					cards[i] = deck.get(0);
					deck.remove(0);
					i=10; // exiting loop
				}
			}
		}
		
	}

}
