package com.bayviewglen.assignment;

import java.util.Scanner;

public class CrossCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		final int SECS_IN_MINUTE = 60;

		// setting up temporary variables for time difference computation
		String str1, str2, str3, name;
		int colon1, colon2, colon3;
		int minM1, minM2, minM3, minTemp;
		double secM1, secM2, secM3, secTemp;

		String p1Name, p1TimeM1, p1TimeM2, p1TimeM3, p1S1, p1S2, p1S3; // member one
		System.out.print("\nWhat is the member's name: ");
		p1Name = reader.nextLine();
		name = p1Name;

		System.out.print("\nWhat is the " + name + "'s time to mile one: ");
		p1TimeM1 = reader.nextLine();

		System.out.print("\nWhat is the " + name + "'s time to mile two: ");
		p1TimeM2 = reader.nextLine();

		System.out.print("\nWhat is the " + name + "'s time to finish: ");
		p1TimeM3 = reader.nextLine();

		// setting variables up member 1
		name = p1Name;
		str1 = p1TimeM1;
		str2 = p1TimeM2;
		str3 = p1TimeM3;
		colon1 = str1.indexOf(":"); // getting colon indexes
		colon2 = str2.indexOf(":");
		colon3 = str3.indexOf(":");
		minM1 = Integer.parseInt(str1.substring(0, colon1)); // getting minutes
		minM2 = Integer.parseInt(str2.substring(0, colon2));
		minM3 = Integer.parseInt(str3.substring(0, colon3));
		secM1 = Double.parseDouble(str1.substring(colon1 + 1)); // getting seconds
		secM2 = Double.parseDouble(str2.substring(colon2 + 1));
		secM3 = Double.parseDouble(str3.substring(colon3 + 1));

		System.out.println("\nSplit Times for:  " + name);
		p1S1 = String.format("Split One Time:   %02d:%06.3f\n", minM1, secM1);
		System.out.println(p1S1);

		// finding mile one to mile two time
		secTemp = secM2 - secM1; // subtracting times
		minTemp = minM2 - minM1;
		secTemp += minTemp * SECS_IN_MINUTE; // adding minutes to the seconds
		minTemp = ((int) secTemp) / SECS_IN_MINUTE; // casting seconds to an int then dividing to get the minutes
		secTemp -= minTemp * SECS_IN_MINUTE; // taking off the minutes from the seconds

		p1S2 = String.format("Split Two Time:   %02d:%06.3f\n", minTemp, secTemp); // printing split two
		System.out.println(p1S2);

		// finding time to mile two to finish
		secTemp = secM3 - secM2; // subtracting times
		minTemp = minM3 - minM2;
		secTemp += minTemp * SECS_IN_MINUTE; // adding minutes to the seconds
		minTemp = ((int) secTemp) / SECS_IN_MINUTE; // casting seconds to an int then dividing to get the minutes
		secTemp -= minTemp * SECS_IN_MINUTE; // taking off the minutes from the seconds

		p1S3 = String.format("Split Three Time: %02d:%06.3f\n", minTemp, secTemp); // printing split three
		System.out.println(p1S3);

		String p2Name, p2TimeM1, p2TimeM2, p2TimeM3, p2S1, p2S2, p2S3; // member two
		System.out.print("\nWhat is the member's name: ");
		p2Name = reader.nextLine();
		name = p2Name;

		System.out.print("\nWhat is the " + name + "'s time to mile one: ");
		p2TimeM1 = reader.nextLine();

		System.out.print("\nWhat is the " + name + "'s time to mile two: ");
		p2TimeM2 = reader.nextLine();

		System.out.print("\nWhat is the " + name + "'s time to finish: ");
		p2TimeM3 = reader.nextLine();

		// setting variables up member 2
		name = p2Name;
		str1 = p2TimeM1;
		str2 = p2TimeM2;
		str3 = p2TimeM3;
		colon1 = str1.indexOf(":"); // getting colon indexes
		colon2 = str2.indexOf(":");
		colon3 = str3.indexOf(":");
		minM1 = Integer.parseInt(str1.substring(0, colon1)); // getting minutes
		minM2 = Integer.parseInt(str2.substring(0, colon2));
		minM3 = Integer.parseInt(str3.substring(0, colon3));
		secM1 = Double.parseDouble(str1.substring(colon1 + 1)); // getting seconds
		secM2 = Double.parseDouble(str2.substring(colon2 + 1));
		secM3 = Double.parseDouble(str3.substring(colon3 + 1));

		System.out.println("\nSplit Times for:  " + name);
		p2S1 = String.format("Split One Time:   %02d:%06.3f\n", minM1, secM1);
		System.out.println(p2S1);

		// finding mile one to mile two time
		secTemp = secM2 - secM1; // subtracting times
		minTemp = minM2 - minM1;
		secTemp += minTemp * SECS_IN_MINUTE; // adding minutes to the seconds
		minTemp = ((int) secTemp) / SECS_IN_MINUTE; // casting seconds to an int then dividing to get the minutes
		secTemp -= minTemp * SECS_IN_MINUTE; // taking off the minutes from the seconds

		p2S2 = String.format("Split Two Time:   %02d:%06.3f\n", minTemp, secTemp); // printing split two
		System.out.println(p2S2);

		// finding time to mile two to finish
		secTemp = secM3 - secM2; // subtracting times
		minTemp = minM3 - minM2;
		secTemp += minTemp * SECS_IN_MINUTE; // adding minutes to the seconds
		minTemp = ((int) secTemp) / SECS_IN_MINUTE; // casting seconds to an int then dividing to get the minutes
		secTemp -= minTemp * SECS_IN_MINUTE; // taking off the minutes from the seconds

		p2S3 = String.format("Split Three Time: %02d:%06.3f\n", minTemp, secTemp); // printing split three
		System.out.println(p2S3);

		String p3Name, p3TimeM1, p3TimeM2, p3TimeM3, p3S1, p3S2, p3S3; // member three
		System.out.print("\nWhat is the member's name: ");
		p3Name = reader.nextLine();
		name = p3Name;

		System.out.print("\nWhat is the " + name + "'s time to mile one: ");
		p3TimeM1 = reader.nextLine();

		System.out.print("\nWhat is the " + name + "'s time to mile two: ");
		p3TimeM2 = reader.nextLine();

		System.out.print("\nWhat is the " + name + "'s time to finish: ");
		p3TimeM3 = reader.nextLine();

		// setting variables up member 3
		name = p3Name;
		str1 = p3TimeM1;
		str2 = p3TimeM2;
		str3 = p3TimeM3;
		colon1 = str1.indexOf(":"); // getting colon indexes
		colon2 = str2.indexOf(":");
		colon3 = str3.indexOf(":");
		minM1 = Integer.parseInt(str1.substring(0, colon1)); // getting minutes
		minM2 = Integer.parseInt(str2.substring(0, colon2));
		minM3 = Integer.parseInt(str3.substring(0, colon3));
		secM1 = Double.parseDouble(str1.substring(colon1 + 1)); // getting seconds
		secM2 = Double.parseDouble(str2.substring(colon2 + 1));
		secM3 = Double.parseDouble(str3.substring(colon3 + 1));

		System.out.println("\nSplit Times for:  " + name);
		p3S1 = String.format("Split One Time:   %02d:%06.3f\n", minM1, secM1);
		System.out.println(p3S1);

		// finding mile one to mile two time
		secTemp = secM2 - secM1; // subtracting times
		minTemp = minM2 - minM1;
		secTemp += minTemp * SECS_IN_MINUTE; // adding minutes to the seconds
		minTemp = ((int) secTemp) / SECS_IN_MINUTE; // casting seconds to an int then dividing to get the minutes
		secTemp -= minTemp * SECS_IN_MINUTE; // taking off the minutes from the seconds

		p3S2 = String.format("Split Two Time:   %02d:%06.3f\n", minTemp, secTemp); // printing split two
		System.out.println(p3S2);

		// finding time to mile two to finish
		secTemp = secM3 - secM2; // subtracting times
		minTemp = minM3 - minM2;
		secTemp += minTemp * SECS_IN_MINUTE; // adding minutes to the seconds
		minTemp = ((int) secTemp) / SECS_IN_MINUTE; // casting seconds to an int then dividing to get the minutes
		secTemp -= minTemp * SECS_IN_MINUTE; // taking off the minutes from the seconds

		p3S3 = String.format("Split Three Time: %02d:%06.3f\n", minTemp, secTemp); // printing split three
		System.out.println(p3S3);

		String p4Name, p4TimeM1, p4TimeM2, p4TimeM3, p4S1, p4S2, p4S3; //
		System.out.print("\nWhat is the member's name: ");
		p4Name = reader.nextLine();
		name = p4Name;

		System.out.print("\nWhat is the " + name + "'s time to mile one: ");
		p4TimeM1 = reader.nextLine();

		System.out.print("\nWhat is the " + name + "'s time to mile two: ");
		p4TimeM2 = reader.nextLine();

		System.out.print("\nWhat is the " + name + "'s time to finish: ");
		p4TimeM3 = reader.nextLine();

		// setting variables up member 4
		name = p4Name;
		str1 = p4TimeM1;
		str2 = p4TimeM2;
		str3 = p4TimeM3;
		colon1 = str1.indexOf(":"); // getting colon indexes
		colon2 = str2.indexOf(":");
		colon3 = str3.indexOf(":");
		minM1 = Integer.parseInt(str1.substring(0, colon1)); // getting minutes
		minM2 = Integer.parseInt(str2.substring(0, colon2));
		minM3 = Integer.parseInt(str3.substring(0, colon3));
		secM1 = Double.parseDouble(str1.substring(colon1 + 1)); // getting seconds
		secM2 = Double.parseDouble(str2.substring(colon2 + 1));
		secM3 = Double.parseDouble(str3.substring(colon3 + 1));

		System.out.println("\nSplit Times for:  " + name);
		p4S1 = String.format("Split One Time:   %02d:%06.3f\n", minM1, secM1);
		System.out.println(p4S1);

		// finding mile one to mile two time
		secTemp = secM2 - secM1; // subtracting times
		minTemp = minM2 - minM1;
		secTemp += minTemp * SECS_IN_MINUTE; // adding minutes to the seconds
		minTemp = ((int) secTemp) / SECS_IN_MINUTE; // casting seconds to an int then dividing to get the minutes
		secTemp -= minTemp * SECS_IN_MINUTE; // taking off the minutes from the seconds

		p4S2 = String.format("Split Two Time:   %02d:%06.3f\n", minTemp, secTemp); // printing split two
		System.out.println(p4S2);

		// finding time to mile two to finish
		secTemp = secM3 - secM2; // subtracting times
		minTemp = minM3 - minM2;
		secTemp += minTemp * SECS_IN_MINUTE; // adding minutes to the seconds
		minTemp = ((int) secTemp) / SECS_IN_MINUTE; // casting seconds to an int then dividing to get the minutes
		secTemp -= minTemp * SECS_IN_MINUTE; // taking off the minutes from the seconds

		p4S3 = String.format("Split Three Time: %02d:%06.3f\n", minTemp, secTemp); // printing split three
		System.out.println(p4S3);

		String p5Name, p5TimeM1, p5TimeM2, p5TimeM3, p5S1, p5S2, p5S3;
		System.out.print("\nWhat is the member's name: ");
		p5Name = reader.nextLine();
		name = p5Name;

		System.out.print("\nWhat is the " + name + "'s time to mile one: ");
		p5TimeM1 = reader.nextLine();

		System.out.print("\nWhat is the " + name + "'s time to mile two: ");
		p5TimeM2 = reader.nextLine();

		System.out.print("\nWhat is the " + name + "'s time to finish: ");
		p5TimeM3 = reader.nextLine();

		// setting variables up member 5
		name = p5Name;
		str1 = p5TimeM1;
		str2 = p5TimeM2;
		str3 = p5TimeM3;
		colon1 = str1.indexOf(":"); // getting colon indexes
		colon2 = str2.indexOf(":");
		colon3 = str3.indexOf(":");
		minM1 = Integer.parseInt(str1.substring(0, colon1)); // getting minutes
		minM2 = Integer.parseInt(str2.substring(0, colon2));
		minM3 = Integer.parseInt(str3.substring(0, colon3));
		secM1 = Double.parseDouble(str1.substring(colon1 + 1)); // getting seconds
		secM2 = Double.parseDouble(str2.substring(colon2 + 1));
		secM3 = Double.parseDouble(str3.substring(colon3 + 1));

		System.out.println("\nSplit Times for:  " + name);
		p5S1 = String.format("Split One Time:   %02d:%06.3f\n", minM1, secM1);
		System.out.println(p5S1);

		// finding mile one to mile two time
		secTemp = secM2 - secM1; // subtracting times
		minTemp = minM2 - minM1;
		secTemp += minTemp * SECS_IN_MINUTE; // adding minutes to the seconds
		minTemp = ((int) secTemp) / SECS_IN_MINUTE; // casting seconds to an int then dividing to get the minutes
		secTemp -= minTemp * SECS_IN_MINUTE; // taking off the minutes from the seconds

		p5S2 = String.format("Split Two Time:   %02d:%06.3f\n", minTemp, secTemp); // printing split two
		System.out.println(p5S2);

		// finding time to mile two to finish
		secTemp = secM3 - secM2; // subtracting times
		minTemp = minM3 - minM2;
		secTemp += minTemp * SECS_IN_MINUTE; // adding minutes to the seconds
		minTemp = ((int) secTemp) / SECS_IN_MINUTE; // casting seconds to an int then dividing to get the minutes
		secTemp -= minTemp * SECS_IN_MINUTE; // taking off the minutes from the seconds

		p5S3 = String.format("Split Three Time: %02d:%06.3f\n", minTemp, secTemp); // printing split three
		System.out.println(p5S3);
		
		System.out.println("Participant|%12s |");

	}

}
