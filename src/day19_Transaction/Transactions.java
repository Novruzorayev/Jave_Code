package day19_Transaction;

import java.util.*;

public class Transactions {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Whats is your current balance?");
		double balance = scan.nextDouble();
		int count = 0;
		while (balance > 0) {
			count++; // increase transaction by 1.
			System.out.println("What is transaction #" + count + " amount?");
			double transaction = scan.nextDouble();
			if (transaction > balance) {
				System.out.println("Your balance is about to be negative due to this transaction");
			}
			balance -= transaction;
			System.out.println("Current balance:" + balance);
		}
		System.out.println("you have insufficient funds, your balance is " + balance);
		System.out.println("Transaction total count: " + count);
	}
}
