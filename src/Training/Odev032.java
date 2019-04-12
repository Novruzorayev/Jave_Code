package Training;

import java.util.*;

public class Odev032 {
	public static void main(String[] args) {
		int itemPrice, quarters, dimes, nickels;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter price in cents:");
		itemPrice = scan.nextInt();
		int change = 100 - itemPrice;
		quarters = change / 25;
		change = change % 25;
		dimes = change / 10;
		change = change % 10;
		nickels = change / 5;
		change = change % 5;
		if (itemPrice < 25 || itemPrice > 100) {
			System.out.println("Invalid price!");
		} else if (itemPrice % 5 != 0) {
			System.out.println("Invalid Price");
		} else {
			System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickels + ".");
		}

	}
}
