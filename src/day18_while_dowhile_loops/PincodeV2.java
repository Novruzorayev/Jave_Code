package day18_while_dowhile_loops;
import java.util.*;
public class PincodeV2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int secretPincode = 4321;
	//give only 3 attempts
	//if attempts reaches more than 3 print card blocked.
	
	int pincode = 0;
	int attempts = 1;
	while(pincode != secretPincode) {
		System.out.println("Enter Pincode");
		pincode =scan.nextInt();
		attempts++;
	}
	System.out.println("Your Access is Granted");
}
}
