package com.bayviewglen.dayone;

public class Box extends Rectangle {
	private double height;

	public Box(double width, double length, double height) {
		super(width, length);
		this.height = height;
	}

	public Box() {
		super();
		height = 0;
	}

	public double getHeight() {
		return height;
	}

	public double getSurfaceArea() {
		return super.getPerimeter() * height + 2 * super.getArea();
	}
	
	public double getVolume() {
		return super.getArea() * height;
	}
	
	public double getPerimeter() {
		throw new RuntimeException("Box does not have an perimeter");
	}
	
	public double getArea() {
		throw new RuntimeException("Box does not have an area");
	}
}
