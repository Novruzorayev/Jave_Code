package Training;
import java.util.*;
public class CumaGunu {
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    String separator = scan.next();
		    int count = scan.nextInt();
		    for(int i = count; i >= 1; i--){
		    
		      System.out.print(word);
		      if(i-1 == 0){
		      }else{
		        System.out.print(separator);
		      }
		    }
		   
		  }
}
