package day19_Transaction;

import java.util.Random;
import java.util.Scanner;

public class GuessANumberV2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		System.out.println("### welcome to GUESSANUMBER game");
		int secretnumber = random.nextInt(100);
		int guessnumber = 0;
		do {
		System.out.println("Enter your number");
		guessnumber = scan.nextInt();
		if(guessnumber < secretnumber) {
			System.out.println("Your number is too small");
		}else if(guessnumber > secretnumber) {
			System.out.println("your number is too large");
		}
		}while(secretnumber != guessnumber);
		System.out.println("your number is correct, you won!");

	}
	
	}


