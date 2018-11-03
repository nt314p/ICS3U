package com.bayviewglen.dayfive;

import java.util.Scanner;

public class BetterDiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		final int MAX_ROLLS = 3;
		final int GOAL = 50;

		Player playerOne = new Player("Player One", in, MAX_ROLLS);
		Player playerTwo = new Player("Player Two", in, MAX_ROLLS);

		boolean gameOver = false;

		while (!gameOver) {
			playerOne.takeTurn();
			playerTwo.takeTurn();
			playerOne.displayScore();
			playerTwo.displayScore();

			if (playerOne.getScore() >= GOAL || playerTwo.getScore() >= GOAL) {
				gameOver = true;
			}
		}

		displayWinner(playerOne, playerTwo);
		in.close();
	}

	public static void displayWinner(Player p1, Player p2) {
		if (p1.getScore() > p2.getScore())
			System.out.println(p1.getName() + " is the winner");
		else if (p1.getScore() < p2.getScore())
			System.out.println(p2.getName() + " is the winner");
		else
			System.out.println("There is a tie!");
	}

}
