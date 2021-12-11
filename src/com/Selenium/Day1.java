package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
		
				"C:\\Users\\This PC\\eclipse-workspace\\padmaMamProject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	/*	driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit(); */
		//String title = driver.getTitle();
		//System.out.println(title);
		
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		
	
	}

}
