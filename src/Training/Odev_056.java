package Training;

import java.util.*;

public class Odev_056 {
	public static void main(String[] args) {
		  double price = 0;
			String storageType, screenType, cpu, memory, resolution;
			int ram = 0 ;
			Scanner scan = new Scanner(System.in);
	    //WRITE YOUR CODE HERE
	    System.out.println("Select screen size:");
	    screenType = scan.next();
	    if(screenType.equals("13.3")) {
	    price +=200;}
	    if(screenType.equals("15.0")) {
	    price +=300;}
	    if(screenType.equals("17.3")) {
	    price +=400;}
	    System.out.println("Select CPU type:");
	    cpu = scan.next();
	    if(cpu.equals("i3")) {
	    price += 150;}
	    if(cpu.equals("i5")) {
		price += 250;}
	    if(cpu.equals("i7")) { 
		price += 350;}
	    System.out.println("Select RAM size:");
	    ram = scan.nextInt();
	    if(ram >= 4 && ram <=8){
		price +=50;}
	    System.out.println("Select storage type:");
	    storageType= scan.next();
	    if(storageType.equalsIgnoreCase("HDD")) {
	    price +=50;}
	    if(storageType.equals("SSD")) {
	    price +=100;}
	    System.out.println("Enter memory size:");
	    memory = scan.next();
	    System.out.println("Enter the screen resolution:");
	    resolution = scan.next();
	    if(resolution.equalsIgnoreCase("FULLHD")) {
	    price +=50;}
	    if(resolution.equalsIgnoreCase("4K")) {
	    price +=100;}
	    System.out.println("Laptop price is: "+price);
	    
	    }    
}
	


