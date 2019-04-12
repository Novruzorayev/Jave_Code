package day08_casting_conditionals;

public class IfElseWithVariables {
	public static void main(String[] args) {
		int temperature = 65;
		
		if(temperature >= 66) {
			System.out.println("It is a nice day! Let's code Java");
		}else {
			System.out.println("Stay home and code Java");
			
		}
		
		//2 int variables, teamAScore, teamBScore
		//put a condition, check if teamA won. "Team A won".
		   //"Team A won".
		   // Go TEAM A!
		//else "team b won or it was a draw
		
		int teamAScore = 5; 
		int teamBScore = 5;
		if(teamAScore < teamBScore) {
			System.out.println("Team A won!");
			System.out.println("Go Team A!");
		}else {
			System.out.println("Team B won or it was a draw");
			System.out.println("Go Team B");
			
		
			
		}
	}

}
