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

public class Day6 {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\This PC\\eclipse-workspace\\padmaMamProject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.id("singleframe"));
		//driver.switchTo().frame(name);
		driver.switchTo().frame(0);
		WebElement name2 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		name2.sendKeys("welcome to java");
		driver.switchTo().defaultContent();
		WebElement name3 = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		name3.click();
		WebElement name4 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(name4);
		WebElement name5 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(name5);
		WebElement name6 = driver.findElement(By.xpath("//input[@type='text']"));
		name6.sendKeys("welcome to java");
		driver.switchTo().defaultContent();
		
		TakesScreenshot  ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\This PC\\eclipse-workspace\\padmaMamProject\\screenshot//shot4.png");
		FileUtils.copyFile(source, destination);
		
		
		
		
	}
	
	

}
