package com.selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java\\Selenium_practice\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/Link.html");
		
		

		WebElement homepage = driver.findElement(By.linkText("Go to Home Page"));
		homepage.click();
		driver.navigate().back();
		
		WebElement wherepage = driver.findElement(By.partialLinkText("Find where"));
		String where = wherepage.getAttribute("href");
		System.out.println("the link is going to " +where);
		
		WebElement brokenpage = driver.findElement(By.linkText("Verify am I broken?"));
		brokenpage.click();
		String title = driver.getTitle();
		if(title.contains("404")) {
			System.out.println("the link is broken");
		}else {
			System.out.println("the link is Not broken");
		}
		
		driver.navigate().back();
		
		WebElement homepage1 = driver.findElement(By.linkText("Go to Home Page"));
		homepage1.click();
		driver.navigate().back();
		
		List<WebElement> totallinks = driver.findElements(By.tagName("a"));
		int count = totallinks.size();
		System.out.println("total link is : "+count);


	}

}
