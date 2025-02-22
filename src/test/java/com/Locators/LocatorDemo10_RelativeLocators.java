package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class LocatorDemo10_RelativeLocators {

	public static void main(String[] args)
	{
		// create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/login.html");
		
		//find the searchbox which is left of signin-toLeftOf()
		driver.findElement(RelativeLocator.with(By.xpath("//input[@aria-label='Search']")).toLeftOf(By.linkText("Sign In"))).sendKeys("testng");
		
		//find the search box which is right of Customer service element
		driver.findElement(RelativeLocator.with(By.xpath("//input[@aria-label='Search']")).toRightOf(By.linkText("Customer Service"))).clear();
		
		//find the email which is above password
		driver.findElement(RelativeLocator.with(By.id("email-id")).above(By.id("password"))).sendKeys("test@gmail.com");
		
		//find the password which is below email
		driver.findElement(RelativeLocator.with(By.id("password")).below(By.id("email-id"))).sendKeys("test123");
		
		
		//find the check box which is near Remember me text
		driver.findElement(RelativeLocator.with(By.id("remember")).near(By.xpath("//label[text()='Remember me']"))).click();
		
		
		//find the submit button which is below checkbox
		driver.findElement(RelativeLocator.with(By.id("submit-id")).below(By.id("remember"))).click();
		
		
		
		

	}

}
