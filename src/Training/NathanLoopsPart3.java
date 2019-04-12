package Training;
import java.util.*;
public class NathanLoopsPart3 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Please enter your word: ");
	String word = scan.next();
	for(int i = 0; i < word.length(); i++){
		int rCount = 0;
		if(word.charAt(i)=='r') {
			rCount++;
		}
		System.out.println("Your word has "+rCount+" r's in it");
	}
}
}
