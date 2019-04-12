package day11_logical_nestedif;

import java.util.*;

public class HappyValleySystem {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = keyboard.nextInt();
		
		if (age < 2 || age > 18) {
			System.out.println("ineligible");
		}else if (age == 2) {
			System.out.println("toddler");
		}else if(age == 3 || age < 6) {
			System.out.println("early childhod");
		}else if(age == 6 || age < 8) {
			System.out.println("young reader");
		}else if(age >= 8 && age <= 10) {
			System.out.println("elementary");
		}else if(age == 11 || age == 12) {
			System.out.println("middle");
		}else if(age==13) {
			System.out.println("imposible");
		}else if(age == 14 || age < 17) {
			System.out.println("high school");
		}else if(age == 17 || age < 19) {
			System.out.println("scholar");
		}
		
	}

}
