package Training;

import java.util.Scanner;

public class GradeCheckOdev {
	public static void main(String[] args) {
		
		/*A, B, C, D.
		 Char grade = scan.next().charAt(0);
		 if grade 'A' =>
		        Excelent Job! Keep it up!
		 else
		     How many points did you miss for 'A'?
		     int points = scanner
		     print" Your B is not good enough."
		            "You could earn 10 more points if you studied harder."
		            */
		char A, B, C, D;
		Scanner novruz = new Scanner(System.in);
		System.out.println("what is your grade?");
		char grade = novruz.next().charAt(0);
		if(grade == 'A') {
			System.out.println("Excelent Job! Keep it up!");
		}else {
			
			System.out.println("You SCREWED up");
			System.out.println("How man points did you miss for A");
			int points = novruz.nextInt();
			System.out.println("You could earn " +points+ " more points if you studied harder");	
			}
				
			}

			
		
		
		
		
		
		
	}

	
