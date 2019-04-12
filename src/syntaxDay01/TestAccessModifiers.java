package syntaxDay01;

public class TestAccessModifiers {
	public static void main(String[] args) {
	AccessModifiers obj = new AccessModifiers();
	obj.isPalindrome("madam"); //accessing public method
	obj.reverseString("hello");//accessing protected method
	obj.sayHello();//accessing protected method

	System.out.println(obj.name1);
	System.out.println(obj.name2);
	System.out.println(obj.name3);
}
}

