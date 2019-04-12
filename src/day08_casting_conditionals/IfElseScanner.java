package day08_casting_conditionals;

import java.util.Scanner;

public class IfElseScanner {
	public static void main(String[] args) {
		//passingPercentage = 65
		//yourScorePercentage = take from scanner;
		//check if you passed or failed
		
		Scanner input = new Scanner(System.in);
		int passingpercentage = 80;
		System.out.println("What is your score?");
		
		int yourScorePercentage = input.nextInt();
		
		if(yourScorePercentage >= passingpercentage) {
			System.out.println("YOU PASSED! CONGRATULATIONS");
		}else {
			System.out.println("YOU FAILED! STUDY MORE! DON'T BE SAD");
		
		
		System.out.println("Java is fun!");
		}
	}

}
