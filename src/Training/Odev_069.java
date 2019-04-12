package Training;
import java.util.*;

public class Odev_069 {
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //WRITE YOUR CODE HERE
		    if(word.length() == 4 || word.length() == 5) {
		    	System.out.print(word.charAt(0));
		    	System.out.print(word.charAt(1));
		    	System.out.print(word.charAt(0));
		    	System.out.print(word.charAt(1));
		    	
            }else if(word.length()==8 || word.length() == 9) {
            	System.out.print(word.charAt(0));
		    	System.out.print(word.charAt(1));
		    	System.out.print(word.charAt(2));
		    	System.out.print(word.charAt(3));
		    	System.out.print(word.charAt(0));
		    	System.out.print(word.charAt(1));
		    	System.out.print(word.charAt(2));
		    	System.out.print(word.charAt(3));
          
            }

		 
	}

}
