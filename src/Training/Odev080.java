package Training;

import java.util.*;

public class Odev080 {
	public static void main(String[] args) {
		int freeBooks = 0;
		Scanner scan = new Scanner(System.in);
		boolean isPremiumCustomer = scan.nextBoolean();
		int nbooksPurchased = scan.nextInt();
		if (isPremiumCustomer) {
			if (nbooksPurchased >= 5 && nbooksPurchased < 8) {
				freeBooks++;
			} else if (nbooksPurchased >= 8) {
				freeBooks += 2;
			}
		} else {
			if (nbooksPurchased >= 7 && nbooksPurchased < 12) {
				freeBooks++;
			} else if (nbooksPurchased >= 12) {
				freeBooks += 2;
			}
		}
		System.out.println(freeBooks);
	}
}
