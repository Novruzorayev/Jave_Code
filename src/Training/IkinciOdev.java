package Training; 

import java.util.Scanner;

public class IkinciOdev {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String fullName, address, contacts, firstName, lastName, email, street, city, state;
	    int zipcode, age;
	    double height, weight;
	    long workPhoneNumber, personalPhoneNumber;
	    boolean isMarried;
	    System.out.println("Welcome to the patient portal!");
	    System.out.println("Please enter your personal information!");
	    System.out.println("Enter your first name!");
	    firstName = scan.nextLine();
	    System.out.println("Enter your last name!");
	    lastName = scan.nextLine();
	    System.out.println("Enter your email!");
	    email = scan.nextLine();
	    System.out.println("Enter your street!");
	    street = scan.nextLine();
	    System.out.println("Enter your city!");
	    city = scan.nextLine();
	    System.out.println("Enter your state!");
	    state = scan.nextLine();
	    System.out.println("Enter your zipcode!");
	    zipcode = scan.nextInt();
	    System.out.println("Enter your work phone number!");
	    workPhoneNumber = scan.nextLong();
	    System.out.println("Enter your personal phone number!");
	    personalPhoneNumber = scan.nextLong();
	    System.out.println("Enter your age!");
	    age = scan.nextInt();
	    System.out.println("Enter your height!");
	    height = scan.nextDouble();
	    System.out.println("Enter your weight!");
	    weight = scan.nextDouble();
	    System.out.println("Are you married?");
	    isMarried = scan.nextBoolean();
	    
	    System.out.println("Patient personal information");
	    fullName = "Full Name: "+firstName+", "+ lastName;
	    System.out.println(fullName);
	    address = "Address: " +street+","+city+"," +state+" " +zipcode;
	    System.out.println(address);
	    contacts = "Contacts: "+"work phone number- "+workPhoneNumber+","+ " personal phone number- " + personalPhoneNumber+","+ " email: " +email;
	    System.out.println(contacts);
	    System.out.println("Age: "+age);
	    System.out.println("Height: "+height);
	    System.out.println("Weight: "+weight+" pounds");
	    System.out.println("Married: "+isMarried);
	   
	   
	    

	    }
  	   
}

