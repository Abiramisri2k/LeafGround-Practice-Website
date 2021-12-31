package com.selenium_Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\java\\Selenium_practice\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/mouseOver.html#");
		
		
		
		Actions test1=new Actions(driver);
		
        WebElement test=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[5]/ul/li/a"));
		
		test1.moveToElement(test).build().perform();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		List<WebElement> listofoptions = driver.findElements(By.tagName("a"));
		
		for(WebElement options:listofoptions) {
			
			String listelement = options.getText();
			
			System.out.println(listelement);
		}
		
		WebElement options1=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[5]/ul/li/ul/li[3]/a"));
		
		options1.click();
		
		Alert btn=driver.switchTo().alert();
		btn.accept();
		

	}

}
