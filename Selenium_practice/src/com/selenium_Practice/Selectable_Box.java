package com.selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable_Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\java\\Selenium_practice\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement> selectableitem = driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(selectableitem.get(0));
		action.clickAndHold(selectableitem.get(1));
		action.clickAndHold(selectableitem.get(2));
		action.clickAndHold(selectableitem.get(3));
		action.build().perform();
		
	}

}
