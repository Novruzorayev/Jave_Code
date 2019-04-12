package day19_Transaction;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word to test");
		String word = scan.next();
		String reversed ="";
		//loop through word in reverse order and
		//concatenate each character to reversed string
		//compare if word and reserved are equal
		int idx = word.length()-1;
		while(idx >= 0) {
			reversed = reversed + word.charAt(idx);
			idx--;
		}
		System.out.println(reversed);
		if(reversed.equalsIgnoreCase(word)){
			System.out.println("it is palindrome");
		}else {
			System.out.println("it is not a palindrome");
		}
		
	}

}
