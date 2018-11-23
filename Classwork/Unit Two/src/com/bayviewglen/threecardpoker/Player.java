package com.bayviewglen.threecardpoker;

import java.lang.reflect.Field;

public class Player {
	private Hand hand;
	private int wallet;
	int anteWager = 0;
	int pairPlusWager = 0;
	int playWager = 0;

	public Player(int wallet, int handSize) {
		this.hand = new Hand(handSize); // new hand
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
	
	public int getTotalWagers() {
		return anteWager + pairPlusWager + playWager;
	}
	
	public void deductWager(String wagerName) {
		String fieldName = wagerName+"Wager";
		try {
			Field f = this.getClass().getDeclaredField(fieldName);
			int deductAmount = (int) f.get(this);
			wallet -= deductAmount;
			if (wagerName.equals("pairPlus"))
				wagerName = "pair plus";
			if (deductAmount != 0)
				System.out.printf("$%d deducted for %s wager.\n", deductAmount, wagerName);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
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

	public void displayHand() {
		System.out.println("Player's hand: " + hand.getStringHand());
	}
}
