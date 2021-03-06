package com.bayviewglen.assignment;

public class DoubleArraySequenceTestMod {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int score = 0;
		DoubleArraySequence d1 = new DoubleArraySequence();
		DoubleArraySequence d2 = new DoubleArraySequence(5);
		DoubleArraySequence d3 = new DoubleArraySequence(d2);

		if (d1.size() == 0) {
			score++;
			System.out.println("ur d1 array had size of 0");
		}

		score += test(d1, new double[] {}, 0, 0, 10, 2);
		score += test(d2, new double[] {}, 0, 0, 5, 2);
		score += test(d3, new double[] {}, 0, 0, 5, 2);

		d2.addAfter(1.0);
		score += test(d2, new double[] { 1.0 }, 0, 1, 5, 2);
		d2.addAfter(2.0);
		d2.addAfter(3.0);
		d2.addAfter(4.0);
		score += test(d2, new double[] { 1.0, 2.0, 3.0, 4.0 }, 3, 4, 5, 2);
		d2.addAfter(5.0);
		score += test(d2, new double[] { 1.0, 2.0, 3.0, 4.0, 5.0 }, 4, 5, 5, 2);
		d2.addAfter(6.0);
		score += test(d2, new double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 }, 5, 6, 10, 2);

		if (d2.size() == 6) {
			score += 2;
			System.out.println("looks like ur d2 array had a size of 6");
		}

		if (d2.isCurrent()) {
			score += 2;
			System.out.println("looks like ur d2 array iscurrent be true");

		}

		if (d2.getCapacity() == 10) {
			score += 2;
			System.out.println("looks like ur d2 array had a size of 6");
		}

		d2.ensureCapacity(5);
		score += test(d2, new double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 }, 5, 6, 10, 2);

		d2.ensureCapacity(25);
		score += test(d2, new double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 }, 5, 6, 25, 2);

		d2.start();
		score += test(d2, new double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 }, 0, 6, 25, 2);

		d2.advance();
		score += test(d2, new double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 }, 1, 6, 25, 2);

		System.out.println("finished some ensure cap, start, and advance test");

		try {
			for (int i = 0; i <= 20; ++i) {
				d2.advance();
			}
		} catch (IllegalStateException ex) {
			System.out.println("lol ur illegal, good job");
			score += 2;
		}
		score += test(d2, new double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 }, 6, 6, 25, 2);

		if (!d2.isCurrent())
			score += 2;

		d1.addAll(d2);
		score += test(d1, new double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 }, 0, 6, 10, 4);
		d1.addAll(d2);
		score += test(d1, new double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 }, 0, 12, 12, 2);

		d1.addBefore(1.0);
		score += test(d1, new double[] { 1.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 }, 0, 13, 24,
				2);

		for (int i = 0; i < 12; i++)
			d1.advance();
		d1.addBefore(2.0);
		score += test(d1, new double[] { 1.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 1.0, 2.0, 3.0, 4.0, 5.0, 2.0, 6.0 }, 12, 14,
				24, 2);
		d1.start();
		d1.addBefore(7.0);
		score += test(d1, new double[] { 7.0, 1.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 1.0, 2.0, 3.0, 4.0, 5.0, 2.0, 6.0 }, 0,
				15, 24, 2);
		d3.addBefore(7.0);
		score += test(d3, new double[] { 7.0 }, 0, 1, 5, 2);
		d3.addBefore(6.0);
		score += test(d3, new double[] { 6.0, 7.0 }, 0, 2, 5, 2);
		d3.removeCurrent();
		score += test(d3, new double[] { 7.0 }, 0, 1, 5, 2);
		d3.removeCurrent();
		score += test(d3, new double[] {}, 0, 0, 5, 2);

		for (int i = 0; i < 10; i++) {
			d3.addBefore(i);
		}
		score += test(d3, new double[] { 9.0, 8.0, 7.0, 6.0, 5.0, 4.0, 3.0, 2.0, 1.0, 0.0 }, 0, 10, 10, 2);

		DoubleArraySequence d4 = DoubleArraySequence.catenation(d2, d3);
		score += test(d4,
				new double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 9.0, 8.0, 7.0, 6.0, 5.0, 4.0, 3.0, 2.0, 1.0, 0.0 }, 16, 16,
				16, 5);
		score += test(d4,
				new double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 9.0, 8.0, 7.0, 6.0, 5.0, 4.0, 3.0, 2.0, 1.0, 0.0 }, 16, 16,
				25, 5);

		try {
			d4.getCurrent();
		} catch (IllegalStateException ex) {
			score += 2;
		}

		try {
			d4.removeCurrent();
		} catch (IllegalStateException ex) {
			score += 2;
		}

		DoubleArraySequence d5 = new DoubleArraySequence();
		try {
			d5.removeCurrent();
		} catch (IllegalStateException ex) {
			score += 2;
		}

		d2.addAfter(1.0);
		score += test(d2, new double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 1.0 }, 6, 7, 25, 2);
		try {
			d2.advance();
			d2.advance();
		} catch (IllegalStateException ex) {
			score++;
		}

		d2.addBefore(12.0);
		score += test(d2, new double[] { 12.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 1.0 }, 0, 8, 25, 2);

		try {
			d2.addAll(null);
		} catch (Exception ex) {
			score += test(d2, new double[] { 12.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 1.0 }, 0, 8, 25, 2);
		}

		System.out.println("You received " + score + " out of a possible 75 points");

	}

	private static int test(DoubleArraySequence src, double[] data, int currentIndex, int manyItems, int capacity,
			int points) {

		if (capacity != src.getCapacity()) {
			System.out.println("cap error");
			System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
			return 0;
		}

		if (currentIndex != src.getCurrentIndex()) {
			System.out.println("index error");
			System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
			return 0;
		}

		if (manyItems != src.size()) {
			System.out.println("size error");
			System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
			return 0;
		}

		try {
			int i = 0;
			for (src.start(); src.isCurrent(); src.advance()) {
				if (data[i++] != src.getCurrent()) {
					src.setCurrentIndex(currentIndex);
					System.out.println("data mismatch error");
					System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
					return 0;
				}
			}
		} catch (Exception ex) {
			System.out.println("Exception thrown in test" + ex.getMessage());
			src.setCurrentIndex(currentIndex);
			ex.printStackTrace();
			System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
			return 0;
		}
		src.setCurrentIndex(currentIndex);
		return points;
	}
}
