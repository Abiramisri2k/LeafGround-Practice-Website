package com.selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java\\Selenium_practice\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/Calendar.html");
		
		WebElement calendar = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
		calendar.click();
		
		WebElement nextelement = driver.findElement(By.xpath("//a[@title='Next']"));
		nextelement.click();
		
		WebElement gotobtn = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		gotobtn.click();
		

	}

}
