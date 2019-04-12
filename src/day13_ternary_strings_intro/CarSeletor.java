package day13_ternary_strings_intro;

import java.util.*;

public class CarSeletor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Which type of car you are interested in?");
		System.out.println("1) American\n2) Japanese\n3) German\n4) Italian\n5) Korean");
		int carType = scan.nextInt();
		double averagePrice = 0.0;
		String carOptions = "";
		String carOrigins ="";
	   
		switch(carType) {
		case 1:
			averagePrice = 33000.0;
			carOptions = "Ford, Dodge, Tesla, Chevrolet, Lincoln";
			carOrigins = "American";
			break;
		case 2:
			averagePrice = 32000.0;
		      carOptions = "Toyota, Mitsubisi, Honda, Subaru, Mazda";
		      carOrigins = "Japanese";
		      break;
		case 3:
			averagePrice = 55000.0;
			carOptions = "Bmw, VW, Audi, Mercedes, Porsche";
			carOrigins = "German";
			break;
		case 4:
			averagePrice = 85000.0;
			carOptions = "Alfa Romeo, Ferrari, Lamborghini,Fiat";
			carOrigins = "Italian";
			break;
		case 5:
			averagePrice = 25000;
			carOptions = "Kia, Hyundai, Daewoo";
			carOrigins = "Korean";
			break;
		default:
			System.out.println("Car type not available");
			return;
		}
		System.out.println("Your selected "+carOrigins+" car and your options are "+carOptions+".");
		System.out.println("Average Price: "+averagePrice);
			
	}

}
