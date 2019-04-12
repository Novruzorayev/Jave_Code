package day13_ternary_strings_intro;

public class MoreTernary {
	public static void main(String[] args) {
		String quality ="good";
		int rating = (quality.equals("good"))? 100 : 0;
		System.out.println("Rating: "+rating);
		
		int PMhour = 6;
		// Rush hour during evening: 4-7
		boolean rushHour = (PMhour>=4 && PMhour<=7)? true : false;
		//System.out.println(PMhour+" is rush hour? "+rushHour);
		String result = rushHour == true ? "Yes" : "no";
		//System.out.println(PMhour+" is rush hour " + result);
		int AMHour = 8; //6-9
		//6-9 amRushHour -n yes, no
		String amRushHour = AMHour >=6 && AMHour <=9 ? "Yes" : "No";
		System.out.println(AMHour+" is rush hour: " +amRushHour);
	}

}
