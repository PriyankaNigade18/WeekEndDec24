package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2_LinkTextPartialLinkText {

	public static void main(String[] args)
	{
		//ctrl+shift+o
		//Create a driver session
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
		//signIn link
		//NoSuchElementException
		//driver.findElement(By.linkText("In")).click();
		// By linkText
		//driver.findElement(By.linkText("Sign In")).click();
		
		
		
		//partialLinkText
		driver.findElement(By.partialLinkText("In")).click();

		//Login page
		
		
	//email
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		
		//password
		driver.findElement(By.name("password-name")).sendKeys("test123");
		
		//checkbox
		driver.findElement(By.id("remember")).click();
		
		//Submit button-InvalidSelectorException: Compound class names not permitted
		//driver.findElement(By.className("btn btn-default btn-primary")).click();
		
		driver.findElement(By.className("btn-primary")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
