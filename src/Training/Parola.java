package Training;

import java.util.Scanner;

public class Parola {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userName = "Novruz_Orayev";
		int password = 12345;
		int attempts = 3;
			
		
		for (int i = attempts; i>0 ; i--) {
			System.out.print("Enter your User name: ");
			userName = scan.next();
			if (userName.equals("Novruz")){
				System.out.print("Enter your password: ");
				password = scan.nextInt();
				if ( password != 12345) {
					attempts--;
					System.out.println("Your informations are wrong please try again");
					if (attempts == 0) {
						System.out.println("Your account is suspended!");
						break;
					}
				}
				if (password == 12345) {
					System.out.println("You successfully logged in!");
					break;
				}
			}else {
				attempts--;
				if (attempts == 0) {
					System.out.println("Your account is suspended!");
					break;
				}
			}
		}
		
}
}


