package Training;

import java.util.Scanner;

public class YazilimBilimiDoWhileLoops {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		int remainder = 0;
		int sum = 0;
		do {
			remainder+= num%10;
			num = num/10;
			System.out.println("Remainder: "+remainder+" number: "+num);
		}
		while(num>0);
		System.out.println("Total: "+remainder);
	}

}
