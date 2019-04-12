package Training;
import java.util.*;
public class Odev_072 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String email = scan.next();
		   if(email.contains("_")) {
			   int underscore = email.indexOf("_");
			   String name = email.substring(0,underscore);
			   int atSign= email.indexOf("@");
			   String lname = email.substring(underscore+1,atSign);
			   System.out.println(lname+"_"+name+"@gmail.com");
			   
		   } else {
			   System.out.println(email);
		   }
		  }
		}
