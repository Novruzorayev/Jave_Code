package Training;

import java.util.Scanner;

public class Parola1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userName = "Novruz";
		String password = "12345";
		System.out.print("ENTER YOUR USER NAME: ");
		userName = scan.next();
		System.out.print("ENTER YOUR PASSWORD: ");
		password = scan.next();
		if(!userName.equals("Novruz") && !password.equals("12345")){
			System.out.println("Your User name and Password are Invalid!");
		}else if(userName.equals("Novruz") && !password.equals("12345")) {
			System.out.println("Your password is Invalid!");
		}else if(!userName.equals("Novruz") && password.equals("12345")) {
			System.out.println("Your User Name is Invalid!");
		}else {
			System.out.println("You have successfully legged in!!!");
		}
	}

}
