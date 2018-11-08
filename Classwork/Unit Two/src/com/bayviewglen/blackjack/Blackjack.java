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

		int playerWallet = 500;
		boolean gameOver = false;

		while (!gameOver) {
			System.out.println();
			System.out.println("Player has $" + playerWallet);
			playerWallet += playerTurn(playerWallet);
			if (playerWallet < MIN_BET) {
				System.out.println("Player wallet less that minimum bet!");
				System.out.println("Player can no longer play!");
				gameOver = true;
			} else {
				gameOver = !getPlayAgain();
			}
		}

		// U STOPPED
	}

	public static int dealerTurn() {

		return 0;
	}

	public static int playerTurn(int playerWallet) {

		String playerHand = "";
		int playerHandValueLowAce = 0;
		int playerHandValue = 0;
		int numAces = 0;
		int playerBet = getPlayerBet(playerWallet);
		boolean hitMe = true;

		String dealerHand = "XX ";
		int dealerHandValueLowAce = 0;
		int dealerHandValue = 0;
		int dealerNumAces = 0;

		String dealerCard = getCard();
		dealerHand += dealerCard;

		if (isAce(dealerCard)) {
			dealerNumAces++;
		}

		dealerHandValueLowAce = updateHandValueLowAce(dealerHandValueLowAce, dealerCard);
		dealerHandValue = updateHandValue(dealerHandValueLowAce, dealerNumAces);

		for (int i = 0; i < 2; i++) { // player draws two cards
			String card = drawCard();
			playerHand += card + " ";

			if (isAce(card)) {
				numAces++;
			}

			playerHandValueLowAce = updateHandValueLowAce(playerHandValueLowAce, card);
			playerHandValue = updateHandValue(playerHandValueLowAce, numAces); // display player stats

		}

		displayPlayerHand(playerHand);
		// displayPlayerHandValue(playerHandValue);

		System.out.println("Dealer hand: " + dealerHand);

		boolean isPlayerDone = false;

		if (playerHandValue == BLACKJACK) {
			isPlayerDone = true;
			System.out.println("Blackjack!");
		}

		while (!isPlayerDone) {
			boolean playerHit = getPlayerHit();

			if (playerHit) {
				String card = drawCard();
				playerHand += card + " ";

				if (isAce(card)) {
					numAces++;
				}

				playerHandValueLowAce = updateHandValueLowAce(playerHandValueLowAce, card);
				playerHandValue = updateHandValue(playerHandValueLowAce, numAces);

				if (!isPlayerBusted(playerHandValue)) {
					displayPlayerHand(playerHand);
					// displayPlayerHandValue(playerHandValue);
				} else if (playerHandValue == BLACKJACK) {
					return playerBet;
				} else {
					System.out.println("Player busted!");
					return -playerBet;
				}
			} else {
				isPlayerDone = true;
			}

		}

		dealerHand = dealerCard + " ";

		while (dealerHandValue < 17) {
			String card = getCard();
			dealerHand += card + " ";

			if (isAce(card)) {
				dealerNumAces++;
			}

			dealerHandValueLowAce = updateHandValueLowAce(dealerHandValueLowAce, card);
			dealerHandValue = updateHandValue(dealerHandValueLowAce, dealerNumAces);
		}

		displayPlayerHand(playerHand);
		System.out.println("Dealer hand: " + dealerHand);

		// System.out.println("Dealer");
		System.out.println(); // DETERMINING WINNER
		if (playerHandValue > dealerHandValue && playerHandValue <= BLACKJACK) { // WIN
			System.out.println("Player beat the dealer!");
			return playerBet;
		} else if (dealerHandValue > BLACKJACK && !isPlayerBusted(playerHandValue)) { // DEALER BUST
			System.out.println("Dealer busted!");
			return playerBet;
		} else if (playerHandValue == dealerHandValue && !isPlayerBusted(playerHandValue)) { // TIE
			System.out.println("Player tied with dealer!");
			return 0;
		} else { // LOSS
			System.out.println("Player lost against the dealer!");
			return -playerBet;
		}
	}

	public static boolean getPlayAgain() {
		System.out.print("Would you like to play again? ");
		boolean validInput = false;
		boolean playAgain = false;
		while (!validInput) {
			String input = reader.nextLine().toLowerCase();
			if (input.equals("y")) {
				validInput = true;
				playAgain = true;
			} else if (input.equals("n")) {
				validInput = true;
				playAgain = false;
			} else {
				System.out.println();
				System.out.print("Please enter y or n: ");
			}
		}
		return playAgain;
	}

	public static String drawCard() {
		String card = getCard();
		displayCard(card);
		return card;
	}

	public static boolean isPlayerBusted(int playerHandValue) {
		return playerHandValue > 21;
	}

	public static void displayPlayerHandValue(int playerHandValue) {
		System.out.println("Player hand value: " + playerHandValue);
	}

	public static void displayPlayerHand(String playerHand) {
		System.out.println("Player hand: " + playerHand);
	}

	public static void displayCard(String card) {
		System.out.println("Player drew " + card);
	}

	public static boolean getPlayerHit() {
		System.out.print("Would you like to hit (1) or stand (2)? ");
		boolean validInput = false;
		boolean hit = false;
		while (!validInput) {
			String input = reader.nextLine().toLowerCase();
			if (input.equals("1")) {
				validInput = true;
				hit = true;
			} else if (input.equals("2")) {
				validInput = true;
				hit = false;
			} else {
				System.out.println();
				System.out.print("Please enter 1 (hit) or 2 (stand): ");
			}
		}
		return hit;
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
