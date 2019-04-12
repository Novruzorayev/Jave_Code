package Training;

import java.util.*;

public class Odev034 {
	public static void main(String[] args) {
		// Write your code here
		int coupons = 0;
		int candies, gumballs;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of coupons:");
		coupons = scan.nextInt();
		candies = coupons / 10;
		gumballs = coupons % 10 / 3;
		if (coupons < 10) {
			System.out.println("Not enough coupons");
		} else {
			System.out.println("Number of Candies: " + candies);
			System.out.println("Number of Gumballs: " + gumballs);
		}

	}
}