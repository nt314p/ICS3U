package com.bayviewglen.threecardpoker;

public class Player {
	private String name;
	private Hand hand;
	private int wallet;
	private int anteWager = 0;
	private int pairPlusWager = 0;
	private int playWager = 0;

	public Player(String name, int wallet) {
		this.name = name;
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

	public String getName() {
		return name;
	}

	public int getWallet() {
		return wallet;
	}

	public void addWallet(int amount) {
		wallet += amount;
	}

	public void deductAnte() {
		wallet -= anteWager;
		System.out.printf("$%d deducted.\n", anteWager);
	}

	public void deductPairPlus() {
		wallet -= pairPlusWager;
		if (!(pairPlusWager == 0))
			System.out.printf("$%d deducted.\n", pairPlusWager);
	}

	public void displayWallet() {
		System.out.println("Wallet: $" + wallet);
	}
	
	public void displayHand() {
		System.out.println(name + "'s hand: " + hand.getStringHand());
	}

}
