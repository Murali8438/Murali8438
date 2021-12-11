package com.Selenium;

import java.io.File;
import java.awt.Robot;
import java.io.IOException;
import java.awt.event.KeyEvent;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.AWTException;
public class Day7 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\This PC\\eclipse-workspace\\padmaMamProject\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/drop.html");
		
		WebElement name1 = driver.findElement(By.id("draggable"));
		
		WebElement name2 = driver.findElement(By.id("droppable"));
		
		Actions name = new Actions(driver);
		
	//	name.dragAndDrop(name1, name2).build().perform();
		
		name.clickAndHold(name1).moveToElement(name2).release().build().perform();
		
//		Thread.sleep(2000);
//		
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		
//		File n = ts.getScreenshotAs(OutputType.FILE);
//		
//		File destination = new File("C:\\Users\\This PC\\eclipse-workspace\\padmaMamProject\\screenshot//shot7.png");
//		
//		FileUtils.copyFile(n, destination);
		
		driver.get("https://www.amazon.com/");
		
		WebElement page = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_0']"));
		
		name.contextClick().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
