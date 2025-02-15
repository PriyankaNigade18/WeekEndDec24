package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo1_Id_Name {

	public static void main(String[] args)
	{
		//create  driver session
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		
		//email-By id
		driver.findElement(By.id("input-email")).sendKeys("priyankatest123@gmail.com");
		
		
		//password By name
		driver.findElement(By.name("password")).sendKeys("test123");
		
		
		//login By className
		//InvalidSelectorException: Compound class names not permitted
		//driver.findElement(By.className("btn btn-primary")).click();
		//continue button click
		//driver.findElement(By.className("btn-primary")).click();
		
		//click on login
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		
		
		
		
		
		
		

	}

}
