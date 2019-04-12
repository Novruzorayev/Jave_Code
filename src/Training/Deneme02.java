package Training;
import java.util.*;
public class Deneme02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your word:");
		String word = scan.next(); // Novruz_Batyr&Mekan$Miyesser
		int underscore = word.indexOf("_");
		String nov = word.substring(0,underscore);
		int and = word.indexOf("&");
		String bat = word.substring(underscore+1,and);
		int dol = word.indexOf("$");
		String mek = word.substring(and+1,dol);
		String miy = word.substring(dol+1);
		String result = miy+"_"+mek+"&"+bat+"$"+nov;
		System.out.println(result);
		
	}

}
