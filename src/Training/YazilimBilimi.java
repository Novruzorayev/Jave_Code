package Training;

import java.util.Scanner;

public class YazilimBilimi {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bankAccount = 3000;
		int num = 0;
		int wallet = 0;;
		System.out.println("Press 1 to deposit money");
		System.out.println("Press 2 to withdraw money");
		System.out.println("Press 3 to ask questions");
		System.out.println("Press 4 Urgent situations");
		System.out.println("Press 5 other");
		System.out.println();
		System.out.print("Enter a number:");
		num = scan.nextInt();
		switch(num) {
		case 1:
			System.out.println("How much would you like to deposit?");
			wallet = scan.nextInt();
			if(wallet > 1000 ) {
				System.out.println("Invalid amount");
				break;
			}else {
				bankAccount+= wallet;
				System.out.println("Your account is "+bankAccount);
				break;
				}
		case 2:
			System.out.println("How much would you like to withdraw?");
			wallet = scan.nextInt();
			if(wallet < 10) {
				System.out.println("Small amount");
				break;
			}else {	
				bankAccount-=wallet;
				System.out.println("Your account is "+bankAccount);
				break;
			}
			
		case 3:
			System.out.println("Please wait for a while!");
			break;
		case 4:
			System.out.println("Hello my name is Novruz and I am gonna help you to assist");
			break;
		case 5:
			System.out.println("You pressed Other");
			break;
		default:
			System.out.println("You pressed Invalid Number");
		}
	}

}
