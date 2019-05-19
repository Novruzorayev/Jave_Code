package Training;

import java.util.*;

public class task {
	public static void main(String[] args) {
		String drink = "";
		boolean word1, word2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Are you tirsty?");
		word1 = scan.nextBoolean();
		System.out.println("Are you sleepy?");
		word2 = scan.nextBoolean();
		if (word1 && (!word2)) {
			drink = "Water";
		} else if (word1 && word2) {
			drink = "Coffee";
		} else if (!word1 && word2) {
			drink = "Tea";
		} else {
			drink = "Nothing";
		}

	}
}
