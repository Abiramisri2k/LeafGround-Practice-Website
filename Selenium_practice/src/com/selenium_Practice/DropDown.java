package com.selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\java\\Seleniumpractice\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select select1 = new Select(dropdown1);
		select1.selectByIndex(1);
		
		WebElement dropdown2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/select"));
		Select select2 = new Select(dropdown2);
		select2.selectByVisibleText("Loadrunner");
		
		WebElement dropdown3 = driver.findElement(By.xpath("//*[@id=\'dropdown3\']"));
		Select select3 = new Select(dropdown3);
		select3.selectByValue("2");
		
		List<WebElement> listofoptions = select1.getOptions();
		int size = listofoptions.size();
		System.out.println("number is : "+size);
		
		dropdown1.sendKeys("Loadrunner");
		
		WebElement Mutliplebox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		
		Select Multiplebox = new Select(Mutliplebox);
		
		Multiplebox.selectByIndex(1);
		Multiplebox.selectByIndex(2);
		Multiplebox.selectByIndex(3);
		Multiplebox.selectByIndex(4);
		

	}

}
