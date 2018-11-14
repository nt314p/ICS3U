package com.bayviewglen.threecardpoker;

public class Player {
	private String name;
	private Hand hand;
	
	public Player(String name) {
		this.name = name;
		this.hand = new Hand(3); // new hand with size of 3
	}
	
	public Hand getHand() {
		return hand;
	}
	
	public String getName() {
		return name;
	}
}
