package Training;

import java.util.*;

public class Nothing {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		if (num < 1 || num > 10) {
			System.out.println("Invalid number!!!!");
			return;
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "x" + i + "= " + ( num * i));
		}
	}

}
