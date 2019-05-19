package Training;
import java.util.*;
public class Review {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your word:");
		String word = scan.next();
//		String word = "Novruz";
//		System.out.print(word.charAt(4));
//		System.out.print(word.charAt(2));
//		System.out.print(word.charAt(1));
//		System.out.print(word.charAt(5));
//		System.out.print(word.charAt(0));
//		System.out.print(word.charAt(3));
		
		
		
//		for(int i = 0; i < word.length();i++) {
//			System.out.print(word.substring(i,i+1));
		
//		
//		for(int i = word.length()-1; i >= 0; i--) {
//			System.out.print(word.charAt(i));
		
		for(int i = word.length()-1; i >= 0; i--) {
			System.out.print(word.charAt(i));
			
		}
		System.out.println(" is reversed ");
	}
		
	}

