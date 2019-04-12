package Training;

import java.util.*;

public class Odev_052 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter number:");
			int x = scan.nextInt();
			//WRITE YOUT CODE HERE
			int result;
			result =(x >= 5 && 5 >-x) ? x: -x;
			System.out.println(result);
	      
}
}

