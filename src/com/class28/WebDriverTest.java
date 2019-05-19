package com.class28;

public class WebDriverTest {
	public static void main(String[] args) {
		WebDriver wd = new FireFoxDriver();
		wd.openBrowser();
		wd.closeBrowser();
		wd.maximizeWindow();
		wd.findElemnt();
	}

}
