package Training;

import java.util.*;

public class Odev083 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// your code
		// ------------------------------------------
		String GuestName,answer;
		System.out.println("Please enter guest name:");
		GuestName = input.next();
		System.out.println("Do you want to enter new guest name:");
		answer = input.next();
			while (answer.equals("yes")) {
				System.out.println("Please enter guest name:");
				GuestName+=", "+ input.next();
				System.out.println("Do you want to enter new guest name:");
				answer = input.next();}
			
			    System.out.println("Guest's list: " + GuestName);

			
	}
}
