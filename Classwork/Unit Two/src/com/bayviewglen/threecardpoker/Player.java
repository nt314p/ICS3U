package com.bayviewglen.threecardpoker;

public class Player {
	private Hand hand;
	private int wallet;
	private int anteWager = 0;
	private int pairPlusWager = 0;
	private int playWager = 0;

	public Player(int wallet) {
		this.hand = new Hand(3); // new hand with size of 3
		this.wallet = wallet;
	}

	public int getAnteWager() {
		return anteWager;
	}

	public void setAnteWager(int anteWager) {
		this.anteWager = anteWager;
	}

	public int getPairPlusWager() {
		return pairPlusWager;
	}

	public void setPairPlusWager(int pairPlusWager) {
		this.pairPlusWager = pairPlusWager;
	}

	public int getPlayWager() {
		return playWager;
	}

	public void setPlayWager(int playWager) {
		this.playWager = playWager;
	}

	public Hand getHand() {
		return hand;
	}

	public int getWallet() {
		return wallet;
	}
	
	public void clearWagers() {
		anteWager = 0;
		pairPlusWager = 0;
		playWager = 0;
	}

	public void deductAnte() {
		wallet -= anteWager;
		System.out.printf("$%d deducted for ante wager.\n", anteWager);
	}

	public void deductPairPlus() {
		wallet -= pairPlusWager;
		if (!(pairPlusWager == 0))
			System.out.printf("$%d deducted for pair plus wager.\n", pairPlusWager);
	}

	public void deductPlay() {
		wallet -= playWager;
		System.out.printf("$%d deducted for play wager.\n", playWager);
	}

	public void payoutAnte() {
		int payout = anteWager * 2;
		anteWager -= payout; // for end stats
		wallet += payout;
		System.out.printf("$%d gained for ante wager.\n", payout);
	}

	public void payoutPairPlus(int ratio) {
		int payout = pairPlusWager * (ratio + 1);
		pairPlusWager -= payout; // for end stats
		wallet += payout;
		System.out.printf("$%d gained for pair plus wager.\n", payout);
	}

	public void payoutPlay(int ratio) {
		int payout = playWager * (ratio + 1);
		playWager -= payout; // for end stats
		wallet += payout;
		System.out.printf("$%d %s for play wager.\n", payout, ratio==0 ? "returned" : "gained");
	}

	public void displayWallet() {
		System.out.println("Wallet: $" + wallet);
	}

	public void displayHand() {
		System.out.println("Player's hand: " + hand.getStringHand());
	}

}
