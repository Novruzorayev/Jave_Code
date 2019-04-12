package day23_Arrays_and_Loops;
import java.util.*;
public class WarmUpTask23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
;		int num = scan.nextInt();
		for(int i = 2; i < num; i++) {
			if(num %i==0) {
				System.out.println("it's not a prime number");
			return;
				
			}
		}
		System.out.println("it's a prime number");
	}

}
