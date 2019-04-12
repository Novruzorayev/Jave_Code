package Training;

import java.util.*;

public class Odev_067 {
public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
     
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    if(word.length()<=4){
	      System.out.println("Too short!");
	    }else if(word.length()>=6) {
	    	System.out.println("Too long!");
	    }else {
	    	StringBuffer nov = new StringBuffer(word);
	    	System.out.println(nov.reverse());
	  
	    }
}
}
