package day15_String_Manipulation;

public class WarmUpTask {
	public static void main(String[] args) {
		String emoji =";0";
		
		if(emoji.length() !=2) {
			System.out.println("Invalid emoji");
			return;
		}
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		
		if(first ==':') {
			if(second == ')') {
				System.out.println("smile");
			}else if (second == '(') {
				System.out.println("sad");
			}else if(second == '/') {
				System.out.println("upset");
			}else if(second == 'p') {
				System.out.println("playful");
			}else {
				System.out.println("Uknown emoji");
			}
		}else if(first == ';') {
			if(second == ')') {
				System.out.println("wink");
			}else if(second == '0') {
				System.out.println("surprised");
			}else {
				System.out.println("Uknown emoji");
			}
			
		}else if(first == '(') {
			if(second == ':') 
				System.out.println("smile");
		}else if(first == ')') {
			if(second == ':') 
				System.out.println("sad");
		}else {
			System.out.println("Invalid Emoji");
		
		}
	}
		
}
