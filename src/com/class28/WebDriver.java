package com.class28;

public interface WebDriver {
	/*
	 * Create a WebDriver Interface that will have the following unimplemented behavior: openBrowser(), closeBrowser(), maximizeWindow(), findElement(). 
	 * Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
	 */
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElemnt();
}
class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Chrome driver opens browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Chrome driver closes browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Chrome driver maximize window");
		
	}

	@Override
	public void findElemnt() {
		System.out.println("Chrome driver finds elements");
		
	}
	
}
class FireFoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Firefox Driver opens browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Firefox Driver opens browser");
		
	}

	@Override
	public void maximizeWindow() {
		
		System.out.println("Firefox Driver maximize window");
	}

	@Override
	public void findElemnt() {
		System.out.println("Firefox Driver find elements");
		
	}
	
}