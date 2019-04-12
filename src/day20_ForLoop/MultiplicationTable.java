package day20_ForLoop;
import java.util.*;
public class MultiplicationTable {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number:");
	int num = scan.nextInt();
	//check if it is valid
	// if it is not valid return
	// for loop to print multiplication table
		if(num < 1 || num > 10) {
			System.out.println("ERROR: Invalid input");
			return;
		}
		// for loop to print multiplication table
		for(int i = 1; i <= 10; i++) {
			System.out.println(num+" x "+i+" = "+(num*i)); //int result = num*i;   different way 
		}
	}
}
