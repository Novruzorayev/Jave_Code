package day16_string_manipulation;

import java.util.*;

public class UrlWarmUp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter url:");
		String url = scan.next();

		if(url.startsWith("www.")) {
			System.out.println("www is present");
		}else  {
			System.out.println("Invalid url format");
			return;}
			
		int dotIndex = url.length()-4;	
		if(url.charAt(dotIndex) == '.') {
            System.out.println(". is there before extension");
		}else {
			System.out.println(". might be misplaced");}
			
			//get domain 
			String domain = url.substring(4, dotIndex);
			System.out.println("Domain: "+domain);
			//get extension
			String extension = url.substring(dotIndex+1, url.length());
			System.out.println("Extension: "+extension);
		}
	
		}
	


