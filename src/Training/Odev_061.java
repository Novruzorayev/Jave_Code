package Training;

import java.util.*;

public class Odev_061 {
	public static void main(String[] args) {
	    //DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    //WIRTE YOUR CODE HERE
	    if(word1.length() > word2.length()) {
			System.out.println(word1);
		}else if(word2.length() > word1.length()) {
			System.out.println(word2);
		}else {
			System.out.println(word1+" and "+word2+" are same length");
		}
		
	}

}
