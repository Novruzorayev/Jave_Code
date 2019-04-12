package Training;

import java.util.*;

public class Odev_054 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    System.out.println("Enter number1:");
				int num1 = scan.nextInt();
				System.out.println("Enter number2:");
				int num2 = scan.nextInt();
				//WRITE YOUR CODE HERE
				int large;
				large=(num1>num2 && num2<num1) ? num1: num2;
				System.out.println(large);
			
		  }
		}