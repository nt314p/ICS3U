package com.bayviewglen.threecardpoker;

import java.util.ArrayList;
import java.util.Scanner;

public class ThreeCardPoker {
	public static final int NUM_CARDS = 52;
	public static final int NUM_CARDS_IN_HAND = 3;
	public static final int MIN_ANTE = 50;
	public static final int MAX_ANTE = 100;
	public static final int MIN_PAIR_PLUS = 50;
	public static final int MAX_PAIR_PLUS = 100;
	public static final int INITIAL_WALLET = 1000;

	static Scanner in = new Scanner(System.in);

	static ArrayList<Card> deck = new ArrayList<Card>(NUM_CARDS);

	public static void main(String[] args) {

		boolean gameOver = false;

		Player p = new Player(INITIAL_WALLET, NUM_CARDS_IN_HAND);
		Hand playerHand = p.getHand();
		Hand dealerHand = new Hand(NUM_CARDS_IN_HAND);

		while (!gameOver) {
			if (!playerCanPlay(p)) // checking if the player can play
				break;

			shuffleDeck(deck);

			playerHand.clearHand(); // clearing player's hand
			dealerHand.clearHand(); // clearing dealer's hand

			p.clearWagers();

			p.setAnteWager(getInput("Please enter the ante wager", MIN_ANTE, MAX_ANTE)); // setting ante wager
			p.deductAnte();

			if (getInput("Do you want to place a pair plus wager", "Y", "N").equals("Y")) { // checking pair plus wager
				p.setPairPlusWager(getInput("Please enter the pair plus wager", MIN_PAIR_PLUS, MAX_PAIR_PLUS));
			} else {
				p.setPairPlusWager(0);
			}

			p.deductPairPlus();

			System.out.println();

			for (int i = 0; i < NUM_CARDS_IN_HAND; i++) {
				playerHand.drawCard(deck); // player draws card
				dealerHand.drawCard(deck); // dealer draws card
				System.out.println("Player drew a " + playerHand.getCards()[i].getCard() + ".");
			}

			System.out.println();

			playerHand.sortHand();
			p.displayHand(); // should we sort the hand?? YES!
			System.out.println(playerHand.getHandType() + "!\n");

			if (getInput("Do you want to play the dealer or fold", "P", "F").equals("F")) { // Checking for folding
				System.out.println("\nPlayer folded.");

			} else { // Playing the dealer
				System.out.println("\nPlayer is playing the dealer.\n");

				p.setPlayWager(p.getAnteWager());
				p.deductPlay();
				
				// paying out pair plus if pair plus!
				if (playerHand.getHandPayout() != 0 && p.getPairPlusWager() != 0) { 
					p.payoutPairPlus(playerHand.getHandPayout());
				}

				dealerHand.sortHand();
				System.out.println("\nDealer hand: " + dealerHand.getStringHand());
				System.out.println(dealerHand.getHandType() + "!\n");

				// dealer hand jack-high or worse and no pair plus, no qualify
				if (dealerHand.getHighCard().getValue() <= 11 && dealerHand.getHandPayout() == 0) {
					System.out.println("Dealer doesn't qualify.");
					p.payoutPlay(0); // return play wager

				} else if (dealerHand.getHandPayout() < playerHand.getHandPayout()) { // player beats dealer
					playerWin(p);

				} else if (dealerHand.getHandPayout() == playerHand.getHandPayout()) { // pay out equal
					int compareHighCards = playerHand.getHighCard().compareTo(dealerHand.getHighCard());

					if (dealerHand.getHandPayout() == 0) { // both player and dealer have high cards
						determineOutcome(p, compareHighCards); // win, tie, or loss
					} else { // pair plus hand ties
						if (!(playerHand.getHandPayout() == 1)) { // if the hand is not a pair
							determineOutcome(p, compareHighCards);
						} else {
							playerTie(p);
						}
					}
				} else { // no win, no tie, loss
					playerLoss();
				}
			}
			displayTurnStats(p);
			// seeing if player wants to play again
			gameOver = getInput("Do you want to play again", "Y", "N").equals("N");
		} // end of while loop
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
		System.out.printf("Wallet:     %7s\n", "$" + p.getWallet());
		System.out.printf("Ante:       %7s\n", signedMoney(-p.getAnteWager()));
		System.out.printf("Pair Plus:  %7s\n", signedMoney(-p.getPairPlusWager()));
		System.out.printf("Play:       %7s\n", signedMoney(-p.getPlayWager()));
		System.out.printf("Total:      %7s\n", signedMoney(-p.getTotalWagers()));
	}

	public static void displayEndStats(Player p) {
		int currPlayerWallet = p.getWallet();
		int diff = currPlayerWallet - INITIAL_WALLET;
		System.out.println("\n-----Game Ended-----");
		System.out.printf("End wallet: %7s\n", signedMoney(currPlayerWallet));
		System.out.printf("Earnings:   %7s\n", signedMoney(diff));
		System.out.printf("Gain %%:    %+7.1f%%", (100.0 * diff) / INITIAL_WALLET);
	}

	public static void displayDeck(ArrayList<Card> deck) {
		for (int i = 0; i < deck.size(); i++) {
			System.out.println(deck.get(i).getCard());
		}
	}

	public static void determineOutcome(Player p, int compareHighCards) {
		switch (compareHighCards) {
		case -1:
			playerWin(p);
			break;
		case 0:
			playerTie(p);
			break;
		case 1:
			playerLoss();
			break;
		default:
			System.out.println("Invalid compare card value");
			break;
		}
	}

	public static void playerWin(Player p) {
		System.out.println("Player beat the dealer!\n");
		p.payoutAnte();
		p.payoutPlay(1); // one to one pay out (win)
	}

	public static void playerTie(Player p) {
		System.out.println("Player tied with dealer.");
		p.payoutPlay(0);
	}

	public static void playerLoss() {
		System.out.println("Player lost to dealer.");
	}

	public static void shuffleDeck(ArrayList<Card> deck) {
		int[] numDeck = new int[NUM_CARDS]; // new integer array

		for (int i = 0; i < NUM_CARDS; i++) { // filling integer array with numbers from 0-51
			numDeck[i] = i;
		}

		for (int i = 0; i < 1000; i++) { // mixing array up
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
			System.out.println("\nNot enough money to meet wager minimums!");
			return false;
		}
		return true;
	}
}
