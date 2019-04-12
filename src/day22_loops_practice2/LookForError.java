package day22_loops_practice2;
import java.util.*;
public class LookForError {
	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
		String link  = scan.next();
		int counta = 0;
		int countb = 0;
		int countc = 0;
		for(int i = 0; i <= link.length()-1; i++) {
			if(link.substring(i, i+1).equals("a")) {
				counta++;
			}else if(link.substring(i, i+1).equals("b")) {
				countb++;
			}else if(link.substring(i, i+1).equals("c")) {
				countc++;
			}
		}
		System.out.print("Count A: "+counta+" Count B: "+countb+" Count C: "+countc);
	}
}