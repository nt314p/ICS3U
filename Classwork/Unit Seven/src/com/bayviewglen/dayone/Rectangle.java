package com.bayviewglen.dayone;

public class Rectangle {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public Rectangle() {
		length = 0;
		width = 0;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getPerimeter() {
		return 2 * (length + width);
	}
	
	public double getArea() {
		return length * width;
	}
}
