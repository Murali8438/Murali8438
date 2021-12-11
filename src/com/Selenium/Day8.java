package com.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;

import net.bytebuddy.asm.Advice.Argument;
import net.bytebuddy.implementation.bind.ArgumentTypeResolver;

public class Day8 {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\This PC\\eclipse-workspace\\padmaMamProject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

	//	driver.get("https://www.flipkart.com/");

//		Actions s = new Actions(driver);
//
//		Thread.sleep(2000);
//
//		WebElement name = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//
//		name.click();
//
//		Thread.sleep(2000);
//
//		WebElement name1 = driver.findElement(By.xpath("//img[@alt='Top Offers']"));
//
//		s.contextClick(name1).build().perform();
//
//		Robot r = new Robot();
//
//		r.keyPress(KeyEvent.VK_DOWN);
//
//		r.keyRelease(KeyEvent.VK_DOWN);
//
//		r.keyPress(KeyEvent.VK_ENTER);
//
//		r.keyRelease(KeyEvent.VK_ENTER);
//
//		WebElement name2 = driver.findElement(By.xpath("//img[@alt='Grocery']"));
//
//		s.contextClick(name2).build().perform();
//
//		r.keyPress(KeyEvent.VK_DOWN);
//
//		r.keyRelease(KeyEvent.VK_DOWN);
//
//		r.keyPress(KeyEvent.VK_ENTER);
//
//		r.keyRelease(KeyEvent.VK_ENTER);
//
//		WebElement name3 = driver.findElement(By.xpath("//img[@alt='Mobiles']"));
//
//		s.contextClick(name3).build().perform();
//
//		r.keyPress(KeyEvent.VK_DOWN);
//
//		r.keyRelease(KeyEvent.VK_DOWN);
//
//		r.keyPress(KeyEvent.VK_ENTER);
//
//		r.keyRelease(KeyEvent.VK_ENTER);
//
//		WebElement name4 = driver.findElement(By.xpath("(//div[@class='_1psGvi SLyWEo'])[1]"));
//
//		s.contextClick(name4).build().perform();
//
//		r.keyPress(KeyEvent.VK_DOWN);
//
//		r.keyRelease(KeyEvent.VK_DOWN);
//
//		r.keyPress(KeyEvent.VK_ENTER);
//
//		r.keyRelease(KeyEvent.VK_ENTER);
//
//		Set<String> wind = driver.getWindowHandles();
//
//		for (String string : wind) {
//
//			System.out.println(driver.switchTo().window(string).getTitle());
//
//		}
//		String m = "Mobile Phones Online at Best Prices in India";
//
//		for (String string1 : wind) {
//
//			if (driver.switchTo().window(string1).getTitle().equalsIgnoreCase(m)) {
//
//				break;
//
//			}
//		}

//			Thread.sleep(5000);
//
//			String a = "Flipkart Offers & Deals of the Day - Get Best Discounts on Mobiles, Electronics, Fashion & Home etc.";
//
//			for (String k : wind) {
//
//				if (driver.switchTo().window(k).getTitle().equalsIgnoreCase(a)) {
//
//					break;
//
//				}
////
	//		}

		//	driver.get("https://www.microfocus.com/en-us/products/uft-one/overview");
			
		//	WebElement close = driver.findElement(By.xpath(""));

			//close.click();
			
			
			driver.get("https://www.flipkart.com/");
			
			Thread.sleep(2000);
			
//			WebElement cap = driver.findElement(By.xpath("(//div[@class='uk-width-expand'])[4]"));
//						
//			js.executeAsyncScript("arguments[0].scrollIntoView();",cap);
			
			WebElement name = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
			
			name.click();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;    // narrowing 
			
			Thread.sleep(2000);
			
			js.executeScript("window.scrollBy(0,1000)");
			
			Thread.sleep(2000);
			
			js.executeScript("window.scrollBy(0,-500)");
			
			Thread.sleep(2000);
			
			js.executeScript("window.scroll(0,0)");
			
			Thread.sleep(2000);
			
			WebElement mobile = driver.findElement(By.className("xtXmba"));
			
			js.executeScript("arguments[0].click();",mobile);
			
			WebElement search = driver.findElement(By.xpath("//input[@class='_3704LK']"));
			
			js.executeScript("arguments[0].value='redmi note12';",search);
			
			
			
			
			
			
			
		}
		

		
	}
	


