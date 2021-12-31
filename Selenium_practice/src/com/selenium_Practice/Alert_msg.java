package com.selenium_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_msg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java\\Selenium_practice\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement Alertbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		String text=Alertbox.getText();
		System.out.println(text);
		Alertbox.click();
		
		Alert Alert = driver.switchTo().alert();	
		Alert.accept();
		
		WebElement confirmbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		
		confirmbox.click();
		Alert confirm = driver.switchTo().alert();
		confirm.dismiss();
		
		WebElement promptbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		
		promptbox.click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("aaa");
		
	    prompt.accept();
	    
	   
		
		
		

	}

}