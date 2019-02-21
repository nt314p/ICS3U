package com.bayviewglen.dayone;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect1 = new Rectangle(4, 5);
		Box box1 = new Box(4, 5, 3);
		
		System.out.println("Box Surface Area: " + box1.getSurfaceArea());
		System.out.println("Box Volume: " + box1.getVolume());
		//System.out.println("Box Area: " + box1.getArea());
		//System.out.println("Box Perimeter: " + box1.getPerimeter());
		
		System.out.println("Rectangle Area: " + rect1.getArea());
		System.out.println("Rectangle Perimeter: " + rect1.getPerimeter());
	}

}
