package com.bayviewglen.daytwo;

public class CodeWordChecker {
	private int min, max;
	private String str;
	
	public CodeWordChecker (int min, int max, String str) {
		this.min = min;
		this.max = max;
		this.str = str;
	}
	
	public CodeWordChecker (String str) {
		this.min = 6;
		this.max = 20;
		this.str = str;
	}
	
	public boolean isValid(String str) {
		if (str.length() < min || str.length() > max) {
			return false;
		}
		return (str.indexOf(str) < 0);
	}

}
