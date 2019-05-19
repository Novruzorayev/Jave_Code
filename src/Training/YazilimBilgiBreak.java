package Training;
import java.util.*;
public class YazilimBilgiBreak {
	public static void main(String[] args) {
		int age = 0;
		String answer = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your age: ");
		age = scan.nextInt();
		while(age <=18) {
			System.out.println("You are not eligible to vote!!!");
			return;
		}
		System.out.println("Are you sure?");
		answer = scan.next();
		if(answer.equalsIgnoreCase("yes")) {
			System.out.println("Alright you can vote");

		
	}
	
	}
	}

