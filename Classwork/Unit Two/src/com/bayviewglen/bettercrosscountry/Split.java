package com.bayviewglen.bettercrosscountry;

public class Split {
	private int minutes;
	private double seconds;
	
	public Split(int mins, double secs) {
		minutes = mins;
		seconds = secs;
	}
	
	public Split() {
		seconds = minutes = 0;
	}
	
	public void set(String split) {
		int colon = split.indexOf(":");
		minutes = Integer.parseInt(split.substring(0, colon));
		seconds = Double.parseDouble(split.substring(colon + 1));
	}
	
	public String get() {
		return String.format("%03d:%06.3f", minutes, seconds);
	}
	
	public Split getSplitDifference(Split other) {
		int diffMins = minutes - other.getMinutes(); // difference minutes
		double diffSecs = seconds - other.getSeconds(); // difference seconds
		diffSecs += diffMins * 60; // converting minutes to seconds and adding
		diffSecs = Math.abs(diffSecs);
		
		int newMins = ((int) diffSecs) / 60;
		double newSecs = diffSecs % 60;
		return new Split(newMins, newSecs);
	}
	
	public int getMinutes() {
		return minutes;
	}

	public double getSeconds() {
		return seconds;
	}

}
