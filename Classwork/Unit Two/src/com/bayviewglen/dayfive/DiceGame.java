package com.bayviewglen.dayfive;

import java.util.Scanner;

public class DiceGame {
	// Two player game
	// two players
	// first to go over 50 wins
	// you can roll 1 or 2 die
	// if you roll a 4 or 10 you lose 5
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int playerOneScore = 0;
		int playerTwoScore = 0;

		final int GOAL = 50;
		final int MAX_DICE = 3;

		boolean gameOver = false;

		while (!gameOver) {

			playerOneScore = playerTurn(in, "Player One", playerOneScore, MAX_DICE);
			playerTwoScore = playerTurn(in, "Player Two", playerTwoScore, MAX_DICE);

			displayScore("Player One", playerOneScore);
			displayScore("Player Two", playerTwoScore);

			System.out.println("------------------------------------");

			if (playerOneScore > GOAL || playerTwoScore > GOAL) {
				gameOver = true;
			}
			displayWinner("Player One", playerOneScore, "Player Two", playerTwoScore);
		}
	}

	public static int playerTurn(Scanner in, String playerName, int playerScore, int maxValue) {
		System.out.print(playerName + ", how many dice would you like to roll (1 to " + maxValue + ")? ");
		int numDice = getNumDice(in, maxValue);
		System.out.println();
		int currentTurn = 0;
		for (int i = 0; i < numDice; i++) {
			int currentRoll = roll();
			currentTurn += currentRoll;
			System.out.println(playerName + " rolled a " + currentRoll);

		}
		if (currentTurn == 4 || currentTurn == 10) {
			playerScore -= 5;
			System.out.println(playerName + " lost 5 points");
		} else {
			playerScore += currentTurn;
			System.out.println(playerName + " gained " + currentTurn + " points");
		}
		return playerScore;
	}

	public static void displayWinner(String playerOneName, int playerOneScore, String playerTwoName,
			int playerTwoScore) {
		if (playerOneScore > playerTwoScore)
			System.out.println(playerOneName + " is the winner");
		else if (playerOneScore < playerTwoScore)
			System.out.println(playerTwoName + " is the winner");
		else
			System.out.println("There is a tie!");
	}

	public static int getNumDice(Scanner in, int maxValue) {
		boolean validInput = false;
		int numDice = 0;

		while (!validInput) {
			try {
				numDice = Integer.parseInt(in.next());
				if (numDice < 1 || numDice > maxValue)
					System.out.println("Please enter 1 to" + maxValue + ":");
				else
					validInput = true;
			} catch (Exception ex) {
				System.out.println("Please enter 1 to" + maxValue + ":");
			}
		}
		return numDice;

	}

	public static void displayScore(String playerName, int playerScore) {
		System.out.println(playerName + " has " + playerScore + " points");
	}

	public static int roll() {
		return (int) (Math.random() * 6) + 1;
	}

}
