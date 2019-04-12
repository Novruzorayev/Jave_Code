package day15_String_Manipulation;

public class IndexOf {
	public static void main(String[] args) {
		String word1 = "github";
		System.out.println(word1.indexOf('g'));
		System.out.println(word1.indexOf("th"));
		System.out.println(word1.indexOf("hub"));
		System.out.println(word1.indexOf("jva"));
		
		
		String url = "www.okta.com";
		int index = url.indexOf(".");
		System.out.println("Pos of . :" +index);
		System.out.println(url.charAt(index+1));
		
		String title ="Java - Goohgle Search";
		int index1 = title.indexOf("-");
		System.out.println("Pos of - :" +index1);
		System.out.println(title.charAt(index1 - 2));
		System.out.println(title.charAt(index1 + 2));
		
		String word2 = "Java, c++, python, tomcat, eclipse";
		if(word2.contains("c++")) {
			System.out.println("c++ is in there");
		}else {
			System.out.println("c++ is not there");
		}

		


	}

}
