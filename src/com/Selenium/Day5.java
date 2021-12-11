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

public class Day5 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\This PC\\eclipse-workspace\\padmaMamProject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		WebElement element1 = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		element1.click();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		driver.switchTo().alert().accept();
		
		WebElement element2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		element2.click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		driver.switchTo().alert().dismiss();
		
		WebElement element3 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		element3.click();
		Thread.sleep(1000);
		WebElement element4 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		element4.click();
		String text5 = driver.switchTo().alert().getText();
		System.out.println(text5);
		
		
		driver.switchTo().alert().sendKeys("hey buddy");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		TakesScreenshot new1 = (TakesScreenshot)driver;
		File source = new1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\This PC\\eclipse-workspace\\padmaMamProject\\screenshot//shot3.png");
		FileUtils.copyFile(source, destination);
		
		WebElement name = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		
		
		
		
		
		
	}

}
