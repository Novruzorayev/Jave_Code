package Training;

import java.util.*;

public class Odev_042 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter vehicle's year:");
		int vehicleYear = scan.nextInt();
		if(vehicleYear > 1994 && vehicleYear < 1999) {
		System.out.println("Your vehicle needs to be recalled!");}
		else if(vehicleYear == 2001 || vehicleYear == 2002) {
			System.out.println("Your vehicle needs to be recalled!");}
		else if(vehicleYear>= 2004 && vehicleYear <= 2006) {
			System.out.println("Your vehicle needs to be recalled!");}
		else if(vehicleYear>= 2015 && vehicleYear <= 2017) {
			System.out.println("Your vehicle needs to be recalled!");}
			
		
		else {System.out.println("Your vehicle is fine, enjoy!");}

		

		
}
}