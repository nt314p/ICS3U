package com.bayviewglen.daythree;

import java.util.Scanner;

public class ProblemOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		int m, n, p, q;

		m = reader.nextInt();
		n = reader.nextInt();
		p = reader.nextInt();
		q = reader.nextInt();

		int frameW = 2 * (p + q) + n;
		int frameH = 2 * (p + q) + m;

		for (int i = 0; i < frameH; i++) {
			for (int j = 0; j < frameW; j++) {
				boolean frame = i < q || j < q || i >= frameH - q || j >= frameW - q;
				boolean padding = i < q + p || j < q + p || i >= frameH - q - p || j >= frameW - q - p;
				if (frame) System.out.print("#");
				else if (padding) System.out.print("+");
				else System.out.print(".");
			}
			System.out.println();
		}
		
		reader.close();
	}

}
