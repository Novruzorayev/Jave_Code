package day23_Arrays_and_Loops;
import java.util.*;
public class Words {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * write a program that will take 6 words from the user concat words with a comma
		 * if word is equals to java
		 * skip this word
		 * print summary at the end of the program
		 */
		String word = "";
		String allWords = "";
		for(int i = 0; i <= 3; i++) {
			System.out.println("Type the word");
			word = scan.next();
			if(word.contentEquals("Java")) {
				continue;
			}
			allWords+= word+", ";
		}
		System.out.println("All words: "+allWords.substring(0,allWords.length()-2));
	}
}
