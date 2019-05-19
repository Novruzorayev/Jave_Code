package com.class20;
import java.util.*;
public class SyntaxTask01 {
	public static void main(String[] args) {
		/*
		 * Create a method creatEmail();
		 * Based on provided users name,lastName and email type.
		 * your method should  return complete email Address;
		 * johnsnow@gmail.com
		 * johnsnow@.yahoo.com
		 */
//		String usersName = "Novruz";
//		String lastName = "orayev";
//		String mailType = "gmail";
//		String Email = usersName+lastName+"@"+mailType+".com";
//		System.out.println(Email);
		
		SyntaxTask01 obj= new SyntaxTask01();
		String email = obj.createEmail("Jhon", "Snow", "gmail");
		System.out.println(email);
		
	}

	private String createEmail(String name, String lastName, String emailType) {
		// TODO Auto-generated method stub
		String email = name+lastName+"@"+emailType+".com";
		return email.toLowerCase();
	}
//	int score = 0;{
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a grade:");
//		score = scan.nextInt();
//	if(score > 90) {
//		System.out.println("Your garde is A");
//	}else if(score >80) {
//		System.out.println("Your garde is B");
//	}else if(score > 70) {
//		System.out.println("Your garde is C");
//	}else if(score > 50) {
//		System.out.println("Your garde is D");
//	}else {
//		System.out.println("You are Failed!! study more!!!");
//	}
//	}
	

}
