package Training;

import java.util.*;

public class Odev_055 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 String days;
	   System.out.println("Enter number:");
	   days = scan.next();
	   switch(days) {
	   case "1":
		   System.out.println("Monday");
		   break;
	   case "2":
		   System.out.println("Tuesday");
		   break;
	   case "3":
		   System.out.println("Wednesday");
		   break;  
	   case "4":
		   System.out.println("Thursday");
		   break;
	   case "5":
		   System.out.println("Friday");
		   break;
	   case "6":
		   System.out.println("Saturday");
		   break;
	   case "7":
		   System.out.println("Sunday");
		   break;
	   default:
		   System.out.println("Invalid number");
	   }
	  } 
	}


