package com.bayviewglen.threecardpoker;

import java.util.ArrayList;
import java.util.Arrays;

public class Hand {
	private int size = 0;
	public Card[] cards;

	private static final int STRAIGHT_FLUSH = 40;
	private static final int THREE_OF_A_KIND = 30;
	private static final int STRAIGHT = 6;
	private static final int FLUSH = 3;
	private static final int PAIR = 1;
	private static final int HIGH_CARD = 0;

	public Hand(int size) {
		this.size = size;
		cards = new Card[this.size];
	}

	public Card[] getCards() {
		return cards;
	}

	public void sortHand() {
		Arrays.sort(cards);
	}

	public String getStringHand() {
		String strHand = "";
		Card[] cards = getCards();
		for (int i = 0; i < cards.length; i++) {
			strHand += cards[i].getCard() + " ";
		}
		return strHand;
	}

	public int getHandPayout() {
		if (isStraightFlush())
			return STRAIGHT_FLUSH;
		else if (isThreeOfAKind())
			return THREE_OF_A_KIND;
		else if (isStraight())
			return STRAIGHT;
		else if (isFlush())
			return FLUSH;
		else if (isPair())
			return PAIR;
		else
			return HIGH_CARD;
	}

	public String getHandType() {
		System.out.println(isFlush());

		if (isStraightFlush())
			return "Straight Flush";
		else if (isThreeOfAKind())
			return "Three of a Kind";
		else if (isStraight())
			return "Straight";
		else if (isFlush())
			return "Flush";
		else if (isPair())
			return "Pair";
		else
			return "High card: " + getHighCard().getCard();
	}

	public Card getHighCard() {
		sortHand();
		return cards[0]; // returning the first card (high card after sorting)
	}

	public boolean isStraightFlush() {
		return isStraight() && isFlush();
	}

	public boolean isThreeOfAKind() {
		int faceVal = 0;
		for (Card c : cards) {
			if (faceVal == 0) {
				faceVal = c.getValue();
			} else if (faceVal != c.getValue()) {
				return false;
			}
		}
		return true;
	}

	public boolean isStraight() {
		for (int i = 0; i < cards.length - 1; i++) {
			if (cards[i].getValue() - cards[i + 1].getValue() != 1)
				return false;
		}
		return true;
	}

	public boolean isFlush() {
		String suit = "";
		for (int i = 0; i < cards.length; i++) {
			String currCardSuit = cards[i].getSuit();
			if (suit.equals("")) {
				suit = currCardSuit;
			} else if (!(suit.equals(currCardSuit))) {
				return false;
			}
		}
		return true;
	}

	public boolean isPair() {
		for (int i = 0; i < cards.length - 1; i++) {
			for (int j = i+1; j < cards.length; j++) {
				if (cards[i].getValue() == cards[j].getValue())
					return true;
			}
		}
		return false;
	}

	public void drawCard(ArrayList<Card> deck) {
		if (deck.size() == 0) {
			System.out.println("No more cards to draw.");
		} else {
			for (int i = 0; i < size; i++) {
				if (cards[i] == null) {
					cards[i] = deck.get(0);
					deck.remove(0);
					break;
				}
			}
		}

	}

}
