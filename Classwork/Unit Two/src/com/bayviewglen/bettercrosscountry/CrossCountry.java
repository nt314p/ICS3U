package com.bayviewglen.bettercrosscountry;

import java.util.Scanner;

public class CrossCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		final int NUM_MEMBERS = 5;

		Member[] members = new Member[5];

		for (int i = 0; i < NUM_MEMBERS; i++) {
			members[i] = new Member(in);
		}

		System.out.println("\n\n_______________________________________________________________________________");
		System.out.println("| Participant         | Split One   | Split Two   | Split Three | Finish      |"); // heading
		for (int i = 0; i < members.length; i++) {
			members[i].printTableRow();
		}
		System.out.print("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");

		in.close();

	}

}
