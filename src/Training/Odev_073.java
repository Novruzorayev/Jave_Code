package Training;
import java.util.*;
public class Odev_073 {
	public static void main(String[] args) {
		
	 Scanner scan = new Scanner(System.in);
	 String email = scan.next();
	 String first = email.substring(email.indexOf("0")+1,email.indexOf("_"));
	 first = first.substring(0,1).toUpperCase()+first.substring(1);
	 System.out.println("First name: "+first);
	 String last = email.substring(email.indexOf("_")+1, email.indexOf("@"));
	 last = last.substring(0,1).toUpperCase()+last.substring(1);
	 System.out.println("Last name: "+last);
	 String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
	 System.out.println("Domain: "+domain);
	 String topDomain = email.substring(email.indexOf(".")+1);
	 System.out.println("Top-Level Domain: "+topDomain);
	}
}
