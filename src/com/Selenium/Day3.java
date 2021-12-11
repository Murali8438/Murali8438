package com.Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day3 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\This PC\\eclipse-workspace\\padmaMamProject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");

		driver.manage().window().maximize();

		WebElement signUp = driver.findElement(By.xpath("//a[@href=\"/r.php?locale=en_GB&display=page\"]"));
		signUp.click();

		Thread.sleep(2000);

		WebElement first = driver.findElement(By.name("firstname"));

		first.sendKeys("murali");
		WebElement last = driver.findElement(By.name("lastname"));
		last.sendKeys("kumar");

		WebElement number = driver.findElement(By.xpath("(//input[@type='text'])[3]"));

		number.sendKeys("9934262825");

		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("mk00752@");

		WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		gender.click();

		WebElement nall = driver.findElement(By.id("day"));
		Select name1 = new Select(nall);
		name1.selectByValue("12");
		WebElement mon = driver.findElement(By.id("month"));
		Select name2 = new Select(mon);
		name2.selectByIndex(2);
		WebElement varudam = driver.findElement(By.id("year"));
		Select name3 = new Select(varudam);
		name3.selectByVisibleText("1998");

		WebElement create = driver.findElement(By.xpath("(//button[contains(text() ,'Sign Up')])[1]"));
		create.click();
		Thread.sleep(7000);
		TakesScreenshot ts = (TakesScreenshot) driver;

		File sourse = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File("C:\\Users\\This PC\\eclipse-workspace\\padmaMamProject\\screenshot//shot2.png");
		FileUtils.copyFile(sourse, destination);
//		Thread.sleep(2000);
//		TakesScreenshot name = (TakesScreenshot) driver;
//
//		File shot = name.getScreenshotAs(OutputType.FILE);
//		File destination = new File("C:\\Users\\This PC\\eclipse-workspace\\padmaMamProject\\screenshot//shot2.png");
//		FileUtils.copyDirectory(shot, destination);

	}

}
