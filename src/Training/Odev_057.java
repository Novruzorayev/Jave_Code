package Training;

import java.util.*;

public class Odev_057 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter full name:");
		String name = scan.nextLine();
		
		if(name.equalsIgnoreCase("Max Payne")) {
			System.out.println("User found!");
		}else if(name.equalsIgnoreCase("Alan Wake")) {
			System.out.println("User found!");
		}else {
			System.out.println("User not found");
		}
			
		
	}
	}