package Training;

import java.util.*;

public class weekend {
	public static void main(String[] args) {
		String answer = "";
		String subject1 = "Java";
		String subject2 = "Manual testing";
		Scanner scan = new Scanner(System.in);
		System.out.println("Is it weekend?");
		answer = scan.next();
		if (!answer.equals("Yes")) {
			System.out.println("Today you will be learning " + subject1);
		} else {
			System.out.println("Today you will be learning " + subject2);
		}
	}
}