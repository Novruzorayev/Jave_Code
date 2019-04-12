package Training;

import java.util.*;

public class Weeks_hours {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputHours, weeks, days, hours;
		
	System.out.println("Enter hours:");
	inputHours = scan.nextInt();
	weeks = inputHours/168;
	days = inputHours%168/24;
	hours = inputHours%168%24;
	
	System.out.println(weeks+ " weeks, "+days+" days, "+hours+" hours");
		
	}

}
