package Training;

public class NathanLoopsPart2Task2 {
	public static void main(String[] args) {
//		 Task
//		  Print the word Mehmet by visiting and printing each of its characters using a for loop
		 
		String name = "Novruz";
		for(int i = name.length()-1; i>=0; i--) {
			System.out.print(name.charAt(i));
		}
	}

}
