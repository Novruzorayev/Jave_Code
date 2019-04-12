package day11_logical_nestedif;

import java.util.*;

public class TollCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Vehicle Type:");
		int carType = scan.nextInt();
		System.out.println("Is it rush hour: yes | no");
		String rushHour = scan.next();
		
	    boolean isRushHour;
	    if(rushHour.equalsIgnoreCase("yes")) {
	    	isRushHour = true;
	    }else {
	    	isRushHour = false;}
	    	System.out.println(isRushHour);
	    }
	}


