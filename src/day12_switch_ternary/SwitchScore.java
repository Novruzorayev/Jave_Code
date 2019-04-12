package day12_switch_ternary;

public class SwitchScore {
	public static void main(String[] args) {
		int score = 2;//if score is more than 2(example 3,4,5,6,...) and there is no case for it then we use default (its like ELSE)
		//1
		//2
		switch(score) {  // with swith statement we can only test if a variable equal certain values.
		case 1:
			System.out.println("Score is 1");
			break;//break means exit statement
		case 2:
			System.out.println("Score is 2");
		    break;
		case 3:
			System.out.println("Score is 3");
			break;
	}

}
}