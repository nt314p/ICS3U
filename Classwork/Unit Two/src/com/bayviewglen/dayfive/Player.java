package com.bayviewglen.dayfive;

import java.util.Scanner;

public class Player {
	private int score;
	private String name;
	private Scanner in;
	private int maxValue;

	public Player(String name, Scanner in, int maxValue) {
		this.name = name;
		this.in = in;
		this.maxValue = maxValue;
	}

	public void takeTurn() {
		int numDice = getNumDice();
		int currentTurn = 0;
		for (int i = 0; i < numDice; i++) {
			int currentRoll = roll();
			currentTurn += currentRoll;
			System.out.println(name + " rolled a " + currentRoll);
		}

		System.out.println(name + " rolled " + currentTurn + " points in total");

		if (currentTurn == 4 || currentTurn == 10) {
			score -= 5;
			System.out.println(name + " lost 5 points");
		} else {
			score += currentTurn;
			System.out.println(name + " gained " + currentTurn + " points");
		}
	}

	public int getNumDice() {
		boolean validInput = false;
		int numDice = 0;
		System.out.println();
		System.out.print(name + ", how many dice would you like to roll (1 to " + maxValue + "): ");

		while (!validInput) {
			try {
				numDice = Integer.parseInt(in.nextLine());
				if (!(numDice < 1 || numDice > maxValue))
					validInput = true;
			} catch (Exception e) {

			}
			System.out.println();
			if (!validInput)
				System.out.print("Please enter 1 to " + maxValue + ": ");

		}
		return numDice;
	}

	public void displayScore() {
		System.out.println(name + " has " + score + " points");
	}

	public int roll() {
		return (int) (Math.random() * 6) + 1;
	}
	
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return name;
	}

}
