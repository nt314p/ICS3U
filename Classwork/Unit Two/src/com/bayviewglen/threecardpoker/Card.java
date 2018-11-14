package com.bayviewglen.threecardpoker;

public class Card {
	private String suit;
	private String face;
	private String color;
	private boolean faceUp = true;

	public Card(int cardNum) {
		int face = cardNum % 13 + 1;
		int suit = cardNum / 13;
		this.face = numToFace(face);
		this.suit = numToSuit(suit);
		if (this.face.equals("C") || this.face.equals("S")) {
			this.color = "B"; // card is black
		} else {
			this.color = "R"; // card is red
		}

	}

	public void setFaceUp(boolean isFaceUp) {
		faceUp = isFaceUp;
	}

	public boolean isFaceUp() {
		return faceUp;
	}

	public String getCard() {
		if (!faceUp)
			return "XXX";
		if (Character.isLetter(this.face.charAt(0))) {
			return this.face + this.face + this.suit;
		}
		return String.format("%02d", Integer.parseInt(this.face)) + this.suit;
	}

	public String getColor(String face) {
		return color;
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
