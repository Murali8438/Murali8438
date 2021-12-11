package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\This PC\\eclipse-workspace\\padmaMamProject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
//		WebElement test1 = driver.findElement(By.id("dropdown1"));
//		//test1.click();
//		Select s = new Select(test1);
//		s.selectByIndex(2);
//		WebElement test2 = driver.findElement(By.name("dropdown2"));
//		Select s1 = new Select(test2);
//		s1.selectByValue("4");
//		
//		WebElement test3 = driver.findElement(By.className("dropdown"));
//		Select s2 = new Select(test3);
//		s2.selectByVisibleText("Selenium");

		WebElement name1 = driver.findElement(By.xpath("(//select)[6]"));
		Select s = new Select(name1);
		s.selectByIndex(0);
		s.selectByValue("2");
		s.selectByVisibleText("UFT/QTP");
		s.deselectByValue("3");

		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		System.out.println("-----------------");

		List<WebElement> list1 = s.getOptions();
		for (WebElement webElement : list1) {
			String text1 = webElement.getText();

			System.out.println(text1);
		}

		System.out.println();

		List<WebElement> list2 = s.getAllSelectedOptions();
		for (WebElement webElement2 : list2) {

			String text2 = webElement2.getText();

			System.out.println(text2);
		}
		System.out.println();

		WebElement first = s.getFirstSelectedOption();
		String text3 = first.getText();
		System.out.println(text3);

	}

}
