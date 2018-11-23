package com.bayviewglen.threecardpoker;

public class Card implements Comparable<Card>{
	private String suit;
	private String face;

	public Card(int cardNum) {
		int face = cardNum % 13 + 1;
		int suit = cardNum / 13;
		this.face = numToFace(face);
		this.suit = numToSuit(suit);
	}
	
	public Card(String card) {
		char face = card.charAt(1);
		if (face == '0') {
			this.face = "10";
		} else {
			this.face = face + "";
		}
		this.suit = card.charAt(2) + "";
	}
	
	@Override
	public int compareTo(Card anotherCard) {
		int a = anotherCard.getValue();
		int b = this.getValue();
		if (a > b)
			return +1;
		else if (a < b) 
			return -1;
		return 0;
	}

	public String getCard() {
		if (Character.isLetter(this.face.charAt(0))) {
			return this.face + this.face + this.suit;
		}
		return String.format("%02d", Integer.parseInt(this.face)) + this.suit;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public String getFace() {
		return face;
	}

	public int getValue() {
		switch (this.face) {
		case "A":
			return 14;
		case "K":
			return 13;
		case "Q":
			return 12;
		case "J":
			return 11;
		default:
			return Integer.parseInt(this.face);
		}
	}

	public String numToFace(int face) {
		switch (face) {
		case 1:
			return "A";
		case 11:
			return "J";
		case 12:
			return "Q";
		case 13:
			return "K";
		default:
			return "" + face; // card is 2 - 10
		}
	}

	public String numToSuit(int suit) {
		switch (suit) {
		case 0:
			return "C";
		case 1:
			return "D";
		case 2:
			return "H";
		case 3:
			return "S";
		default:
			return "ERROR";
		}
	}
	
	public String faceToFullName() { // gets the full name of the face
		switch (face) {
		case "A":
			return "Ace";
		case "J":
			return "Jack";
		case "Q":
			return "Queen";
		case "K":
			return "King";
		default:
			return "" + face; // card is 2 - 10
		}
	}
}
