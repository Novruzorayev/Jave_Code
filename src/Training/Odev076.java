package Training;
import java.util.*;
public class Odev076 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String start = scan.next();
	    String end = scan.next();
	    if(start.equals("A") && end.equals("A")) {
	    	System.out.println(end+" found");
	    }else if(start.equals("A") && end.equals("B")) {
	    	System.out.println("right: "+end+" found");
	    }else if(start.equals("A") && end.equals("C")) {
	    	System.out.println("right > down: "+end+" found");
	    }else if(start.equals("A") && end.equals("D")) {
	    	System.out.println("right > down > left: "+end+" found");
	    }else if(start.equals("B") && end.equals("B")) {
	    	System.out.println(end+" found");
	    }else if(start.equals("B") && end.equals("C")) {
	    	System.out.println("down: "+end+" found");
	    }else if(start.equals("B") && end.equals("D")) {
	    	System.out.println("down > left: "+end+" found");
	    }else if(start.equals("B") && end.equals("A")) {
	    	System.out.println("down > left > up: "+end+" found");
	    }else if(start.equals("C") && end.equals("C")) {
	    	System.out.println(end+" found");
	    }else if(start.equals("C") && end.equals("D")) {
	    	System.out.println("left: "+end+" found");
	    }else if(start.equals("C") && end.equals("A")) {
	    	System.out.println("left > up: "+end+" found");
	    }else if(start.equals("C") && end.equals("B")) {
	    	System.out.println("left > up > right: "+end+" found");
	    }else if(start.equals("D") && end.equals("D")) {
	    	System.out.println(end+" found");
	    }else if(start.equals("D") && end.equals("A")) {
	    	System.out.println("up: "+end+" found");
	    }else if(start.equals("D") && end.equals("B")) {
	    	System.out.println("up > right: "+end+" found");
	    }else if(start.equals("D") && end.equals("C")) {
	    	System.out.println("up > right > down: "+end+" found");
	    }
	    	
	}

}
