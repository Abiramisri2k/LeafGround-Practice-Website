package com.selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java\\Selenium_practice\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/sortable.html");
		
		List<WebElement> element  = driver.findElements(By.xpath("//*[@id=\"sortable\"]/li")); 
		
		WebElement fromelement = element.get(6);
		WebElement toelement = element.get(0);
		
		Actions actions = new Actions(driver);
		
		actions.clickAndHold(fromelement);
		actions.moveToElement(toelement).build().perform();

	}

}
