package Training;

import java.util.*;

public class RegisterTask {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double totalPrice = 0.0;
		String items = "";
		System.out.println("Welcome! How many times are you purchasing?");
		int itemsCount = scan.nextInt();
		for (int i = 1; i <= itemsCount; i++) {
			System.out.println("What is item " + i + "?");
			String itemName = scan.next();
			System.out.println("How musch is " + itemName + "?");
			double itemPrice = scan.nextDouble();
			// add itemName to items and
			items += itemName;
			if (i != itemsCount)
				items += ", ";
			totalPrice += itemPrice;

		}
		
		System.out.println("Your items: " + items);
		System.out.println("Total Price: $" + totalPrice);

	}
}
