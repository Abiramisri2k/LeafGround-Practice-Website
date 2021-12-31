package com.selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java\\Selenium_practice\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/drag.html");

		WebElement From = driver.findElement(By.id("draggable"));

		WebElement To = driver.findElement(By.xpath("//*[@id=\"mydiv\"]"));

		Actions actions = new Actions(driver);

		actions.dragAndDrop(From, To).build().perform();

	}

}
