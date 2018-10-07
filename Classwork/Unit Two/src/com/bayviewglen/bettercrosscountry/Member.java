package com.bayviewglen.bettercrosscountry;

import java.util.Scanner;

public class Member {
	private String name;
	private Split[] splits = new Split[4];
	// 0 - split one
	// 1 - mile two time / split two
	// 2 - finish time / split three
	// 3 - finish time

	private String[] numToStr = { "one", "two", "three", "finish" };

	public Member(Scanner in) {
		System.out.print("\nWhat is the member's name: ");
		name = in.nextLine();

		for (int i = 0; i < 3; i++) { // getting mile times (not splits)s
			splits[i] = new Split(); // initializing split
			splits[i].set(askTime(i + 1, in));
		}

		splits[3] = new Split(splits[2].getMinutes(), splits[2].getSeconds()); // setting mile three time to finish

		splits[2] = splits[2].getSplitDifference(splits[1]); // setting split three
		splits[1] = splits[1].getSplitDifference(splits[0]); // setting split two

		printMiniTable();
	}

	public String askTime(int mile, Scanner in) {
		System.out.print("\nWhat is " + name + "'s time to mile " + numToStr[mile - 1] + " (mm:ss.sss): ");
		return in.nextLine();
	}

	public void printMiniTable() {
		System.out.println("\nMember Name: " + name);
		for (int i = 0; i < 3; i++) {
			System.out.printf("%-13s" + splits[i].get() + "\n", "Split " + numToStr[i] + ": ");
		}
		System.out.println("Finish Time: " + splits[3].get());
	}
	
	public void printTableRow() {
		System.out.printf("| %-20s| %-12s| %-12s| %-12s| %-12s|\n", name, splits[0].get(), splits[1].get(), splits[2].get(), splits[3].get());
	}
}
