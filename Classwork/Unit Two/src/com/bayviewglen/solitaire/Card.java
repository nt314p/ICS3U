package com.bayviewglen.solitaire;

public class Card {
	private String suit;
	private String face;
	private String color;
	private boolean up = false;

	public Card(int cardNum) {
		int face = cardNum % 13 + 1;
		int suit = cardNum / 13;
		this.face = numToFace(face);
		this.suit = numToSuit(suit);
	}

	public String getCard() {
		if (Character.isLetter(this.face.charAt(0))) {
			return this.face + this.face + this.suit;
		}
		return String.format("%02d", Integer.parseInt(this.face)) + this.suit;

	}

	public void flip(boolean dir) {
		up = dir;
	}
	
	public boolean isFaceUp() {
		return up;
	}

	public String getColor(String face) {
		if (face.equals("C") || face.equals("S")) {
			return "B"; // card is black
		}
		return "R"; // card is red
	}

	public int getValue() {
		switch (this.face) {
		case "A":
			return 1;
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

}
