package day_09_stringEquals_conditionals;

import java.util.Scanner;

public class Canada {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String capital;
		System.out.println("What is the capital of Canada");
		capital = scan.nextLine();
		if(capital.equalsIgnoreCase("Ottawa")) {  //equalsIgnoreCase it doesn't matter if its upper or lower case.
			System.out.println("Your answer is correct!");
		}else {
			System.out.println("Your answer is incorrect! "+capital+" is not capital of Canada");
		}
		
	}

}
