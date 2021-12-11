package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\This PC\\eclipse-workspace\\padmaMamProject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// driver.manage().window().maximize();

//		Dimension d = new Dimension(500,300);
//		driver.manage().window().setSize(d);
//		
//		Point c = new Point(200,200);
//		driver.manage().window().setPosition(c);

//		driver.navigate().to("https://www.amazon.in/");
//		driver.navigate().back();
//		driver.navigate().forward();
//		Thread.sleep(1000);
//		driver.navigate().refresh();

//		driver.quit();

		// web Elements

//		WebElement email = driver.findElement(By.id("email"));
//		
//		email.sendKeys("james@gmail.com");
//		
//		WebElement password = driver.findElement(By.id("pass"));
//		password.sendKeys("test@123");
//		
//		WebElement logIn = driver.findElement(By.id("loginbutton"));
//		logIn.click();
//		
//		driver.navigate().back();

//		WebElement signIn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		signIn.click();
		
		WebElement signUp = driver.findElement(By.linkText("Create New Account"));
		signUp.click();
//		driver.findElement(By.xpath("//a[@href='/r.php?locale=en_GB&display=page']")).click();
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.name("firstname"));
		name.sendKeys("Murali");

		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("kumar");

		WebElement phone = driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
		phone.sendKeys("9626079366");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id=\"password_step_input\"]"));
		pass.sendKeys("Murali@007");
		
		WebElement gender = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		gender.click();
		
		
		
	}

}
