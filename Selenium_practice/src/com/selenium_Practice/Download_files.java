package com.selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download_files {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java\\Selenium_practice\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/download.html");
		
		driver.findElement(By.linkText("Download Excel")).click();
		
		driver.findElement(By.linkText("Download PDF")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.linkText("Download Text")).click();

	}

}
