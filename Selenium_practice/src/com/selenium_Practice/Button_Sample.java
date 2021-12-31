package com.selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java\\Selenium_practice\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/Button.html");

		WebElement getposition = driver.findElement(By.id("position"));
		Point xyvalue = getposition.getLocation();
		int xvalue = xyvalue.getX();
		int yvalue = xyvalue.getY();
		System.out.println("x value is : "+xvalue + "\n" +"y value is : "+yvalue);

		WebElement getcolor = driver.findElement(By.id("color"));
		String color = getcolor.getCssValue("background-color");
		System.out.println("color is :" +color);

		WebElement getsize = driver.findElement(By.id("size"));
		int height = getsize.getSize().getHeight();
		int width = getsize.getSize().getWidth();
		System.out.println("height is : "+height+"\n"+"width is : "+width);

		WebElement homebutton = driver.findElement(By.id("home"));
		homebutton.click();


	}

}
