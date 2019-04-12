package day_09_stringEquals_conditionals;

import java.util.*;

public class Languages {
      public static void main(String[] args) {
	int option = 6;
	/*
	 * 1=> English
	 * 2=> Spanish
	 * 3=> French
	 * 4=> Turkish
	 * 5=> Russian
	 * 6=> Greek
	 * 
	 */
	if(option==1) {
		System.out.println("Hello!");
	}else if(option==2) {
		System.out.println("Hola!");
	}else if(option==3) {
		System.out.println("Bonjour!");
	}else if(option==4) {
		System.out.println("Merhaba!");
	}else if(option == 5) {
		System.out.println("Privet");
	}else if(option == 6) {
		System.out.println("Yiasou");
		
		
		 Scanner scan = new Scanner(System.in);
		    int seniorCitizens, nonSeniorCitizens;
		    int age;
		   
		    System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		     seniorCitizens = scan.nextInt();
		     nonSeniorCitizens = scan.nextInt();
		    System.out.println("What is new citizen's age?");
		    age = scan.nextInt();
		    if(age >= 65){
		      System.out.println("Senior Citizen");
		      seniorCitizens++;
		      
		    }else{
		      System.out.println("Non-Senior Citizen");{
		      nonSeniorCitizens++;
		      System.out.println("New seniorCitizens count "+seniorCitizens);
		    System.out.println("New nonSeniorCitizens count "+nonSeniorCitizens);
		  
		    
		  }
		}
	
	}
      }
}
