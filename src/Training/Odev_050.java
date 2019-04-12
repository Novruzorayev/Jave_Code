package Training;

import java.util.*;

public class Odev_050 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("Enter status code:");
		    int status = scan.nextInt();
		    //WRITE YOUR CODE HERE 
		    
		    switch(status) {
		    case 200:
		    	System.out.println("OK");
		    break;
		    case 201:
		    	System.out.println("Created");
		    break;
		    case 202:
		    	System.out.println("Accepted");
		    break;
		    case 301:
		    	System.out.println("Moved Permanently");
		    break;
		    case 303:
		    	System.out.println("see other");
		    break;
		    case 304:
		    	System.out.println("Not Modofied");
		    break;
		    case 307:
		    	System.out.println("Temporary Redirected");
		    break;
		    case 400:
		    	System.out.println("Bad Request");
		    break;
		    case 402:
		    	System.out.println("Unauthorized");
		    break;
		    case 403:
		    	System.out.println("Forbidden");
		    break;
		    case 404:
		    	System.out.println("Not Found");
		    break;
		    case 410:
		    	System.out.println("Gone");
		    break;
		    case 500:
		    	System.out.println("Internal Server Error");
		    break;
		    case 503:
		    	System.out.println("Service Unavailable");
		    break;
		    default:
		    	System.out.println("Ivalid status code!");
		    }
		    
		    
		  
		
	}

}
