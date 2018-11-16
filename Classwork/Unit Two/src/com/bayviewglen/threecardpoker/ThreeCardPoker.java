package com.bayviewglen.threecardpoker;

import java.util.ArrayList;
import java.util.Scanner;

public class ThreeCardPoker {
	public static final int NUM_CARDS = 52;
	public static final int MIN_ANTE = 50;
	public static final int MAX_ANTE = 100;
	public static final int MIN_PAIR_PLUS = 50;
	public static final int MAX_PAIR_PLUS = 100;
	public static final int INITIAL_WALLET = 1000;
	static Scanner in = new Scanner(System.in);

	static ArrayList<Card> deck = new ArrayList<Card>(NUM_CARDS);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean gameOver = false;

		shuffleDeck(deck);

		displayDeck(deck);

		Player p = new Player("URBOI", 1000);
		Hand dealerHand = new Hand(3);

		while (!gameOver) {
			if (!playerCanPlay(p)) // checking if the player can play
				break;

			p.setAnteWager(getInput("Please enter the ante wager", MIN_ANTE, MAX_ANTE)); // setting ante wager
			p.deductAnte();

			if (getInput("Do you want to place a pair plus wager", "Y", "N").equals("Y")) { // checking pair plus wager
				p.setPairPlusWager(getInput("Please enter the pair plus wager", MIN_PAIR_PLUS, MAX_PAIR_PLUS));
			} else {
				p.setPairPlusWager(0);
			}

			p.deductPairPlus();

			System.out.println();

			for (int i = 0; i < 3; i++) {
				p.getHand().drawCard(deck); // player draws card
				dealerHand.drawCard(deck); // dealer draws card
				System.out.println("Player drew a " + p.getHand().getCards()[i].getCard() + ".");
			}

			System.out.println();

			p.displayHand(); // should we sort the hand??
			System.out.println("Hand is a " + p.getHand().getHandType());

			if (getInput("Do you want to deal or fold", "D", "F").equals("F")) { // Checking for folding
				System.out.println("Player folded.");
				displayTurnStats(p);
				break; // <- remove after debugging
			} else { // Playing the dealer
				System.out.println("Player is playing the dealer.");
				dealerHand.sortHand();
				System.out.println("Dealer hand: " + dealerHand.getStringHand());

			}
			// p.addWallet(amount);
		}

		// displayDeck(deck);

		displayEndStats(p);

	}

	public static String getInput(String prompt, String opt1, String opt2) {
		System.out.println();
		System.out.printf("%s (%s or %s): ", prompt, opt1, opt2);
		boolean validInput = false;
		while (!validInput) {
			String input = in.nextLine();
			if (input.equalsIgnoreCase(opt1))
				return opt1;
			if (input.equalsIgnoreCase(opt2))
				return opt2;
			System.out.println();
			System.out.printf("Please enter %s or %s: ", opt1, opt2);
		}
		return "ERROR";
	}

	public static int getInput(String prompt, int min, int max) {
		System.out.println();
		System.out.printf("%s (%d - %d): ", prompt, min, max);
		boolean validInput = false;
		while (!validInput) {
			try {
				int input = Integer.parseInt(in.nextLine().toLowerCase());
				if (input >= min && input <= max) {
					return input;
				}
			} catch (Exception e) {

			}
			System.out.println();
			System.out.printf("Please enter number from %d to %d: ", min, max);
		}
		return 0;
	}

	public static void displayTurnStats(Player p) {
		System.out.println("\n-----Turn Stats-----");
		p.displayWallet();
		System.out.printf("Ante:      %5s\n", signedMoney(-p.getAnteWager()));
		System.out.printf("Pair Plus: %5s\n", signedMoney(-p.getPairPlusWager()));
		System.out.printf("Play:      %5s\n", signedMoney(-p.getPlayWager()));
	}

	public static void displayEndStats(Player p) {
		int currPlayerWallet = p.getWallet();
		int diff = currPlayerWallet - INITIAL_WALLET;
		System.out.println("\n------Game Ended------");
		System.out.printf("End wallet:   %7s\n", "$" + currPlayerWallet);
		System.out.printf("Net earnings: %7s", signedMoney(diff));
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

	public static String signedMoney(int amount) {
		if (amount == 0)
			return "$0";
		String sign = Math.signum(amount) == 1.0 ? "+" : "-";
		return sign + "$" + Math.abs(amount);
	}

	public static boolean playerCanPlay(Player p) {
		if (p.getWallet() < MIN_ANTE * 2 + MIN_PAIR_PLUS) {
			System.out.println("Not enough money to meet wager minimums!");
			return false;
		}
		return true;
	}

}
