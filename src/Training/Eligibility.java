package Training;

import java.util.*;

public class Eligibility {
	public static void main(String[] args) {

		int score = 0;
		boolean loan;
		String eligibility = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you need loan?");
		loan = scan.nextBoolean();
		if (loan == true) {
			System.out.println("What is your credit score?");
			score = scan.nextInt();

			if (score < 600) {
				eligibility = "Not eligible";
			} else if (score >= 600 && score <= 700) {
				eligibility = "Maybe eligible";
			} else if (score >= 701 && score <= 800) {
				eligibility = "Eligible";
			} else {
				eligibility = "Definitely eligible";
			}

		} else {
			eligibility = "Unknown";
		}
		System.out.println("The eligibility is " + eligibility);
	}
}
