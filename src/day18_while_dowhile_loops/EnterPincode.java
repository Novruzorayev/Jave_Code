package day18_while_dowhile_loops;
import java.util.*;
public class EnterPincode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int secretPinCode = 12345;
		int pincode = 0;
		while(pincode!= 12345) {
			System.out.println("Enter your pincode");
			pincode = scan.nextInt();
		}
		    System.out.println("ACCESS GRANTED");
	}

}
