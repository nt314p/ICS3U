package com.bayviewglen.daythree;

public class BayviewGlenPools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set these
		double length = 20;
		double width = 10;
		double deepDepth = 7;
		double transitionLength = 5;
		double shallowDepth = 4;
		double shallowLength = 12;
		double linerPrice = 1.2;

		double transitionY = deepDepth - shallowDepth;

		// using pythag theorem
		double transitionX = Math.sqrt(Math.pow(transitionLength, 2) - Math.pow(transitionY, 2));
		double deepLength = length - transitionX;

		// rectangle - area of trapezoid
		double subtractTrapezoid = 0.5 * transitionY * (shallowLength + length - deepLength);
		double linerSideArea = length * deepDepth - subtractTrapezoid;

		double linerBottom = deepDepth + deepLength + transitionLength + shallowLength + shallowDepth;
		double totalLinerArea = 2 * linerSideArea + linerBottom;
		
		double poolVolume = linerSideArea * width;
		
		double fillPoolVolume = 0.9 * poolVolume;
		
		double totalLinerCost = linerPrice * totalLinerArea;
		
		System.out.println("Pool Length: " + length);
		System.out.println("Pool Width: " + width);
		
		System.out.println("Shallow Length: " + shallowLength);		
		System.out.println("Deep Length: " + deepLength);
		
		System.out.println("Shallow Depth: " + shallowDepth);		
		System.out.println("Deep Depth: " + deepDepth);
		
		System.out.println("Shallow-Deep Transition Lenght: " + transitionLength);
		
		System.out.println("Cost per square unit of liner: $" + linerPrice);
		
		System.out.println("Volume of water to keep pool 90% full: " + fillPoolVolume);
		System.out.println("Total area of liner: " + totalLinerArea);
		System.out.println("Total cost of liner: " + totalLinerCost);

	}

}
