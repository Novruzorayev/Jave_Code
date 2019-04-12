package Training;

import java.util.*;

public class Odev_043 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = scan.nextInt();
		System.out.println("Enter second number:");	
		int num2 = scan.nextInt();
		System.out.println("Enter third number:");	
		int num3 = scan.nextInt();
		
		if(num1>num2&&num1<num3) {
			System.out.println("medium number is: "+num1);}
		if(num1<num2&&num1>num3) {
			System.out.println("medium number is: "+num1);}
		if(num2>num3&&num2<num1) {
			System.out.println("medium number is: "+num2);}
		if(num2<num3&&num2>num1) {
			System.out.println("medium number is: "+num2);}
		if(num3>num1&&num3<num2) {
			System.out.println("medium number is: "+num3);}
		if(num3<num1&&num3>num2) {
			System.out.println("medium number is: "+num3);}
		
		
	}
}