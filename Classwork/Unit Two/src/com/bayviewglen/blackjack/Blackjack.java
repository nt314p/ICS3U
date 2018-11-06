package com.bayviewglen.blackjack;

import java.util.Scanner;

public class Blackjack {

	private static final int NUM_SUITS = 4;
	private static final int NUM_FACES = 13;
	private static final int BLACKJACK = 21;
	private static final int MIN_BET = 5;
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numAces = 0;
		String playerHand = "";
		int playerHandValueLowAce = 0;
		int playerHandValue = 0;
		int playerWallet = 500;
		int playerBet = getPlayerBet(playerWallet);
		

		for (int i = 0; i < 2; i++) {
			String card = getCard();
			playerHand += card + " ";

			if (isAce(card)) {
				numAces++;
			}
			playerHandValueLowAce = updateHandValueLowAce(playerHandValueLowAce, card);
			playerHandValue = updateHandValue(playerHandValueLowAce, numAces);

		}
		System.out.println(playerHand);
		System.out.println("Number of aces: " + numAces);
		System.out.println("Total with aces as 1: " + playerHandValueLowAce);
		System.out.println("Total: " + playerHandValue);
	}

	public static int getPlayerBet(int playerWallet) {
		boolean validInput = false;
		int playerBet = 0;
		System.out.print("Player, how much would you like to bet (" + MIN_BET + " - " + playerWallet + "): ");

		while (!validInput) {
			try {
				playerBet = Integer.parseInt(reader.nextLine());
				if (playerBet >= MIN_BET && playerBet <= playerWallet)
					validInput = true;
			} catch (Exception e) {

			}
			System.out.println();
			if (!validInput)
				System.out.print("Please enter a bet from " + MIN_BET + " to " + playerWallet + ": ");

		}
		return playerBet;
	}

	public static String getCard() {
		return getFace() + getSuit();
	}

	public static String getFace() {
		int x = (int) (Math.random() * (NUM_FACES)) + 2;
		switch (x) {
		case 11:
			return "J";
		case 12:
			return "Q";
		case 13:
			return "K";
		case 14:
			return "A";
		default:
			return "" + x;
		}
	}

	public static String getSuit() {
		switch ((int) (Math.random() * NUM_SUITS)) {
		case 0:
			return "H";
		case 1:
			return "C";
		case 2:
			return "D";
		case 3:
			return "S";
		default:
			return "ERROR";
		}
	}

	public static boolean isAce(String card) {
		return card.charAt(0) == 'A';
	}

	public static int getCardValueLowAce(String card) {
		String face = getCardFace(card);
		if (Character.isLetter(face.charAt(0))) {
			if (face.charAt(0) == 'A')
				return 1;
			return 10;
		}
		return Integer.parseInt(face);
	}

	public static int updateHandValueLowAce(int playerHandValue, String newCard) {
		return playerHandValue + getCardValueLowAce(newCard);
	}

	public static int updateHandValue(int playerHandValue, int numAces) {
		int total = playerHandValue;
		while (total + 10 <= BLACKJACK && numAces > 0) {
			total += 10;
			numAces--;
		}
		return total;
	}

	public static String getCardFace(String card) {
		return card.substring(0, card.length() - 1);
	}

}
