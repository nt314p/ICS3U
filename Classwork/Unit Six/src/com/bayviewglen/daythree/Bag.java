package com.bayviewglen.daythree;

public class Bag {
	
	private int[] data;
	private static final int DEFAULT_CAPACITY = 10;
	private int itemNum;
	
	public Bag () {
		data = new int[DEFAULT_CAPACITY];
		itemNum = 0;
	}
	
	public Bag (int capacity) {
		//if (capacity >= 0) {
			//throw new IllegalArgumentException("Non-negative integer please");
		//}
		data = new int[capacity];
		itemNum = 0;
	}
	
	// Copies the bag passed in
	public Bag(Bag bag) {
		this.data = new int[bag.data.length];
		this.itemNum = bag.itemNum;
		for (int i = 0; i < bag.itemNum; i++) {
			this.data[i] = bag.data[i];
		}
	}
	
	public void add (int item) {
		this.data[itemNum] = item;
		itemNum++;
	}
	
	public int size() {
		return itemNum;
	}
	
	public int countOccurances(int target) {
		int count = 0;
		for (int i = 0; i < itemNum; i++) {
			if (data[i] == target) {
				count++;
			}
		}
		return count;
	}
	
	public boolean remove(int target) {
		for (int i = 0; i < itemNum; i++) {
			if (data[i] == target) {
				data[i] = data[itemNum - 1];
				itemNum--;
				return true;
			}
		}
		return false;
	}
	
	

}
