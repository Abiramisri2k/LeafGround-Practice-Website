package com.selenium_Practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java\\Selenium_practice\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/Window.html");
		
		String windowspage = driver.getWindowHandle();
		
		WebElement fristwindow = driver.findElement(By.xpath("//*[@id=\"home\"]"));
		fristwindow.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for (String newpage : handles) {
			
			driver.switchTo().window(newpage);
			
		}
		
		WebElement editpage = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));
		editpage.click();
		driver.close();
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.switchTo().window(windowspage);
		
		WebElement multiplepage = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		multiplepage.click();
		
		int size = driver.getWindowHandles().size();
		System.out.println(size);
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		WebElement closeme = driver.findElement(By.id("color"));
		closeme.click();
		
		Set<String> newhandles = driver.getWindowHandles();
		
		for (String windows : newhandles) {
			
			if(!windows.equals(windowspage)) {
				 driver.switchTo().window(windows);
				 driver.close();
				 
			}
		
				
		}
		
		driver.switchTo().window(windowspage);
		
		WebElement waitpage = driver.findElement(By.xpath("//*[@id=\"color\"]"));
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		waitpage.click();
		
		 driver.quit();

	}

}
