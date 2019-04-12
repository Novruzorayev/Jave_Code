package Training;
import java.util.*;

public class Odev_065 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 String word = scan.next();
		    //YOUR CODE HERE
		if(word.length()==5) {
			System.out.print(word.charAt(1));
			System.out.print(word.charAt(2));
			System.out.print(word.charAt(3));
		}else if(word.length()==7) {
			System.out.print(word.charAt(2));
			System.out.print(word.charAt(3));
			System.out.print(word.charAt(4));
		}else {
			System.out.println("Invalid");
		}
	}
}
