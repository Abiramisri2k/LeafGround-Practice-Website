package com.selenium_Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Complete {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\java\\Selenium_practice\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		WebElement name = driver.findElement(By.id("tags"));
		name.sendKeys("s");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		
		System.out.println(options.size());
		
		
		for (WebElement webElement : options)
		{
			if(webElement.getText().equals("SOAP")) 
			{
				webElement.click();
				
				break;
				}
			
		}

	}

}
