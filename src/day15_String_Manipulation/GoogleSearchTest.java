package day15_String_Manipulation;

public class GoogleSearchTest {
	public static void main(String[] args) {
		String item = "java";
		String pageTitle = item + "- Google Search";
		
		if(pageTitle.startsWith("j")) {
			System.out.println("Page title check passed");
		}else{
			System.out.println("FAIL: Page title check failed");
			
		if(pageTitle.endsWith("Google Search")) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
			
		
		}
	}

}
