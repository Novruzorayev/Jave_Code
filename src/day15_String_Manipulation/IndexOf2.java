package day15_String_Manipulation;

public class IndexOf2 {
	public static void main(String[] args) {
		String list = "html-selenium-angular-jenkins-grid";
		int firstDash = list.indexOf("-");
		System.out.println("First dash: "+firstDash);
		
		int secondDash = list.indexOf("-",5);
		System.out.println("second dash:"+secondDash);
		// find the third one by one using secondDash
		int thirdDash = list.indexOf("-j");
		System.out.println("third dash: "+thirdDash);
		int thirdDash2 = list.indexOf("-",list.indexOf("-g"));
		System.out.println(thirdDash2);
		int lastDash = list.lastIndexOf("-");
		System.out.println("last dash: "+lastDash);
	}

}
