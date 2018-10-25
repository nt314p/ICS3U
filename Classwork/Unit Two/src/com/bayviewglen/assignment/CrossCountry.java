package com.bayviewglen.assignment;

import java.util.Scanner;

public class CrossCountry {
	/*
	 * Created by Nicolas Tong
	 * 
	 * Date: October. 10
	 * 
	 * Description:
	 * Utility that calculates split times for members in a 5 km race
	 * and displays them in a formatted table
	 * 
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); // creating scanner to read input

		final int SECS_IN_MINUTE = 60;

		// setting up temporary variables for split time difference computation
		String str1, str2, str3, name;
		int colon1, colon2, colon3;
		int minM1, minM2, minF, minTemp;
		double secM1, secM2, secF, secTemp;

		String p1Name, p1TimeM1, p1TimeM2, p1TimeF, p1S1, p1S2, p1S3; // ----- MEMBER ONE -----
		System.out.print("\nWhat is the member's name: ");
		p1Name = reader.nextLine();
		name = p1Name;

		System.out.print("\nWhat is " + name + "'s time to mile one (mm:ss.sss): ");
		p1TimeM1 = reader.nextLine();

		System.out.print("\nWhat is " + name + "'s time to mile two (mm:ss.sss): ");
		p1TimeM2 = reader.nextLine();

		System.out.print("\nWhat is " + name + "'s time to finish (mm:ss.sss): ");
		p1TimeF = reader.nextLine();

		// setting variables up member 1
		name = p1Name;
		str1 = p1TimeM1;
		str2 = p1TimeM2;
		str3 = p1TimeF;
		colon1 = str1.indexOf(":"); // getting colon indexes
		colon2 = str2.indexOf(":");
		colon3 = str3.indexOf(":");
		minM1 = Integer.parseInt(str1.substring(0, colon1)); // getting minutes
		minM2 = Integer.parseInt(str2.substring(0, colon2));
		minF = Integer.parseInt(str3.substring(0, colon3));
		secM1 = Double.parseDouble(str1.substring(colon1 + 1)); // getting seconds
		secM2 = Double.parseDouble(str2.substring(colon2 + 1));
		secF = Double.parseDouble(str3.substring(colon3 + 1));

		System.out.print("\nMember Name: " + name + "\n"); // printing name
		p1S1 = String.format("%3d:%06.3f", minM1, secM1);
		System.out.println("Split One:   " + p1S1); // split one

		// finding mile one to mile two time (split two)
		secTemp = secM2 - secM1; // subtracting times
		minTemp = minM2 - minM1;
		secTemp += minTemp * SECS_IN_MINUTE; // adding minutes to the seconds
		minTemp = ((int) secTemp) / SECS_IN_MINUTE; // casting seconds to an int then dividing to get the minutes
		secTemp -= minTemp * SECS_IN_MINUTE; // taking off the minutes from the seconds

		p1S2 = String.format("%3d:%06.3f", minTemp, secTemp); // formatting split two
		System.out.println("Split Two:   " + p1S2); // split two

		// finding time to mile two to finish (split three)
		secTemp = secF - secM2; // subtracting times
		minTemp = minF - minM2;
		secTemp += minTemp * SECS_IN_MINUTE; // adding minutes to the seconds
		minTemp = ((int) secTemp) / SECS_IN_MINUTE; // casting seconds to an int then dividing to get the minutes
		secTemp -= minTemp * SECS_IN_MINUTE; // taking off the minutes from the seconds

		p1S3 = String.format("%3d:%06.3f", minTemp, secTemp); // formatting split three
		System.out.println("Split Three: " + p1S3); // split three

		p1TimeF = String.format("%3d:%06.3f", minF, secF); // formatting finish time
		System.out.println("Finish Time: " + p1TimeF);

		String p2Name, p2TimeM1, p2TimeM2, p2TimeF, p2S1, p2S2, p2S3; // ----- MEMBER TWO -----
		System.out.print("\nWhat is the member's name: ");
		p2Name = reader.nextLine();
		name = p2Name;

		System.out.print("\nWhat is " + name + "'s time to mile one (mm:ss.sss): ");
		p2TimeM1 = reader.nextLine();

		System.out.print("\nWhat is " + name + "'s time to mile two (mm:ss.sss): ");
		p2TimeM2 = reader.nextLine();

		System.out.print("\nWhat is " + name + "'s time to finish (mm:ss.sss): ");
		p2TimeF = reader.nextLine();

		// setting variables up member 2
		name = p2Name;
		str1 = p2TimeM1;
		str2 = p2TimeM2;
		str3 = p2TimeF;
		colon1 = str1.indexOf(":"); // getting colon indexes
		colon2 = str2.indexOf(":");
		colon3 = str3.indexOf(":");
		minM1 = Integer.parseInt(str1.substring(0, colon1)); // getting minutes
		minM2 = Integer.parseInt(str2.substring(0, colon2));
		minF = Integer.parseInt(str3.substring(0, colon3));
		secM1 = Double.parseDouble(str1.substring(colon1 + 1)); // getting seconds
		secM2 = Double.parseDouble(str2.substring(colon2 + 1));
		secF = Double.parseDouble(str3.substring(colon3 + 1));

		System.out.print("\nMember Name: " + name + "\n");
		p2S1 = String.format("%3d:%06.3f", minM1, secM1);
		System.out.println("Split One:   " + p2S1); // split one

		// finding mile one to mile two time (split two)
		secTemp = secM2 - secM1; // subtracting times
		minTemp = minM2 - minM1;
		secTemp += minTemp * SECS_IN_MINUTE; // adding minutes to the seconds
		minTemp = ((int) secTemp) / SECS_IN_MINUTE; // casting seconds to an int then dividing to get the minutes
		secTemp -= minTemp * SECS_IN_MINUTE; // taking off the minutes from the seconds

		p2S2 = String.format("%3d:%06.3f", minTemp, secTemp); // formatting split two
		System.out.println("Split Two:   " + p2S2); // split two

		// finding time to mile two to finish (split three)
		secTemp = secF - secM2; // subtracting times
		minTemp = minF - minM2;
		secTemp += minTemp * SECS_IN_MINUTE; // adding minutes to the seconds
		minTemp = ((int) secTemp) / SECS_IN_MINUTE; // casting seconds to an int then dividing to get the minutes
		secTemp -= minTemp * SECS_IN_MINUTE; // taking off the minutes from the seconds

		p2S3 = String.format("%3d:%06.3f", minTemp, secTemp); // formatting split three
		System.out.println("Split Three: " + p2S3); // split three

		p2TimeF = String.format("%3d:%06.3f", minF, secF); // formatting finish time
		System.out.println("Finish Time: " + p2TimeF);

		String p3Name, p3TimeM1, p3TimeM2, p3TimeF, p3S1, p3S2, p3S3; // ----- MEMBER THREE -----
		System.out.print("\nWhat is the member's name: ");
		p3Name = reader.nextLine();
		name = p3Name;

		System.out.print("\nWhat is " + name + "'s time to mile one (mm:ss.sss): ");
		p3TimeM1 = reader.nextLine();

		System.out.print("\nWhat is " + name + "'s time to mile two (mm:ss.sss): ");
		p3TimeM2 = reader.nextLine();

		System.out.print("\nWhat is " + name + "'s time to finish (mm:ss.sss): ");
		p3TimeF = reader.nextLine();

		// setting variables up member 3
		name = p3Name;
		str1 = p3TimeM1;
		str2 = p3TimeM2;
		str3 = p3TimeF;
		colon1 = str1.indexOf(":"); // getting colon indexes
		colon2 = str2.indexOf(":");
		colon3 = str3.indexOf(":");
		minM1 = Integer.parseInt(str1.substring(0, colon1)); // getting minutes
		minM2 = Integer.parseInt(str2.substring(0, colon2));
		minF = Integer.parseInt(str3.substring(0, colon3));
		secM1 = Double.parseDouble(str1.substring(colon1 + 1)); // getting seconds
		secM2 = Double.parseDouble(str2.substring(colon2 + 1));
		secF = Double.parseDouble(str3.substring(colon3 + 1));

		System.out.print("\nMember Name: " + name + "\n");
		p3S1 = String.format("%3d:%06.3f", minM1, secM1);
		System.out.println("Split One:   " + p3S1); // split one

		// finding mile one to mile two time (split two)
		secTemp = secM2 - secM1; // subtracting times
		minTemp = minM2 - minM1;
		secTemp += minTemp * SECS_IN_MINUTE; // adding minutes to the seconds
		minTemp = ((int) secTemp) / SECS_IN_MINUTE; // casting seconds to an int then dividing to get the minutes
		secTemp -= minTemp * SECS_IN_MINUTE; // taking off the minutes from the seconds

		p3S2 = String.format("%3d:%06.3f", minTemp, secTemp); // formatting split two
		System.out.println("Split Two:   " + p3S2); // split two

		// finding time to mile two to finish (split three)
		secTemp = secF - secM2; // subtracting times
		minTemp = minF - minM2;
		secTemp += minTemp * SECS_IN_MINUTE; // adding minutes to the seconds
		minTemp = ((int) secTemp) / SECS_IN_MINUTE; // casting seconds to an int then dividing to get the minutes
		secTemp -= minTemp * SECS_IN_MINUTE; // taking off the minutes from the seconds

		p3S3 = String.format("%3d:%06.3f", minTemp, secTemp); // formatting split three
		System.out.println("Split Three: " + p3S3); // split three

		p3TimeF = String.format("%3d:%06.3f", minF, secF); // formatting finish time
		System.out.println("Finish Time: " + p3TimeF);

		String p4Name, p4TimeM1, p4TimeM2, p4TimeF, p4S1, p4S2, p4S3; // ----- MEMBER FOUR -----
		System.out.print("\nWhat is the member's name: ");
		p4Name = reader.nextLine();
		name = p4Name;

		System.out.print("\nWhat is " + name + "'s time to mile one (mm:ss.sss): ");
		p4TimeM1 = reader.nextLine();

		System.out.print("\nWhat is " + name + "'s time to mile two (mm:ss.sss): ");
		p4TimeM2 = reader.nextLine();

		System.out.print("\nWhat is " + name + "'s time to finish (mm:ss.sss): ");
		p4TimeF = reader.nextLine();

		// setting variables up member 4
		name = p4Name;
		str1 = p4TimeM1;
		str2 = p4TimeM2;
		str3 = p4TimeF;
		colon1 = str1.indexOf(":"); // getting colon indexes
		colon2 = str2.indexOf(":");
		colon3 = str3.indexOf(":");
		minM1 = Integer.parseInt(str1.substring(0, colon1)); // getting minutes
		minM2 = Integer.parseInt(str2.substring(0, colon2));
		minF = Integer.parseInt(str3.substring(0, colon3));
		secM1 = Double.parseDouble(str1.substring(colon1 + 1)); // getting seconds
		secM2 = Double.parseDouble(str2.substring(colon2 + 1));
		secF = Double.parseDouble(str3.substring(colon3 + 1));

		System.out.print("\nMember Name: " + name + "\n");
		p4S1 = String.format("%3d:%06.3f", minM1, secM1);
		System.out.println("Split One:   " + p4S1); // split one

		// finding mile one to mile two time (split two)
		secTemp = secM2 - secM1; // subtracting times
		minTemp = minM2 - minM1;
		secTemp += minTemp * SECS_IN_MINUTE; // adding minutes to the seconds
		minTemp = ((int) secTemp) / SECS_IN_MINUTE; // casting seconds to an int then dividing to get the minutes
		secTemp -= minTemp * SECS_IN_MINUTE; // taking off the minutes from the seconds

		p4S2 = String.format("%3d:%06.3f", minTemp, secTemp); // formatting split two
		System.out.println("Split Two:   " + p4S2); // split two

		// finding time to mile two to finish (split three)
		secTemp = secF - secM2; // subtracting times
		minTemp = minF - minM2;
		secTemp += minTemp * SECS_IN_MINUTE; // adding minutes to the seconds
		minTemp = ((int) secTemp) / SECS_IN_MINUTE; // casting seconds to an int then dividing to get the minutes
		secTemp -= minTemp * SECS_IN_MINUTE; // taking off the minutes from the seconds

		p4S3 = String.format("%3d:%06.3f", minTemp, secTemp); // formatting split three
		System.out.println("Split Three: " + p4S3); // split three

		p4TimeF = String.format("%3d:%06.3f", minF, secF); // formatting finish time
		System.out.println("Finish Time: " + p4TimeF);

		String p5Name, p5TimeM1, p5TimeM2, p5TimeF, p5S1, p5S2, p5S3; // ----- MEMBER FIVE -----
		System.out.print("\nWhat is the member's name: ");
		p5Name = reader.nextLine();
		name = p5Name;

		System.out.print("\nWhat is " + name + "'s time to mile one (mm:ss.sss): ");
		p5TimeM1 = reader.nextLine();

		System.out.print("\nWhat is " + name + "'s time to mile two (mm:ss.sss): ");
		p5TimeM2 = reader.nextLine();

		System.out.print("\nWhat is " + name + "'s time to finish (mm:ss.sss): ");
		p5TimeF = reader.nextLine();

		// setting variables up member 5
		name = p5Name;
		str1 = p5TimeM1;
		str2 = p5TimeM2;
		str3 = p5TimeF;
		colon1 = str1.indexOf(":"); // getting colon indexes
		colon2 = str2.indexOf(":");
		colon3 = str3.indexOf(":");
		minM1 = Integer.parseInt(str1.substring(0, colon1)); // getting minutes
		minM2 = Integer.parseInt(str2.substring(0, colon2));
		minF = Integer.parseInt(str3.substring(0, colon3));
		secM1 = Double.parseDouble(str1.substring(colon1 + 1)); // getting seconds
		secM2 = Double.parseDouble(str2.substring(colon2 + 1));
		secF = Double.parseDouble(str3.substring(colon3 + 1));

		System.out.print("\nMember Name: " + name + "\n");
		p5S1 = String.format("%3d:%06.3f", minM1, secM1);
		System.out.println("Split One:   " + p5S1); // split one

		// finding mile one to mile two time (split two)
		secTemp = secM2 - secM1; // subtracting times
		minTemp = minM2 - minM1;
		secTemp += minTemp * SECS_IN_MINUTE; // adding minutes to the seconds
		minTemp = ((int) secTemp) / SECS_IN_MINUTE; // casting seconds to an int then dividing to get the minutes
		secTemp -= minTemp * SECS_IN_MINUTE; // taking off the minutes from the seconds

		p5S2 = String.format("%3d:%06.3f", minTemp, secTemp); // formatting split two
		System.out.println("Split Two:   " + p5S2); // split two

		// finding time to mile two to finish (split three)
		secTemp = secF - secM2; // subtracting times
		minTemp = minF - minM2;
		secTemp += minTemp * SECS_IN_MINUTE; // adding minutes to the seconds
		minTemp = ((int) secTemp) / SECS_IN_MINUTE; // casting seconds to an int then dividing to get the minutes
		secTemp -= minTemp * SECS_IN_MINUTE; // taking off the minutes from the seconds

		p5S3 = String.format("%3d:%06.3f", minTemp, secTemp); // formatting split three
		System.out.println("Split Three: " + p5S3); // split three // split three

		p5TimeF = String.format("%3d:%06.3f", minF, secF); // formatting finish time
		System.out.println("Finish Time: " + p5TimeF);

		// PRINTING FINAL TABLE
		System.out.println("\n\n_______________________________________________________________________________"); 
		System.out.printf("| %-20s| %-12s| %-12s| %-12s| %-12s|\n", "Participant", "Split One", "Split Two",
				"Split Three", "Finish"); // heading
		System.out.printf("| %-20s| %-12s| %-12s| %-12s| %-12s|\n", p1Name, p1S1, p1S2, p1S3, p1TimeF); // member one
		System.out.printf("| %-20s| %-12s| %-12s| %-12s| %-12s|\n", p2Name, p2S1, p2S2, p2S3, p2TimeF); // member two
		System.out.printf("| %-20s| %-12s| %-12s| %-12s| %-12s|\n", p3Name, p3S1, p3S2, p3S3, p3TimeF); // member three
		System.out.printf("| %-20s| %-12s| %-12s| %-12s| %-12s|\n", p4Name, p4S1, p4S2, p4S3, p4TimeF); // member four
		System.out.printf("| %-20s| %-12s| %-12s| %-12s| %-12s|\n", p5Name, p5S1, p5S2, p5S3, p5TimeF); // member five
		System.out.print("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");

		reader.close(); // closing reader

	}

}
